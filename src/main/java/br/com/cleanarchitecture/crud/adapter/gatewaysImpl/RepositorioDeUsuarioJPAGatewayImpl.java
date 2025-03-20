package br.com.cleanarchitecture.crud.adapter.gatewaysImpl;

import br.com.cleanarchitecture.crud.application.gateways.RepositorioDeUsuariosGateway;
import br.com.cleanarchitecture.crud.domain.entities.usuario.Usuario;
import br.com.cleanarchitecture.crud.adapter.persistence.UsuarioEntity;
import br.com.cleanarchitecture.crud.adapter.persistence.UsuarioRepository;
import br.com.cleanarchitecture.crud.adapter.presenters.UsuarioEntityMapper;

import java.util.List;
import java.util.stream.Collectors;

public class RepositorioDeUsuarioJPAGatewayImpl implements RepositorioDeUsuariosGateway {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioEntityMapper usuarioEntityMapper;

    public RepositorioDeUsuarioJPAGatewayImpl(UsuarioRepository usuarioRepository, UsuarioEntityMapper usuarioEntityMapper) {
        this.usuarioRepository = usuarioRepository;
        this.usuarioEntityMapper = usuarioEntityMapper;
    }

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        UsuarioEntity usuarioEntity = usuarioEntityMapper.toEntity(usuario);
        usuarioRepository.save(usuarioEntity);
        return usuarioEntityMapper.toDomain(usuarioEntity);
    }

    @Override
    public List<Usuario> listarTodos() {

        List<Usuario> usuarios = usuarioRepository
                .findAll()
                .stream()
                .map(usuarioEntityMapper::toDomain)
                .collect(Collectors.toList());

        return usuarios;
    }
}
