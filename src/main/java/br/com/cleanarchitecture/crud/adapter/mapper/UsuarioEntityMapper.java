package br.com.cleanarchitecture.crud.adapter.mapper;

import br.com.cleanarchitecture.crud.adapter.controller.UsuarioRequestDto;
import br.com.cleanarchitecture.crud.adapter.controller.UsuarioResponseDto;
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

    public static Usuario toDomain(UsuarioRequestDto dto) {
        return new Usuario(
                dto.cpf(),
                dto.nome(),
                dto.nascimento(),
                dto.email(),
                dto.telefone()
        );
    }

    public static UsuarioResponseDto toResponseDto(Usuario usuario) {
        return new UsuarioResponseDto(
                usuario.getId(),
                usuario.getCpf().toString(),
                usuario.getNome(),
                usuario.getNascimento(),
                usuario.getEmail().toString(),
                usuario.getTelefone().toString()
        );
    }
}
