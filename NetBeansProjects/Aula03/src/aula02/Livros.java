
package aula02;
public class Livros {
    public String modelo;
    public String assunto;
    public String autor;
    protected int tamanho;
    public int ano;
    private boolean emprestado;
    void status(){
        System.out.print("O livro de " + this.modelo);
        System.out.print(" de " + this.assunto);
        System.out.print(" do autor " + this.autor);
        System.out.print(" de " + this.tamanho + "cm");
        System.out.print(" escrito no ano " + this.ano);
              
        System.out.println(" está emprestado? " + this.emprestado);
    }
    
     void ler(){
        if(this.emprestado == true) {
            System.out.println("Esta emprestado!");
        } else{
            System.out.println("Está disponivel para leitura");
        }
    }
    
    
}
