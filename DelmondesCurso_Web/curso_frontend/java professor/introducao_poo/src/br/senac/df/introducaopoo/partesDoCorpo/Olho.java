package br.senac.df.introducaopoo.partesDoCorpo;

public class Olho {
     //classe String utlizada para manipular caracteres
     String cor;
     //int: tipo primitivo para inteiros de até 32bits
     int tamanho;

     //void: tipo de retorno que não retorna nada
     void piscar(){
         //System.out.println: imprime uma mensagem no console
         System.out.println("Piscando");
     }

     public void setTamanho(int tamanho) {
          this.tamanho = tamanho;
     }

     public int getTamanho() {
          return tamanho;
     }

     public void setCor(String cor) {
          this.cor = cor;
     }

     public String getCor() {
          return cor;
     }
}
