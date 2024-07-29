package modelos;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private String sinopse;
    private int quantidadeDeAvaliacao;
    private double somaDasAvaliacoes;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public String getSinopse() {
        return sinopse;
    }

    public int getQuantidadeDeAvaliacao() {
        return quantidadeDeAvaliacao;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    double recuperarMedia(){

        return somaDasAvaliacoes / quantidadeDeAvaliacao;
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        quantidadeDeAvaliacao++;
    }

    void exibirDados(){
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Nome do filme: " + nome);
        System.out.println("Sinopse: " + sinopse);
    }
}