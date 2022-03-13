package br.com.insannity.animes.entities;

import javax.persistence.*;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
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

    @Setter(AccessLevel.PROTECTED)
    @OneToMany(mappedBy = "id.anime", orphanRemoval = true)
    private Set<Rating> ratings = new HashSet<>();


    
}
