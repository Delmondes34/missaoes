package br.senac.df.introducaopoo.partesDoCorpo;

public class Braco {
    private Mao mao = new Mao();

    public void mexer(){
        System.out.println("Mexendo o braço");
    }

    public Mao getMao() {
        return mao;
    }
    public void setMao(Mao mao) {
        this.mao = mao;
    }

}
