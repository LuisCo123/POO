public class Musica{
    private String titulo = new String();
    private String[] artistas;
    private double duracao;
    private String genero = new String();
    private char campoHarmonico;
    private String nomeGravadora = new String();
    
    public Musica(String titulo, int QtdArtistas, String[] artistas, 
    double duracao, String genero, char campoHarmonico, String nomeGravadora){
        
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;
        this.campoHarmonico = campoHarmonico;
        this.nomeGravadora = nomeGravadora;
        this.artistas = new String[QtdArtistas];
        for(int iCont = 0; iCont < this.artistas.length; iCont++){
            this.artistas[iCont] = artistas[iCont];
        };
    };
    
    public String getTitulo(){
        return this.titulo;
    };
    public  int getSizeArtista(){
        return this.artistas.length;
    };
    public String getNomeArtista(int posicao){
        return this.artistas[posicao];
    };
    public char getCampoHarmonico(){
        return this.campoHarmonico;
    };
    public String getNomeGravadora(){
        return this.nomeGravadora;
    };
    public String getGenero(){
        return this.genero;
    };
    public String[] getTodosArtistas(){
        return this.artistas;
    }
    public double getDuracao(){
        return this.duracao;
    }
    public boolean equals(Musica outra){
        int contador = 0;
        if(this.getTitulo() != outra.getTitulo())
            return false;
        else{
            if(this.getSizeArtista() != outra.getSizeArtista())
                return false;
            else{
                for(int iCont = 0; iCont < this.getSizeArtista(); iCont++){
                    for(int jCont = 0; jCont < outra.getSizeArtista(); jCont++)
                        if(this.getNomeArtista(iCont) == outra.getNomeArtista(jCont))
                            contador++;    
                };
            };
        };
        if(contador != this.getSizeArtista())
            return false;
        
        return true;
    };
    public double proximity(Musica outra){
        double proximity = 0;
        int max;
       
        double percent = 0;
        
            proximity += (this.getCampoHarmonico() == outra.getCampoHarmonico()) ? 1 : 0;
            proximity += (this.getNomeGravadora() == outra.getNomeGravadora()) ? 1 : 0;
            proximity += (this.getGenero() == outra.getGenero()) ? 1 : 0;
            
            max = (this.getSizeArtista() <= outra.getSizeArtista()) ? outra.getSizeArtista() : this.getSizeArtista();
            
            for(int iCont = 0; iCont < this.getSizeArtista(); iCont++){
                for(int jCont = 0; jCont < outra.getSizeArtista(); jCont++)
                    if(this.getNomeArtista(iCont) == outra.getNomeArtista(jCont)){
                        percent++;
                };
            };
            proximity += percent/max;
        return proximity;
    };
};