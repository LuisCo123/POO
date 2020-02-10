public class ContaAtivo extends Contas{
    //private double bens;
    //private double direitos;
    //private double saldoAtivo;
    
    public ContaAtivo(String nome){
        super(nome);
    }
    public void creditar(double valor){
        this.setSaldo(this.getSaldo() - valor);
    }
    
    public void debitar(double valor){
        this.setSaldo(this.getSaldo() + valor);
    }
   
}