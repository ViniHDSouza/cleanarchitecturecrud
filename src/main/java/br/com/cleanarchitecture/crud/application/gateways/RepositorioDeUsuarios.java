package br.com.cleanarchitecture.crud.application.gateways;


import br.com.cleanarchitecture.crud.domain.entities.usuario.Usuario;

import java.util.List;

public interface RepositorioDeUsuarios {

    Usuario cadastrarUsuario(Usuario usuario);

    List<Usuario> listarTodos();

}
