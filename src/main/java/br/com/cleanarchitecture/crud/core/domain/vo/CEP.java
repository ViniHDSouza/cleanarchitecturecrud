package br.com.cleanarchitecture.crud.core.domain.vo;

import lombok.Getter;

@Getter
public class CEP {

    private String document;

    public CEP(String document) {
        if (document == null || !document.matches("\\d{2}.\\d{3}-\\d{3}")) {
            throw new IllegalArgumentException("CEP no padrão incorreto!");
        }
        this.document = document;
    }
}
