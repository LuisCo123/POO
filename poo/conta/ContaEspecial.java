public class ContaEspecial extends ContaCorrente{
    private double limite;
    
    
    public ContaEspecial(String numeroConta, double limite){
      super(numeroConta);
      this.setlimite(limite);
    }
    public void setlimite(double valor){
        this.limite = valor;
    }
    
    public void sacar(double valor){
        if(valor <= this.getSaldo() + this.limite && valor > 0)
            this.setSaldo(this.getSaldo() - valor);
    }
    
    public String toString(){
        return super.toString() + " limite = " + this.limite;
    }
}