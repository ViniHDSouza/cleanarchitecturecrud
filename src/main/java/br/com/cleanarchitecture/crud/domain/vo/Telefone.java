package br.com.cleanarchitecture.crud.domain.vo;

import lombok.Getter;

@Getter
public class Telefone {

    private String document;

    public Telefone(String document) {
        if (document == null || !document.matches("\\(\\d{2}\\)\\d{4}-\\d{4}")) {
            throw new IllegalArgumentException("Telefone no padrão incorreto!");
        }
        this.document = document;
    }

    @Override
    public String toString() {
        return this.document;
    }
}
