package com.desafio.cadastro.repository;

import com.desafio.cadastro.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
