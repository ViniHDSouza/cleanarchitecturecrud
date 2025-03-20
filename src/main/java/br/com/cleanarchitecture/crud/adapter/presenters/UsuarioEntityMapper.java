package br.com.cleanarchitecture.crud.adapter.presenters;

import br.com.cleanarchitecture.crud.domain.entities.usuario.Usuario;
import br.com.cleanarchitecture.crud.adapter.persistence.UsuarioEntity;

public class UsuarioEntityMapper {

    public UsuarioEntity toEntity(Usuario usuario){
        return new UsuarioEntity(
                usuario.getCpf().toString(),
                usuario.getNome(),
                usuario.getNascimento(),
                usuario.getEmail().toString(),
                usuario.getTelefone().toString());
    }


    public Usuario toDomain(UsuarioEntity entity){
        return new Usuario(
                entity.getId().intValue(),
                entity.getCpf(),
                entity.getNome(),
                entity.getNascimento(),
                entity.getEmail(),
                entity.getTelefone());
    }
}
