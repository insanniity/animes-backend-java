package br.com.insannity.animes.services.impl;

import br.com.insannity.animes.payloads.AnimeDTO;
import br.com.insannity.animes.payloads.RatingDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RatingServiceImpl {

    Page<RatingDTO> findAll(Pageable pageable);
    AnimeDTO saveRating(RatingDTO ratingDTO);
    void deleteRating(Long animeId, Long userId);

}
