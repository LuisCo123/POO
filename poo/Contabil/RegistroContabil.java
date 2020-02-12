public class RegistroContabil{
    private String nome;
    private String cnpj;
    private BalancoContabil balancoC; // balanço contabil
    private LivroContabil livro;
    
    
    public RegistroContabil(String nomeEmpresa, String cnpjempresa){
        this.setNomeEmpresa(nomeEmpresa);
        this.setCNPJEmpresa(cnpjempresa);
        this.balancoC = new BalancoContabil();
        this.livro = new LivroContabil();
    }
    
    private void setNomeEmpresa(String nomeEmpresa){
        this.nome = nomeEmpresa;
    }
    
    private void setCNPJEmpresa(String CNPJEmpresa){
        this.cnpj = CNPJEmpresa;
    }
    
    public void registrarFato(String descricao, String nomeCredito, 
                            String nomeDebito, double valor){
    
        this.livro.registrarFato(descricao, nomeCredito, nomeDebito, valor);
        this.balancoC.ajustar(nomeCredito, nomeDebito, valor);
    }
}