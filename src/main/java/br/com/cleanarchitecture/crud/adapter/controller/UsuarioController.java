package br.com.cleanarchitecture.crud.adapter.controller;

import java.util.List;



public interface UsuarioController {


    UsuarioResponseDto cadastrarUsuario(UsuarioRequestDto dto);

    List<UsuarioResponseDto> listarUsuarios();
}
