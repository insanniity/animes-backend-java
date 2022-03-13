package br.com.insannity.animes.repositories;

import br.com.insannity.animes.entities.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimeRepository extends JpaRepository<Anime, Long> {
}
