package br.com.cleanarchitecture.crud.adapter.exception;

public class UsuarioMenorIdadeException extends RuntimeException {
    public UsuarioMenorIdadeException() {
        super("Usuário menor de idade");
    }
}