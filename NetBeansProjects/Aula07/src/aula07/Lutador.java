package aula07;
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public void apresentar(){        
        System.out.println("CHEGOU A HORA! Apresentamos o lutador: ");
        System.out.println(getNome () + ", diretamente da " + getNacionalidade() + " com " + getIdade() + " anos");
        System.out.println("ele tem " + getAltura() + "m de altura e " + "pesa " + getPeso() + "kg");
        System.out.println("=======================================");
    }
    public void status(){
        System.out.print(getNome());
        System.out.println(" é um peso " + getCategoria());
        System.out.print("Tem " + getVitorias() + " Vitorias");
        System.out.print(", " + getDerrotas() + " Derrotas");
        System.out.println("e " + getEmpates() + " Empates");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    public Lutador(String n, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = n;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
                 
        
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (peso < 52.2) {
            this.categoria = "Invalido"; 
        } else if (peso <= 70.3){
            this.categoria = "Leve";
        } else if (peso <= 83.9) {
             this.categoria = "Medio";
        } else if (peso <= 120.2) {
             this.categoria = "Pesado";
        }else {
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }
}

    
