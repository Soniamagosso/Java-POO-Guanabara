
package aula02;

public class Aula02 {

      public static void main(String[] args) {
        Livros L1 = new Livros();
        L1.modelo = "Capa dura";
        L1.assunto = "Matemática";
        L1.autor = "Douglas maioli";
        L1.tamanho = 30;
        L1.ano = 1985;
        //L1.emprestado = false;
        L1.ler();
        L1.status();
    }
    
          
}
