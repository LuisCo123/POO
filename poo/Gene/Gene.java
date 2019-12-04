    public class Gene{
    private int estadoGene;
    
    public Gene(Gene outro){
        this(outro.getGene());
    };
        
    public Gene(int x){
        this.setAltera(x);
    };
        
    public void setAltera(int x){
        this.estadoGene = x;
    };
    
    public int getGene(){
        return this.estadoGene;
    };
    
    public boolean equals(Gene outro){
        return this.getGene() == outro.getGene();
    };
    
    public Gene clonar (){
        return new Gene(this.getGene());
    };
};