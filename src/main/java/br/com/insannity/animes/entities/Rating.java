package br.com.insannity.animes.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "tb_ratings")
public class Rating {

    @EmbeddedId
    private RatingPK id = new RatingPK();
    private Double value;
    @Column(columnDefinition = "TEXT")
    private String comment;

    
    public void setAnime(Anime anime){
        this.id.setAnime(anime);
    }

    public void setUser(User user){
        this.id.setUser(user);
    }

}
