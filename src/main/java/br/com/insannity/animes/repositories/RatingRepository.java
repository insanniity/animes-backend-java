package br.com.insannity.animes.repositories;

import br.com.insannity.animes.entities.Rating;
import br.com.insannity.animes.entities.RatingPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, RatingPK> {
}
