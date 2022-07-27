package br.com.bb.lc.models;

import java.math.BigDecimal;

public enum TipoVeiculo {
    PEQUENO(new BigDecimal("100")),
    MEDIO(new BigDecimal("150")),
    SUV(new BigDecimal("200")),;

    BigDecimal diaria;

    TipoVeiculo(BigDecimal diaria) {
        this.diaria = diaria;
    }

    public BigDecimal getDiaria() {
        return diaria;
    }
}
