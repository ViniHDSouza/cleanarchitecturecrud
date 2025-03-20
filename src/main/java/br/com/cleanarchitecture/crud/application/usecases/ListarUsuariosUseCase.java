package br.com.cleanarchitecture.crud.application.usecases;

import br.com.cleanarchitecture.crud.application.gateways.RepositorioDeUsuariosGateway;
import br.com.cleanarchitecture.crud.domain.entities.usuario.Usuario;

import java.util.List;

public class ListarUsuariosUseCase {

    private final RepositorioDeUsuariosGateway repositorioDeUsuariosGateway;

    public ListarUsuariosUseCase(RepositorioDeUsuariosGateway repositorioDeUsuariosGateway) {
        this.repositorioDeUsuariosGateway = repositorioDeUsuariosGateway;
    }

    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = repositorioDeUsuariosGateway.listarTodos();
        return usuarios;
    }
}
