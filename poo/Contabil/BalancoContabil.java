public class BalancoContabil{
    private Contas[] conjuntoC; // conjunto de contas
    
    public BalancoContabil(){
        this.conjuntoC = new Contas [0];
    }
    
    public void ajustar(String nomeCredito, String nomeDebito, double valor){
        this.FindByName(nomeCredito);
        this.FindByName(nomeDebito);
    }
    
    private Contas FindByName(String nome){
        for(Contas conta : this.conjuntoC)
            if(conta.getNome().equals(nome))
                return conta;
        return null;
    }
}
