package br.com.cleanarchitecture.crud.domain.vo;

import lombok.Getter;

@Getter
public class CPF {

    private String document;

    public CPF(String document) {
        if (document == null || !document.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            throw new IllegalArgumentException("CPF no padrão incorreto!");
        }
        this.document = document;
    }

    @Override
    public String toString() {
        return this.document;
    }
}
