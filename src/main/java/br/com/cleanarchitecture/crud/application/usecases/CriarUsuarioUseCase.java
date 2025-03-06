package br.com.cleanarchitecture.crud.application.usecases;

import br.com.cleanarchitecture.crud.application.gateways.RepositorioDeUsuarios;
import br.com.cleanarchitecture.crud.domain.entities.usuario.Usuario;

public class CriarUsuarioUseCase {

    private final RepositorioDeUsuarios repositorioDeUsuarios;

    public CriarUsuarioUseCase(RepositorioDeUsuarios repositorioDeUsuarios) {
        this.repositorioDeUsuarios = repositorioDeUsuarios;
    }

    public Usuario cadastrarUsuario(Usuario usuario) {
        Usuario usuarioSalvo = repositorioDeUsuarios.cadastrarUsuario(usuario);
        return usuarioSalvo;
    }
}
