package br.com.cleanarchitecture.crud.domain.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Endereco {
    private CEP cep;
    private Integer numero;
    private String complemento;

    public Endereco(String cep, Integer numero, String complemento) {
        this.cep = new CEP(cep);
        this.numero = numero;
        this.complemento = complemento;
    }
}