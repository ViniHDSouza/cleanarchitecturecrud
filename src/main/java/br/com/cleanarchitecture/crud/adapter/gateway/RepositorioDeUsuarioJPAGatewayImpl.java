package br.com.cleanarchitecture.crud.adapter.gateway;

import java.util.List;
import java.util.stream.Collectors;

import br.com.cleanarchitecture.crud.adapter.mapper.UsuarioEntityMapper;
import br.com.cleanarchitecture.crud.adapter.persistence.UsuarioEntity;
import br.com.cleanarchitecture.crud.adapter.persistence.UsuarioRepository;
import br.com.cleanarchitecture.crud.core.domain.entities.usuario.Usuario;
import br.com.cleanarchitecture.crud.core.gateways.UsuarioGateway;

public class RepositorioDeUsuarioJPAGatewayImpl implements UsuarioGateway {

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

        return usuarioRepository
                .findAll()
                .stream()
                .map(usuarioEntityMapper::toDomain)
                .collect(Collectors.toList());

    }
}
