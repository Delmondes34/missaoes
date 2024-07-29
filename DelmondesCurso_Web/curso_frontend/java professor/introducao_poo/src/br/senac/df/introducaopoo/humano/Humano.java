//package: utilziada para definir o pacote em que se ncontr a classe
package br.senac.df.introducaopoo.humano;

//import: Utilizada para importar classes de outro pacote
import br.senac.df.introducaopoo.partesDoCorpo.Braco;
import br.senac.df.introducaopoo.partesDoCorpo.Olho;
import br.senac.df.introducaopoo.profissoes.lenhador;

//class utlizada para iniciar a definicao de uma classe
//abstract: utilizada para definir uma classe abstrata
public abstract class Humano implements lenhador {


    public abstract String pensar();

    public void cortarArvore() {
        System.out.println("Cortando árvore");
    }

    //construtor que recebe o nome
    public Humano(String nome) {
        this.nome = nome;
    }

    private String nome;

    private Olho olhoEsquerdo;
    private Olho olhoDireito;

    private Braco bracoEsquerdo;
    private Braco bracoDireito;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Olho getOlhoEsquerdo() {
        return olhoEsquerdo;
    }

    public void setOlhoEsquerdo(Olho olhoEsquerdo) {
        this.olhoEsquerdo = olhoEsquerdo;
    }

    public Olho getOlhoDireito() {
        return olhoDireito;
    }

    public void setOlhoDireito(Olho olhoDireito) {
        this.olhoDireito = olhoDireito;
    }

    public Braco getBracoEsquerdo() {
        return bracoEsquerdo;
    }

    public void setBracoEsquerdo(Braco bracoEsquerdo) {
        this.bracoEsquerdo = bracoEsquerdo;
    }

    public Braco getBracoDireito() {
        return bracoDireito;
    }

    public void setBracoDireito(Braco bracoDireito) {
        this.bracoDireito = bracoDireito;
    }


}
