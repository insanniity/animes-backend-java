package br.com.insannity.animes.payloads;

import br.com.insannity.animes.entities.Rating;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class RatingDTO {

    private Long animeId;
    private String email;
    private Double value;
    private String comment;

    public RatingDTO(Rating rating) {
        this.animeId = rating.getId().getAnime().getId();
        this.email = rating.getId().getUser().getEmail();
        this.value = rating.getValue();
        this.comment = rating.getComment();
    }

}
