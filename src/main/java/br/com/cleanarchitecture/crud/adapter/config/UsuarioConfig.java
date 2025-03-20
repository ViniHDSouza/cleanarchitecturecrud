package br.com.cleanarchitecture.crud.adapter.config;


import br.com.cleanarchitecture.crud.application.gateways.RepositorioDeUsuarios;
import br.com.cleanarchitecture.crud.application.usecases.CriarUsuarioUseCase;
import br.com.cleanarchitecture.crud.application.usecases.ListarUsuariosUseCase;
import br.com.cleanarchitecture.crud.adapter.gateways.RepositorioDeUsuarioJPA;
import br.com.cleanarchitecture.crud.adapter.persistence.UsuarioRepository;
import br.com.cleanarchitecture.crud.adapter.presenters.UsuarioEntityMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioConfig {

    @Bean
    CriarUsuarioUseCase criarUsuario(RepositorioDeUsuarios repositorioDeUsuario){
        return new CriarUsuarioUseCase(repositorioDeUsuario);
    }

    @Bean
    ListarUsuariosUseCase listarUsuarios(RepositorioDeUsuarios repositorioDeUsuario){
        return new ListarUsuariosUseCase(repositorioDeUsuario);
    }

    @Bean
    RepositorioDeUsuarioJPA criarRepositorioJpa(UsuarioRepository repositorio, UsuarioEntityMapper mapper){
        return new RepositorioDeUsuarioJPA(repositorio, mapper);
    }

    @Bean
    UsuarioEntityMapper retornaMapper(){
        return new UsuarioEntityMapper();
    }
}