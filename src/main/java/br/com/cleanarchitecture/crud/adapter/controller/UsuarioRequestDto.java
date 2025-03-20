package br.com.cleanarchitecture.crud.adapter.controller;

import java.time.LocalDate;

public record UsuarioRequestDto(
        String cpf,
        String nome,
        LocalDate nascimento,
        String email,
        String telefone
) {
}

