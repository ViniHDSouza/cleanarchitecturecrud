package br.com.cleanarchitecture.crud.core.domain.entities.usuario;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

import br.com.cleanarchitecture.crud.core.domain.vo.CPF;
import br.com.cleanarchitecture.crud.core.domain.vo.Email;
import br.com.cleanarchitecture.crud.core.domain.vo.Endereco;
import br.com.cleanarchitecture.crud.core.domain.vo.Telefone;

@Setter//FIXME: Não usar setter (em nenhuma classe)
@Getter
@EqualsAndHashCode
public class Usuario {

    private Integer id;
    private CPF cpf;
    private String nome;
    private LocalDate nascimento;
    private Email email;
    private Telefone telefone;
    private Endereco endereco;

    //Se aumentar a qnt de contrutor, considere usar um factory
    public Usuario(Integer id,String cpf, String nome, LocalDate nascimento, String email, String telefone) {
        this(cpf, nome, nascimento, email, telefone);
        this.id = id;
        validadeIdadeUsuario(nascimento);
    }

    public Usuario(String cpf, String nome, LocalDate nascimento, String email, String telefone) {
        this.cpf = new CPF(cpf);
        this.nome = nome;
        this.nascimento = nascimento;
        this.email = new Email(email);
        this.telefone = new Telefone(telefone);
        validadeIdadeUsuario(nascimento);
    }

    public Usuario() {}

    private void validadeIdadeUsuario(LocalDate nascimento) {
        boolean valida = LocalDate.now().getYear() - nascimento.getYear() >= 18;
        if (!valida) {
            throw new IllegalArgumentException("Usuario menor de idade");//FIXME: criar uma exceção especifica
        }
    }

}
