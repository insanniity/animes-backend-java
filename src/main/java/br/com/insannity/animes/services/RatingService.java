package br.com.insannity.animes.services;

import br.com.insannity.animes.entities.Anime;
import br.com.insannity.animes.entities.Rating;
import br.com.insannity.animes.entities.User;
import br.com.insannity.animes.payloads.AnimeDTO;
import br.com.insannity.animes.payloads.RatingDTO;
import br.com.insannity.animes.repositories.AnimeRepository;
import br.com.insannity.animes.repositories.RatingRepository;
import br.com.insannity.animes.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RatingService {

    @Autowired
    private AnimeRepository animeRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RatingRepository ratingRepository;

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
        rating.setValue(ratingDTO.getRating());
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



}
