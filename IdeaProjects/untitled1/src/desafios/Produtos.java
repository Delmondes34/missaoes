package desafios;

import java.util.ArrayList;
public class Produtos {

    private String Nome;
    private int precoDeVenda;
    private int getPrecoDeCusto;
    private int quantidade;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(int precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public int getGetPrecoDeCusto() {
        return getPrecoDeCusto;
    }

    public void setGetPrecoDeCusto(int getPrecoDeCusto) {
        this.getPrecoDeCusto = getPrecoDeCusto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

