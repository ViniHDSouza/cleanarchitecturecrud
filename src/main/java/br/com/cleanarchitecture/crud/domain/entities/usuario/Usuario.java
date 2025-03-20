package br.com.cleanarchitecture.crud.domain.entities.usuario;

import br.com.cleanarchitecture.crud.domain.vo.CPF;
import br.com.cleanarchitecture.crud.domain.vo.Email;
import br.com.cleanarchitecture.crud.domain.vo.Endereco;
import br.com.cleanarchitecture.crud.domain.vo.Telefone;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
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
            throw new IllegalArgumentException("Usuario menor de idade");
        }
    }

}
