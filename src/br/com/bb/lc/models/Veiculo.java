package br.com.bb.lc.models;

public class Veiculo {
    private TipoVeiculo tipo;
    private Marca marca;
    private String modelo;
    private String placa;

    public Veiculo(TipoVeiculo tipo, Marca marca, String modelo, String placa) {
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
