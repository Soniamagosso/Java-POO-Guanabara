
package javaapplication2;

public class professor extends pessoa {
    
    private double salario;
    private String nomeCurso;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }
        
    public double calcularSalarioLiquido(){
        return (0);
    }
}
