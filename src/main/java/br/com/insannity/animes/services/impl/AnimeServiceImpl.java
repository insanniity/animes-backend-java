package br.com.insannity.animes.services.impl;

import br.com.insannity.animes.payloads.AnimeDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AnimeServiceImpl {

    public Page<AnimeDTO> findAll (Pageable pageable);
    public AnimeDTO findById(Long id);
    public AnimeDTO insertNew(AnimeDTO dto);
    public AnimeDTO update(Long id, AnimeDTO dto);
    public void delete(Long id);
}
