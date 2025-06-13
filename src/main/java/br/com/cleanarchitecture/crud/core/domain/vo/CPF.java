package br.com.cleanarchitecture.crud.core.domain.vo;

import br.com.cleanarchitecture.crud.core.exception.CPFInvalidoException;
import lombok.Getter;

@Getter
public class CPF {

    private String document;

    public CPF(String document) {
        if (document == null || !document.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            throw new CPFInvalidoException();
        }
        this.document = document;
    }

    @Override
    public String toString() {
        return this.document;
    }
}
