package br.com.insannity.animes.controllers;

import br.com.insannity.animes.payloads.AnimeDTO;
import br.com.insannity.animes.payloads.RatingDTO;
import br.com.insannity.animes.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/rating")
public class RatingController {

    @Autowired
    private RatingService service;

    @PutMapping
    public ResponseEntity<AnimeDTO> saveRating(@RequestBody RatingDTO ratingDTO){
       AnimeDTO animeDTO = service.saveRating(ratingDTO);
        return ResponseEntity.ok(animeDTO);
    }

}
