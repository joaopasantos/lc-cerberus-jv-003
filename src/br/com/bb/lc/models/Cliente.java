package br.com.bb.lc.models;

public abstract class Cliente {
    private String nome;
    private String telefone;
    private Endereco endereco;

    public Cliente(String nome, String telefone, Endereco endereco) {
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setEndereco(endereco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isBlank() || nome == null)
            throw new IllegalArgumentException("Nome não foi preenchido. Não foi possível concluir a operação.");
        if (nome.length() < 3)
            throw new IllegalArgumentException("Nome inválido. Deve ser maior do que 3 caracteres.");
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone.isBlank() || telefone == null)
            throw new IllegalArgumentException("Telefone não foi preenchido. Não foi possível concluir a operação.");
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
