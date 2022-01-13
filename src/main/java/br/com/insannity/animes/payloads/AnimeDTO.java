package br.com.insannity.animes.payloads;

import br.com.insannity.animes.entities.Anime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AnimeDTO {

    private Long id;
    private String title;
    private String description;
    private String image;
    private Double rating;
    private Integer count;

    public AnimeDTO(Anime entity){
        id = entity.getId();
        title = entity.getTitle();
        description = entity.getDescription();
        image = entity.getImage();
        rating = entity.getRating();
        count = entity.getCount();
    }

}
