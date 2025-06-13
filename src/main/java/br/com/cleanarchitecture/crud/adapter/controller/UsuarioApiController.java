package br.com.cleanarchitecture.crud.adapter.controller;

import br.com.cleanarchitecture.crud.adapter.mapper.UsuarioEntityMapper;
import br.com.cleanarchitecture.crud.core.domain.entities.usuario.Usuario;
import br.com.cleanarchitecture.crud.core.usecases.CriarUsuarioUseCase;
import br.com.cleanarchitecture.crud.core.usecases.ListarUsuariosUseCase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioApiController implements UsuarioController {

    private final CriarUsuarioUseCase criarUsuarioUseCase;
    private final ListarUsuariosUseCase listarUsuariosUseCase;

    public UsuarioApiController(CriarUsuarioUseCase criarUsuarioUseCase, ListarUsuariosUseCase listarUsuariosUseCase) {
        this.criarUsuarioUseCase = criarUsuarioUseCase;
        this.listarUsuariosUseCase = listarUsuariosUseCase;
    }

    @Override
    @PostMapping
    public UsuarioResponseDto cadastrarUsuario(@RequestBody UsuarioRequestDto dto) {

        Usuario usuario = UsuarioEntityMapper.toDomain(dto);
        Usuario salvo = criarUsuarioUseCase.cadastrarUsuario(usuario);
        return UsuarioEntityMapper.toResponseDto(salvo);
    }

    @Override
    @GetMapping
    public List<UsuarioResponseDto> listarUsuarios() {
        List<Usuario> listar=listarUsuariosUseCase.listarUsuarios();
        return listar.stream()
                .map(UsuarioEntityMapper::toResponseDto)
                .collect(Collectors.toList());
    }
}
