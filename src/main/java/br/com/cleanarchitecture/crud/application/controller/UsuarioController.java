package br.com.cleanarchitecture.crud.application.controller;

import br.com.cleanarchitecture.crud.domain.usecases.CriarUsuarioUseCase;
import br.com.cleanarchitecture.crud.domain.usecases.ListarUsuariosUseCase;
import br.com.cleanarchitecture.crud.domain.entities.usuario.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final CriarUsuarioUseCase criarUsuarioUseCase;
    private final ListarUsuariosUseCase listarUsuariosUseCase;

    public UsuarioController(CriarUsuarioUseCase criarUsuarioUseCase, ListarUsuariosUseCase listarUsuariosUseCase) {
        this.criarUsuarioUseCase = criarUsuarioUseCase;
        this.listarUsuariosUseCase = listarUsuariosUseCase;
    }

    @PostMapping
    public UsuarioResponseDto cadastrarUsuario(@RequestBody UsuarioRequestDto dto) {
        Usuario usuario = new Usuario(
                dto.cpf(),
                dto.nome(),
                dto.nascimento(),
                dto.email(),
                dto.telefone());

        Usuario salvo = criarUsuarioUseCase.cadastrarUsuario(usuario);

        return new UsuarioResponseDto(salvo.getId(),salvo.getCpf().toString(), salvo.getNome(), salvo.getNascimento(), salvo.getEmail().toString(),salvo.getTelefone().toString());

    }

    @GetMapping
    public List<UsuarioResponseDto> listarUsuarios() {
        List<Usuario> listar=listarUsuariosUseCase.listarUsuarios();
        return listar.stream()
                .map(usuario -> new UsuarioResponseDto(usuario.getId(), usuario.getCpf().toString(), usuario.getNome(),usuario.getNascimento(), usuario.getEmail().toString(),usuario.getTelefone().toString()))
                .collect(Collectors.toList());
    }
}
