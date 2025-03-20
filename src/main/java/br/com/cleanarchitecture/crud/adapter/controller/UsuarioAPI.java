package br.com.cleanarchitecture.crud.adapter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@RequestMapping("/usuarios")
public interface UsuarioAPI {

    @PostMapping
    UsuarioResponseDto cadastrarUsuario(@RequestBody UsuarioRequestDto dto);

    @GetMapping
    List<UsuarioResponseDto> listarUsuarios();
}
