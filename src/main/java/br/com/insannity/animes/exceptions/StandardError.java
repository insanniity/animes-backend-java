package br.com.insannity.animes.exceptions;

import lombok.*;

import java.io.Serializable;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class StandardError implements Serializable {

    private Instant timestamp = Instant.now();
    private Integer status;
    private String error;
    private String message;
    private String path;

}

