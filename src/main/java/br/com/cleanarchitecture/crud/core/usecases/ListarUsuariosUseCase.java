package br.com.cleanarchitecture.crud.core.usecases;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.cleanarchitecture.crud.core.domain.entities.usuario.Usuario;
import br.com.cleanarchitecture.crud.core.gateways.UsuarioGateway;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ListarUsuariosUseCase {

    private final UsuarioGateway repositorioDeUsuariosGateway;

    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = repositorioDeUsuariosGateway.listarTodos();
        return usuarios;
    }
}
