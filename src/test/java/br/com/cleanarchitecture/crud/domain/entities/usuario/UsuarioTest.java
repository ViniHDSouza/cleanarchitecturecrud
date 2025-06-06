package br.com.cleanarchitecture.crud.domain.entities.usuario;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.cleanarchitecture.crud.core.domain.entities.usuario.Usuario;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertThrows;


class UsuarioTest {


    @Test
    public void naoDeveCadastrarUsuarioComCpfNoFormatoInvalido() {

        assertThrows(IllegalArgumentException.class,
                () -> new Usuario("12345678999", "Jacque", LocalDate.parse("1990-09-08"), "email@email.com", "(11)1111-1111"));
    }

    @Test
    public void deveCadastrarUsuarioComDadosFormatoCorreto() {

        Usuario usuario = new Usuario("123.456.789-99", "Jacque", LocalDate.parse("1990-09-08"), "email@email.com","(11)1111-1111");
        Assertions.assertDoesNotThrow(() ->usuario);

    }

    @Test
    public void naoDeveCadastrarUsuarioComTelefoneNoFormatoInvalido() {

        assertThrows(IllegalArgumentException.class,
                () -> new Usuario("123.456.789-99", "Jacque", LocalDate.parse("1990-09-08"), "email@email.com","(11)1111-111"));


    }


}