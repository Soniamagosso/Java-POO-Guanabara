package javaapplication2;

public class Aluno extends pessoa {
    
    private String curso;
    private double[] notas;
    
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNotas(double[] ntas) {
        this.notas = ntas;
    }

    public String getCurso() {
        return curso;
    }

    public double[] getNotas() {
        return notas;
    }
    
    public double calcularMedia(){
            return (0);
}
    public boolean verificarAprovado(){
        return true;
    }
}
