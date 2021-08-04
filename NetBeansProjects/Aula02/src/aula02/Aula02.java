
package aula02;

public class Aula02 {

      public static void main(String[] args) {
          Livros L1 = new Livros();
          L1.modelo = "capa dura";
          L1.ano = 2010;
          L1.assunto = "Literatura inglesa";
          L1.autor = "Dan Brown";
          L1.tamanho = 30;
          L1.emprestado = false;
          L1.status();
          
          Livros L2 = new Livros();
          L2.modelo = "Brochura";
          L2.ano = 1985;
          L2.assunto = "Historia";
          L2.autor = "Gilberto freyre";
          L2.tamanho = 45;
          L2.emprestado = true;
          L2.status();
    }
    
          
}
