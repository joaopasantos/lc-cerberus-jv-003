package br.com.bb.lc.models;

import java.math.BigDecimal;

public class Aluguel {
    private Cliente cliente;
    private Veiculo veiculo;
    private int diarias;
    private BigDecimal valor;

    public Aluguel(ClientePF cliente, Veiculo veiculo, int diarias) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.diarias = diarias;
        BigDecimal total = veiculo.getTipo().getDiaria().multiply(BigDecimal.valueOf(diarias));
        BigDecimal desconto = (diarias > 5) ? new BigDecimal("0.05") : BigDecimal.ZERO;
        BigDecimal valorFinal = total.subtract(total.multiply(desconto));
        this.valor = valorFinal;
    }

    public Aluguel(ClientePJ cliente, Veiculo veiculo, int diarias) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.diarias = diarias;
        BigDecimal total = veiculo.getTipo().getDiaria().multiply(BigDecimal.valueOf(diarias));
        BigDecimal desconto = (diarias > 3) ? new BigDecimal("0.10") : BigDecimal.ZERO;
        BigDecimal valorFinal = total.subtract(total.multiply(desconto));
        this.valor = valorFinal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public int getDiarias() {
        return diarias;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
