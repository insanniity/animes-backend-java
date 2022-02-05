package br.com.insannity.animes.payloads;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class RatingDTO {

    private Long animeId;
    private String email;
    private Double rating;

}
