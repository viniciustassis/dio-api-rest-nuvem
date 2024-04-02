package br.com.vta.apirest.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vta.apirest.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
