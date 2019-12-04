public class Porta{
    private boolean aberta = false;
    
    public Porta(){
        this(false);
    };
    
    public Porta(Porta porta){
        this(porta.isAberta());
    };
    
    public Porta(boolean aberta){
        this.setabrir(aberta);
    };
    
    public void setabrir(boolean aberta){
      this.aberta = aberta;  
    };    
    
    public void setfechar(){
      this.aberta = false;  
    };    
    
    
    public boolean isAberta(){
        return aberta;
    };    
    
    
};
