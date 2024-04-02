package br.com.vta.apirest.service;

import br.com.vta.apirest.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
