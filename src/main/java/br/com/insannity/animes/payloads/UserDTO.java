package br.com.insannity.animes.payloads;

import br.com.insannity.animes.entities.Role;
import br.com.insannity.animes.entities.User;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserDTO {

    private Long id;
    private String nome;
    @Email
    private String email;
    private String password;
    private String role;
    private boolean ativo;

    public UserDTO(User user) {
        this.id = user.getId();
        this.nome = user.getNome();
        this.email = user.getEmail();
        this.role = user.getRole().getAuthority();
        this.ativo = user.isAtivo();
    }


}
