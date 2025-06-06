package br.com.cleanarchitecture.crud.core.domain.entities.usuario;

import java.time.LocalDate;

import br.com.cleanarchitecture.crud.core.domain.vo.Endereco;

// refatorar para implementar o padrao Abstract Factory
public class FabricaDeUsuarioBuilder {

    private Usuario usuario;

    public Usuario comNomeCpfNascimento(String nome, String cpf, LocalDate nascimento,String email,String telefone){
        this.usuario = new Usuario(cpf, nome, nascimento, email,telefone);
        return this.usuario;
    }

    public Usuario incluiEndereco(String cep, Integer numero, String complemento) {
        this.usuario.setEndereco(new Endereco(cep, numero, complemento));
        return this.usuario;
    }

}
