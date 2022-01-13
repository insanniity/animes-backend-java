package br.com.insannity.animes.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RatingDTO {

    private Long animeId;
    private String email;
    private Double rating;

}
