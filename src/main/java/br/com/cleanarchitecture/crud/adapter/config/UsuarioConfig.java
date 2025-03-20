package br.com.cleanarchitecture.crud.adapter.config;


import br.com.cleanarchitecture.crud.adapter.gateways.RepositorioDeUsuarioJPAGatewayImpl;
import br.com.cleanarchitecture.crud.application.gateways.RepositorioDeUsuariosGateway;
import br.com.cleanarchitecture.crud.application.usecases.CriarUsuarioUseCase;
import br.com.cleanarchitecture.crud.application.usecases.ListarUsuariosUseCase;
import br.com.cleanarchitecture.crud.adapter.persistence.UsuarioRepository;
import br.com.cleanarchitecture.crud.adapter.presenters.UsuarioEntityMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioConfig {

    @Bean
    CriarUsuarioUseCase criarUsuario(RepositorioDeUsuariosGateway repositorioDeUsuario){
        return new CriarUsuarioUseCase(repositorioDeUsuario);
    }

    @Bean
    ListarUsuariosUseCase listarUsuarios(RepositorioDeUsuariosGateway repositorioDeUsuario){
        return new ListarUsuariosUseCase(repositorioDeUsuario);
    }

    @Bean
    RepositorioDeUsuarioJPAGatewayImpl criarRepositorioJpa(UsuarioRepository repositorio, UsuarioEntityMapper mapper){
        return new RepositorioDeUsuarioJPAGatewayImpl(repositorio, mapper);
    }

    @Bean
    UsuarioEntityMapper retornaMapper(){
        return new UsuarioEntityMapper();
    }
}