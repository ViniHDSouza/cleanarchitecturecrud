package br.com.cleanarchitecture.crud.core.domain.entities.usuario;

import java.time.LocalDate;

import br.com.cleanarchitecture.crud.core.domain.vo.Endereco;

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