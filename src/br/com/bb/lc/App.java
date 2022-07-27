package br.com.bb.lc;

import br.com.bb.lc.models.Aluguel;
import br.com.bb.lc.models.ClientePF;
import br.com.bb.lc.models.ClientePJ;
import br.com.bb.lc.models.Marca;
import br.com.bb.lc.models.TipoVeiculo;
import br.com.bb.lc.models.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        ClientePF cPf = new ClientePF("João", "61988888888", "11111111111");
        ClientePJ cPj = new ClientePJ("Loja do João", "61988888888", "11111111111111");

        Veiculo v = new Veiculo(TipoVeiculo.SUV, Marca.FORD, "Carro", "ABC1234");
        Aluguel aluguelPf = new Aluguel(cPf, v, 6);
        Aluguel aluguelPj = new Aluguel(cPj, v, 6);
        System.out.println(aluguelPf.getValor());
        System.out.println(aluguelPj.getValor());
    }
}
