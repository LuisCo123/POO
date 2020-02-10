
public class CPatrimonioLiquido extends Contas{
        
        
        
    public CPatrimonioLiquido(String nome){
        super(nome);
    }
    public void creditar(double valor){
        this.setSaldo(this.getSaldo() + valor);
    }
    
    public void debitar(double valor){
        this.setSaldo(this.getSaldo() - valor);
    }
}
