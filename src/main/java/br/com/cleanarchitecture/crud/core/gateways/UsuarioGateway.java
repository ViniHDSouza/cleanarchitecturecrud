package br.com.cleanarchitecture.crud.core.gateways;


import java.util.List;

import br.com.cleanarchitecture.crud.core.domain.entities.usuario.Usuario;

public interface UsuarioGateway {

    Usuario cadastrarUsuario(Usuario usuario);

    List<Usuario> listarTodos();

}
