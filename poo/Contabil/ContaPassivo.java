public class ContaPassivo extends Contas{
  
    
    public ContaPassivo(String nome){
        super(nome);
    }
    
    public void debitar(double valor){
            super.creditar(valor);
        }
    public void creditar(double valor){
            super.debitar(valor);
        }
    
}