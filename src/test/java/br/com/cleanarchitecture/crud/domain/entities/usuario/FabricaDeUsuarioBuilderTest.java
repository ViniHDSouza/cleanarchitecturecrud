package br.com.cleanarchitecture.crud.domain.entities.usuario;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.cleanarchitecture.crud.core.domain.entities.usuario.Usuario;
import br.com.cleanarchitecture.crud.core.domain.entities.usuario.UsuarioBuilderFactory;
import br.com.cleanarchitecture.crud.core.domain.entities.usuario.UsuarioFactory;
import br.com.cleanarchitecture.crud.core.domain.vo.Endereco;

import java.time.LocalDate;

class FabricaDeUsuarioBuilderTest {

    //@Test
    void deveCriarUsuarioComNomeCpfNascimento() {
        UsuarioFactory factoryUsuario = new UsuarioBuilderFactory();

        //FabricaDeUsuarioBuilder builder = new FabricaDeUsuarioBuilder();
        Usuario usuario = factoryUsuario.criarUsuario("Jacque", "123.456.789-99", LocalDate.parse("1990-09-08"),"teste@teste.com","(11)1111-1111");

        assertNotNull(usuario);
        assertEquals("Jacque", usuario.getNome());
        assertEquals("123.456.789-99", usuario.getCpf().getDocument());
        assertEquals(LocalDate.parse("1990-09-08"), usuario.getNascimento());
    }

    //@Test
    void deveIncluirEnderecoNoUsuario() {
        //FabricaDeUsuarioBuilder builder = new FabricaDeUsuarioBuilder();
        UsuarioFactory factoryUsuario = new UsuarioBuilderFactory();

        Usuario usuario = factoryUsuario.criarUsuario("Jacque", "123.456.789-99", LocalDate.parse("1990-09-08"),"teste@teste.com","(11)1111-1111");
        Endereco endereco = factoryUsuario.criarEndereco("12.345-678", 123, "Apto 101");

        //Endereco endereco = usuario.getEndereco();
        assertNotNull(endereco);
        assertEquals("12.345-678", endereco.getCep().getDocument());
        assertEquals(123, endereco.getNumero());
        assertEquals("Apto 101", endereco.getComplemento());
    }
}