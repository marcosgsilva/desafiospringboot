package com.desafio.cadastro.controller;

import com.desafio.cadastro.dto.UserRequestDTO;
import com.desafio.cadastro.dto.UserResponseDTO;
import com.desafio.cadastro.model.ResponseApi;
import com.desafio.cadastro.service.UserService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

@Tag(name = "Usuários", description = "Cadatro de usuários")
@RestController
@RequestMapping("api")
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service){
        this.service = service;
    }


    @CrossOrigin(origins =  "*", allowedHeaders = "*")
    @PostMapping("/users")
    @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema()) })
    @ApiResponse(responseCode = "400", content = { @Content(schema = @Schema()) })
    public ResponseEntity<ResponseApi> saveMode(@RequestBody @Valid UserRequestDTO data){
        ResponseApi response = new ResponseApi("Usuário criado com sucesso");
        service.save(data);
        return ResponseEntity.ok(response);
    }

    @CrossOrigin(origins =  "*", allowedHeaders = "*")
    @GetMapping("/users")
    public List<UserResponseDTO> getAll(){
        List<UserResponseDTO> user = service.getAll();
        return user;
    }
}
