public class Gene{
    private int EstadoDoGene;
    
    public Gene(){
        this(0);
    };
    
    public Gene(int valor){
        setValor(valor);
    };
    
    private void setValor(int valor){
        this.EstadoDoGene = valor;
    };
    
    public void setAlteraValor(int valor){
        this.setValor(valor);
    };
    
    public int getEstadoDoGene(){
        return this.EstadoDoGene;
    };
    
    public boolean equals(Gene outro){
        return this.getEstadoDoGene() == outro.getEstadoDoGene();
    };
    
    public Gene clonar(){
        Gene clone = new Gene(this.getEstadoDoGene());
        return clone;
    };
};