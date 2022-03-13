package br.com.insannity.animes.services;

import br.com.insannity.animes.entities.Anime;
import br.com.insannity.animes.exceptions.DatabaseException;
import br.com.insannity.animes.exceptions.NotFoundException;
import br.com.insannity.animes.payloads.AnimeDTO;
import br.com.insannity.animes.repositories.AnimeRepository;
import br.com.insannity.animes.services.impl.AnimeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnimeService implements AnimeServiceImpl {

    @Autowired
    private AnimeRepository repository;

    @Transactional(readOnly = true)
    public Page<AnimeDTO> findAll (Pageable pageable) {
        Page<Anime> page = repository.findAll(pageable);
        return page.map(AnimeDTO::new);
    }

    @Transactional(readOnly = true)
    public AnimeDTO findById(Long id) {
        Anime entity = repository.getById(id);
        return new AnimeDTO(entity);
    }

    @Transactional
    public AnimeDTO insertNew(AnimeDTO dto){
        Anime entity = new Anime();
        copyDotToEntity(dto, entity);
        entity.setRating(0.0);
        entity.setCount(0);
        entity = repository.save(entity);
        return new AnimeDTO(entity);
    }

    @Transactional
    public AnimeDTO update(Long id, AnimeDTO dto){
        Anime entity = repository.getById(id);
        copyDotToEntity(dto, entity);
        entity = repository.save(entity);
        return new AnimeDTO(entity);
    }

    @Transactional
    public void delete(Long id) {
        try {
            repository.deleteById(id);
        }catch (EmptyResultDataAccessException e){
            throw new NotFoundException("Id não encontrado: "+ id);
        }catch (DataIntegrityViolationException e){
            throw new DatabaseException("Violação de integridade.");
        }
    }


    private void copyDotToEntity(AnimeDTO dto, Anime entity){
        entity.setTitle(dto.getTitle());
        entity.setDescription(dto.getDescription());
        entity.setImage(dto.getImage());
        entity.setRating(dto.getRating());
        entity.setCount(dto.getCount());
    }




}
