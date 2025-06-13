package br.com.cleanarchitecture.crud.core.exception;

public class CPFInvalidoException extends RuntimeException {
    public CPFInvalidoException() {
        super("CPF no padrão incorreto!");
    }
}