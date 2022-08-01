package br.com.bb.lc.models;

public abstract class Cliente {
    private String nome;
    private String telefone;
    private Endereco endereco;

    public Cliente(String nome, String telefone, Endereco endereco) {
        this.nome = nome;
        setTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone.length() < 10) {
            throw new IllegalArgumentException("Número de telefone inválido. Não foi possível concluir a operação.");
        }
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        if (endereco == null) {
            throw new IllegalArgumentException("Endereço precisa ser preenchido.");
        }
        this.endereco = endereco;
    }
}
