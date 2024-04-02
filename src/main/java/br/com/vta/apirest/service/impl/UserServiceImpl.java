package br.com.vta.apirest.service.impl;

import org.springframework.stereotype.Service;

import br.com.vta.apirest.domain.model.User;
import br.com.vta.apirest.domain.repository.UserRepository;
import br.com.vta.apirest.service.UserService;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        return userRepository.save(userToCreate);
    }
}
