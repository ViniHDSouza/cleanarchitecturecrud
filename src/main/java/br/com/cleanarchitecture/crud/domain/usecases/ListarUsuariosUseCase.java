package br.com.cleanarchitecture.crud.domain.usecases;

import br.com.cleanarchitecture.crud.application.gateways.RepositorioDeUsuarios;
import br.com.cleanarchitecture.crud.domain.entities.usuario.Usuario;

import java.util.List;

public class ListarUsuariosUseCase {

    private final RepositorioDeUsuarios repositorioDeUsuarios;

    public ListarUsuariosUseCase(RepositorioDeUsuarios repositorioDeUsuarios) {
        this.repositorioDeUsuarios = repositorioDeUsuarios;
    }

    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = repositorioDeUsuarios.listarTodos();
        return usuarios;
    }
}
