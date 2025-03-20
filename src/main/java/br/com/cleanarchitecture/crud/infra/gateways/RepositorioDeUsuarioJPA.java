package br.com.cleanarchitecture.crud.infra.gateways;

import br.com.cleanarchitecture.crud.application.gateways.RepositorioDeUsuarios;
import br.com.cleanarchitecture.crud.domain.entities.usuario.Usuario;
import br.com.cleanarchitecture.crud.infra.persistence.UsuarioEntity;
import br.com.cleanarchitecture.crud.infra.persistence.UsuarioRepository;
import br.com.cleanarchitecture.crud.infra.presenters.UsuarioEntityMapper;

import java.util.List;
import java.util.stream.Collectors;

public class RepositorioDeUsuarioJPA implements RepositorioDeUsuarios {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioEntityMapper usuarioEntityMapper;

    public RepositorioDeUsuarioJPA(UsuarioRepository usuarioRepository, UsuarioEntityMapper usuarioEntityMapper) {
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
