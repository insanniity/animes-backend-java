package br.com.insannity.animes.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Embeddable
public class RatingPK implements Serializable{
    
    @ManyToOne
    @JoinColumn(name = "anime_id")
    private Anime anime;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    
}
