public class ContadorVolta{
    private int valor;
    
    public ContadorVolta(){
        setzerar();
    };
    
    public void contar(int Qtd){
        this.valor += Qtd;
    };
    
    public void contar(){
        this.contar(1);
    };
    
    public void setzerar(){
        this.valor = 0;
    };  
    
    public int getbuscarValor(){
        return this.valor;
    };    
    
    public void contar(ContadorVolta contavolta){
        this.contar(contavolta.getbuscarValor());
    };
};
