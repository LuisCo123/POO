
public class CPatrimonioLiquido extends Contas{
        
        
        
        public CPatrimonioLiquido(String nome){
            super(nome);
        }
        public void debitar(double valor){
            super.creditar(valor);
        }
        public void creditar(double valor){
            super.debitar(valor);
        }

}
