package br.com.insannity.animes.entities;

import javax.persistence.*;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_animes")
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(columnDefinition = "text")
    private String description;
    private String image;
    private Double rating;
    private Integer count;

    @OneToMany(mappedBy = "id.anime")
    @Setter(AccessLevel.PROTECTED)
    private Set<Rating> ratings = new HashSet<>();


    
}
