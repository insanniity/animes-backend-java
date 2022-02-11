package br.com.insannity.animes.repositories;

import br.com.insannity.animes.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
