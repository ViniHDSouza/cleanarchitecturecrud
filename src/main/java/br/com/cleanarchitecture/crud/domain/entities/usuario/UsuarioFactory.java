package br.com.cleanarchitecture.crud.domain.entities.usuario;

import br.com.cleanarchitecture.crud.domain.vo.Endereco;

import java.time.LocalDate;

public interface UsuarioFactory {
    Usuario criarUsuario(String nome, String cpf, LocalDate nascimento, String email, String telefone);
    Endereco criarEndereco(String cep, Integer numero, String complemento);
}