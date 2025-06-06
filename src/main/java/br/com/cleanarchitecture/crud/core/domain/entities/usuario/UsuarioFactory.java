package br.com.cleanarchitecture.crud.core.domain.entities.usuario;

import java.time.LocalDate;

import br.com.cleanarchitecture.crud.core.domain.vo.Endereco;

public interface UsuarioFactory {
    Usuario criarUsuario(String nome, String cpf, LocalDate nascimento, String email, String telefone);
    Endereco criarEndereco(String cep, Integer numero, String complemento);
}