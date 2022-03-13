package br.com.insannity.animes.services;

import br.com.insannity.animes.entities.User;
import br.com.insannity.animes.exceptions.DatabaseException;
import br.com.insannity.animes.exceptions.NotFoundException;
import br.com.insannity.animes.payloads.UserDTO;
import br.com.insannity.animes.repositories.RoleRepository;
import br.com.insannity.animes.repositories.UserRepository;
import br.com.insannity.animes.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService implements UserServiceImpl {

    @Autowired
    private UserRepository repository;

    @Autowired
    private RoleRepository roleRepository;

    @Transactional(readOnly = true)
    public Page<UserDTO> findAll(Pageable pageable, String role) {
        if(role.isEmpty()){
            return repository.findAll(pageable).map(UserDTO::new);
        }else{
            return repository.findByRoleAuthority(role, pageable).map(UserDTO::new);
        }
    }

    @Transactional(readOnly = true)
    public UserDTO findById(Long id) {
        return new UserDTO(repository.getById(id));
    }

    public UserDTO save(UserDTO userDTO) {
        User user = new User();
        copyDtoToEntity(userDTO, user);
        user = repository.save(user);
        return new UserDTO(user);
    }


    public UserDTO update(Long id, UserDTO userDTO) {
        User user = repository.getById(id);
        copyDtoToEntity(userDTO, user);
        user = repository.save(user);
        return new UserDTO(user);
    }



    public void delete(Long id) {
        try {
            repository.deleteById(id);
        }catch (EmptyResultDataAccessException e){
            throw new NotFoundException("Id não encontrado: " + id);
        }catch (DataIntegrityViolationException e){
            throw new DatabaseException("Violação de integridade.");
        }
    }

    private void copyDtoToEntity(UserDTO userDTO, User user) {
        user.setNome(userDTO.getNome());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setRole(roleRepository.findByAuthority(userDTO.getRole()));
    }


}
