package be.sanac.df.introducalpoo.humano;
 import be.sanac.df.introducalpoo.partes_do_ocorpo.braco;
 import be.sanac.df.introducalpoo.partes_do_ocorpo.olho;

public class humano {

    private String nome;

    olho olhoesquerdo;
    olho olhodirteito;

    braco bracoesquerdo;
    braco bracodireito;


    public humano(String nome) {
        this.nome = nome;
    }

    public humano() {
        
    }
}