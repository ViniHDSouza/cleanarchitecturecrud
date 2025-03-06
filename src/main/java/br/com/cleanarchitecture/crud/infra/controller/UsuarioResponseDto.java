package br.com.cleanarchitecture.crud.infra.controller;

import java.time.LocalDate;

public record UsuarioResponseDto(
        Integer id,
        String cpf,
        String nome,
        LocalDate nascimento,
        String email,
        String telefone
) {

}

