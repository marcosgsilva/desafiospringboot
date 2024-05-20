package com.desafio.cadastro.service;

import com.desafio.cadastro.dto.UserRequestDTO;
import com.desafio.cadastro.dto.UserResponseDTO;
import com.desafio.cadastro.model.User;
import com.desafio.cadastro.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    private UserRepository repository;
    @Autowired
    public UserService(UserRepository repository){

        this.repository = repository;
    }

    public void save(UserRequestDTO data) {
        User userData=new User(data);
        repository.save(userData);
    }

    public List<UserResponseDTO> getAll(){
        List<UserResponseDTO> user = repository.findAll().stream().map(UserResponseDTO::new).toList();
        return user;
    }
}

