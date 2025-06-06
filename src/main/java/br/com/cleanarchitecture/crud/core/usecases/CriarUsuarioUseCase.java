package br.com.cleanarchitecture.crud.core.usecases;

import org.springframework.stereotype.Service;

import br.com.cleanarchitecture.crud.core.domain.entities.usuario.Usuario;
import br.com.cleanarchitecture.crud.core.gateways.UsuarioGateway;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CriarUsuarioUseCase {

    private final UsuarioGateway repositorioDeUsuariosGateway;

    public Usuario cadastrarUsuario(Usuario usuario) {
        return repositorioDeUsuariosGateway.cadastrarUsuario(usuario);
    }
}
