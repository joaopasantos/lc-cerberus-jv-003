package br.com.bb.lc.models;

public class Veiculo {
    private TipoVeiculo tipo;
    private Marca marca;
    private String modelo;
    private String placa;

    public Veiculo(TipoVeiculo tipo, Marca marca, String modelo, String placa) {
        if (tipo == null)
            throw new IllegalArgumentException("Tipo não foi preenchido. Não foi possível concluir a operação.");
        if (marca == null)
            throw new IllegalArgumentException("Marca não foi preenchida. Não foi possível concluir a operação.");
        if (modelo.isBlank() || modelo == null)
            throw new IllegalArgumentException("Modelo não foi preenchido. Não foi possível concluir a operação.");
        if (placa.isBlank() || placa == null)
            throw new IllegalArgumentException("Placa não foi preenchida. Não foi possível concluir a operação.");
        if (placa.length() < 10)
            throw new IllegalArgumentException("Placa inválida. Não foi possível concluir a operação.");

        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    public TipoVeiculo getTipo() {
        return tipo;
    }

    public Marca getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }
}
