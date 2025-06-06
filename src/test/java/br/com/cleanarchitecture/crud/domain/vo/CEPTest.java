package br.com.cleanarchitecture.crud.domain.vo;

import org.junit.jupiter.api.Test;

import br.com.cleanarchitecture.crud.core.domain.vo.CEP;

import static org.junit.jupiter.api.Assertions.*;

class CEPTest {

    @Test
    public void cepComFormatoInvalido() {

        assertThrows(IllegalArgumentException.class,
                () -> new CEP("11111111"));
    }

    @Test
    public void cepComFormatoValido() {

        assertDoesNotThrow(
                () -> new CEP( "11.111-111"));
    }

}