package br.com.bb.lc.models;

public class ClientePJ extends Cliente {
    private String cnpj;

    public ClientePJ(String nome, String telefone, Endereco endereco,String cnpj) {
        super(nome, telefone, endereco);
        setCnpj(cnpj);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if (cnpj.length() < 14) {
            throw new IllegalArgumentException("CNPJ inválido. Não foi possível concluir a operação.");
        }
        this.cnpj = cnpj;
    }

}
