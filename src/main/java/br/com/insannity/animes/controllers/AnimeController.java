package br.com.insannity.animes.controllers;

import br.com.insannity.animes.payloads.AnimeDTO;
import br.com.insannity.animes.services.AnimeService;
import br.com.insannity.animes.services.impl.AnimeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;


@RestController
@RequestMapping("/animes")
public class AnimeController {

    @Autowired
    private AnimeServiceImpl service;

    @GetMapping
    public ResponseEntity<Page<AnimeDTO>> findAll(Pageable pageable){
        Page<AnimeDTO> page = service.findAll(pageable);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnimeDTO> findByid(@PathVariable Long id){
        AnimeDTO anime = service.findById(id);
        return ResponseEntity.ok(anime);
    }

    @PostMapping
    public ResponseEntity<AnimeDTO> insertNew(@RequestBody AnimeDTO dto){
        dto = service.insertNew(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AnimeDTO> update(@RequestParam Long id, @RequestBody AnimeDTO dto){
        dto = service.update(id, dto);
        return ResponseEntity.ok(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<AnimeDTO> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }




}
