package com.desafio.cadastro.dto;

import com.desafio.cadastro.model.User;

public record UserResponseDTO(Long id, String name, String email, String password) {
     public UserResponseDTO(User user){
         this(user.getId(),user.getName(),user.getEmail(), user.getPassword());
     }
}
