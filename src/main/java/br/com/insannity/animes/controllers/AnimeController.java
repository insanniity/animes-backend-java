package br.com.insannity.animes.controllers;

import br.com.insannity.animes.payloads.AnimeDTO;
import br.com.insannity.animes.services.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/animes")
public class AnimeController {

    @Autowired
    private AnimeService service;

    @GetMapping
    public ResponseEntity<Page<AnimeDTO>> findAll(Pageable pageable){
        Page<AnimeDTO> page = service.findAll(pageable);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnimeDTO> findByid(@PathVariable Long id, Pageable pageable){
        AnimeDTO anime = service.findById(id, pageable);
        return ResponseEntity.ok(anime);
    }




}
