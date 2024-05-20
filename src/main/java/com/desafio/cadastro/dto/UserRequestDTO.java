package com.desafio.cadastro.dto;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequestDTO {

    @NotEmpty(message = "O nome não pode ser nulo")
    @Size(min = 3, max = 50, message = "O nome deve ter entre 3 e 50 caracteres")
    private String name;

    @NotEmpty(message = "O email não pode estar vazio")
    @Email(message = "Email inválido")
    private String email;

    @NotEmpty(message = "A senha não pode estar vazia")
    @Size(min = 6, max = 20, message = "A senha deve ter entre 3 e 50 caracteres")
    private String password;
}