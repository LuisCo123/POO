
public class LivroContabil{
    
    private Lancamento[] lancamentos;
    
    public LivroContabil(){
        this.lancamentos = new Lancamento[0];
    }
    
    private void addLancamento(Lancamento novo){
        Lancamento[] aux = new Lancamento[this.lancamentos.length + 1];
        
        for(int i = 0; i < this.lancamentos.length; i++)
            aux[i] = this.lancamentos[i];
        aux[aux.length + 1] = novo;
        this.lancamentos = aux;
    }
    public void registrarFato(String descricao, String nomeCredito, 
                            String nomeDebito, double valor){
        this.addLancamento(new Lancamento(descricao, nomeCredito, nomeDebito, valor));
    }
    
}
