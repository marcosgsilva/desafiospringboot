package com.desafio.cadastro.model;

import com.desafio.cadastro.dto.UserRequestDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="TB_USUARIO")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "nome")
    private String name;

    private String email;

    @Column(name = "senha")
    private String password;

    public User(UserRequestDTO data) {
        this.name = data.getName();
        this.email = data.getEmail();
        this.password = data.getPassword();
    }


}
