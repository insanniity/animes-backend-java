package br.com.insannity.animes.services;

import br.com.insannity.animes.entities.Anime;
import br.com.insannity.animes.entities.Rating;
import br.com.insannity.animes.entities.RatingPK;
import br.com.insannity.animes.entities.User;
import br.com.insannity.animes.exceptions.DatabaseException;
import br.com.insannity.animes.exceptions.NotFoundException;
import br.com.insannity.animes.payloads.AnimeDTO;
import br.com.insannity.animes.payloads.RatingDTO;
import br.com.insannity.animes.repositories.AnimeRepository;
import br.com.insannity.animes.repositories.RatingRepository;
import br.com.insannity.animes.repositories.UserRepository;
import br.com.insannity.animes.services.impl.RatingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RatingService implements RatingServiceImpl {

    @Autowired
    private AnimeRepository animeRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RatingRepository ratingRepository;

    @Transactional(readOnly = true)
    public Page<RatingDTO> findAll(Pageable pageable) {
        return ratingRepository.findAll(pageable).map(RatingDTO::new);
    }

    @Transactional
    public AnimeDTO saveRating(RatingDTO ratingDTO){
        User user = userRepository.findByEmail(ratingDTO.getEmail());
        if(user == null){
            user = new User();
            user.setEmail(ratingDTO.getEmail());
            user = userRepository.saveAndFlush(user);
        }
        Anime anime = animeRepository.getById(ratingDTO.getAnimeId());
        Rating rating = new Rating();
        rating.setAnime(anime);
        rating.setUser(user);
        rating.setValue(ratingDTO.getValue());
        rating = ratingRepository.saveAndFlush(rating);
        double sum = 0.0;
        for (Rating rate: anime.getRatings()) {
            sum = sum + rate.getValue();
        }
        double avg = sum/ anime.getRatings().size();
        anime.setRating(avg);
        anime.setCount(anime.getRatings().size());
        anime = animeRepository.save(anime);
        return new AnimeDTO(anime);
    }

    @Transactional
    public void deleteRating(Long animeId, Long userId){
        Anime anime = animeRepository.getById(animeId);
        User user = userRepository.getById(userId);
        RatingPK ratingPK = new RatingPK(anime, user);
        Rating rating = ratingRepository.getById(ratingPK);
        anime.getRatings().remove(rating);
        try {
            animeRepository.save(anime);
            ratingRepository.delete(rating);
        }catch (EmptyResultDataAccessException e){
            throw new NotFoundException("Id não encontrado: " + animeId + " - " + userId);
        }catch (DataIntegrityViolationException e){
            throw new DatabaseException("Violação de integridade.");
        }
    }



}
