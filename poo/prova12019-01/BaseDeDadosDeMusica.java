public class BaseDeDadosDeMusica{
    private Musica[] Banco;
    
    public BaseDeDadosDeMusica(){
        Banco = new Musica[0];
    }
    
    public int getQtdMusicas(){
        return this.Banco.length;
    };
    
    public void addMusica(String titulo, int QtdArtistas, String[] artistas, 
    double duracao, String genero, char campoHarmonico, String nomeGravadora){
    
           Musica musica = new Musica(titulo, QtdArtistas, artistas, duracao, genero, campoHarmonico, nomeGravadora);
           this.addMusica(musica);
    };
    
    public void addMusica(Musica musica){
        Musica[] novo = new Musica [this.getQtdMusicas() + 1];
        int iCont = 0; 
        for(iCont = 0; iCont < this.getQtdMusicas(); iCont++)
            novo[iCont] = this.Banco[iCont];
        novo[iCont] = musica;
        this.Banco = novo;
    };
    
    public Playlist playList(String nome, double duracao, Playlist outra){
        
        Playlist playlist = new Playlist (nome);
        //Musica[] novoBanco = new Musica [this.getQtdMusicas()];
        
        for(int iCont = 0; iCont < outra.getQtdMusicas(); iCont++){
            if(duracao <=0)
                break;
            for(int jCont = 0; jCont < this.getQtdMusicas(); jCont++)
                if(outra.getUmaMusica(iCont).getGenero() == this.Banco[jCont].getGenero()){
            
                       if(!outra.getUmaMusica(iCont).equals(this.Banco[jCont]))
                            if(duracao > 0){
                                playlist.addMusica(this.Banco[jCont]);
                                duracao -= this.Banco[jCont].getDuracao(); 
                }
                
            }
        
        }
        
        
        return playlist;
    };
}