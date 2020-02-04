
public class ContaCorrente{
    private double saldo;
    private String numeroConta;
    
    public ContaCorrente(String numeroConta){
        this.setNumeroConta(numeroConta);
    }
    
    public void setSaldo(double num){
        this.saldo = num;
    }
    
    public void setNumeroConta(String num){
        this.numeroConta = num;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void sacar(double valor){
        if(valor <= this.saldo && valor > 0)
            this.saldo -= valor;
    }
    public String toString(){
        return "N° " + this.numeroConta + "R$ " + this.getSaldo();
    
    }
}
