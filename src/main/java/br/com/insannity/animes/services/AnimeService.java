package br.com.insannity.animes.services;

import br.com.insannity.animes.entities.Anime;
import br.com.insannity.animes.payloads.AnimeDTO;
import br.com.insannity.animes.repositories.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnimeService {

    @Autowired
    private AnimeRepository repository;


    @Transactional(readOnly = true)
    public Page<AnimeDTO> findAll (Pageable pageable) {
        Page<Anime> page = repository.findAll(pageable);
        return page.map(AnimeDTO::new);
    }

    @Transactional(readOnly = true)
    public AnimeDTO findById(Long id, Pageable pageable) {
        Anime anime = repository.getById(id);
        return new AnimeDTO(anime);
    }
}
