package br.com.cleanarchitecture.crud.application.usecases;

import br.com.cleanarchitecture.crud.application.gateways.RepositorioDeUsuariosGateway;
import br.com.cleanarchitecture.crud.domain.entities.usuario.Usuario;

public class CriarUsuarioUseCase {

    private final RepositorioDeUsuariosGateway repositorioDeUsuariosGateway;

    public CriarUsuarioUseCase(RepositorioDeUsuariosGateway repositorioDeUsuariosGateway) {
        this.repositorioDeUsuariosGateway = repositorioDeUsuariosGateway;
    }

    public Usuario cadastrarUsuario(Usuario usuario) {
        return repositorioDeUsuariosGateway.cadastrarUsuario(usuario);
    }
}
