package br.com.cleanarchitecture.crud.domain.entities.usuario;

import br.com.cleanarchitecture.crud.domain.vo.Endereco;

import java.time.LocalDate;

public class UsuarioBuilderFactory implements UsuarioFactory {

    @Override
    public Usuario criarUsuario(String nome, String cpf, LocalDate nascimento, String email, String telefone) {
        return new Usuario(cpf, nome, nascimento, email, telefone);
    }

    @Override
    public Endereco criarEndereco(String cep, Integer numero, String complemento) {
        return new Endereco(cep, numero, complemento);
    }
}