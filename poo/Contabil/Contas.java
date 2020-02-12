public class Contas{
    private String nomeConta;
    private double saldo;
    
    public Contas(String nome){
        this.setNome(nome);
        this.saldo = 0;
    }
    private void setNome (String nome){
        this.nomeConta = nome;

    }
    
    public void setSaldo(double valor){
        this.saldo = valor;
    }
    
    public String getNome(){
        return this.nomeConta;
    }
    
    public void creditar(double valor){
    
    }
    
    public void debitar(double valor){
    }
    public double getSaldo(){
        return this.saldo;
    }
}