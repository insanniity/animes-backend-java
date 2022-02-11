package br.com.insannity.animes.services.impl;

import br.com.insannity.animes.payloads.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserServiceImpl {

    Page<UserDTO> findAll(Pageable pageable);
    UserDTO save(UserDTO userDTO);
    UserDTO update(Long id, UserDTO userDTO);
    UserDTO findById(Long id);
    void delete(Long id);

}
