package aula04;
public class ContaBanco_1 {
    public int numConta;
    protected float tipo;
    private String dono;
    private int saldo;
    private boolean fechada;
    
    ContaBanco_1(int numConta, float tipo, String dono, int saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getTipo() {
        return tipo;
    }

    public void setTipo(float tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void fechada(){
        this.fechada = true;
    }
    
    public void aberta(){
        this.fechada = false;
    }
    public void status(){  
        System.out.println("Qual o numero da conta? " + this.getNumConta());
        System.out.println("Qual o tipo da conta? (Conta Corrente - CC ou Conta Poupança - CP): " + this.getTipo());
        System.out.println("Qual o nome: "+ this.getDono());
        System.out.println("Qual o valor do saldo: " + this.getSaldo());
        System.out.println("Fechada: " + this.fechada);

   
    }
    
    
}