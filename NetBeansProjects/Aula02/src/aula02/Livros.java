
package aula02;
public class Livros {
    String modelo;
    String assunto;
    String autor;
    int tamanho;
    int ano;
    boolean emprestado;
    void status(){
        System.out.print("O livro de " + this.modelo);
        System.out.print(" de " + this.assunto);
        System.out.print(" do autor " + this.autor);
        System.out.print(" de " + this.tamanho + "cm");
        System.out.print(" escrito no ano " + this.ano);
              
        System.out.println(" está disponível para emprestimo? " + this.emprestado);
    }
    
    void abrir(){
        this.emprestado = true;
    }
    void fechar(){
        this.emprestado = false;
    }
    void ler(){
        if(this.emprestado == true) {
            System.out.println("Esta emprestado!");
        } else{
            System.out.println("Está disponivel para leitura");
        }
    }
    
    
}
