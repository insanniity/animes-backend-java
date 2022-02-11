package br.com.insannity.animes.controllers;

import br.com.insannity.animes.payloads.AnimeDTO;
import br.com.insannity.animes.payloads.RatingDTO;
import br.com.insannity.animes.services.RatingService;
import br.com.insannity.animes.services.impl.RatingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/rating")
public class RatingController {

    @Autowired
    private RatingServiceImpl service;

    @GetMapping
    public ResponseEntity<Page<RatingDTO>> getAll(Pageable pageable) {
        return ResponseEntity.ok(service.findAll(pageable));
    }

    @PutMapping
    public ResponseEntity<AnimeDTO> saveRating(@RequestBody RatingDTO ratingDTO){
       AnimeDTO animeDTO = service.saveRating(ratingDTO);
        return ResponseEntity.ok(animeDTO);
    }

    @DeleteMapping("/{animeId}/{userId}")
    public ResponseEntity<?> delete( @PathVariable Long animeId, @PathVariable Long userId){
        service.deleteRating(animeId, userId);
        return ResponseEntity.noContent().build();
    }



}
