package br.com.cleanarchitecture.crud.adapter.mapper;

import br.com.cleanarchitecture.crud.adapter.persistence.UsuarioEntity;
import br.com.cleanarchitecture.crud.core.domain.entities.usuario.Usuario;

//Não considero como "presenter", e sim como mapper. Mas cabe uma analise do conceito
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
