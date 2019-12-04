
public class Playlist{
    private Musica[] musicas;
    
    public Playlist(){
        musicas = new Musica [0];
    };
    public int getQtdMusicas(){
        return this.musicas.length;
    };
    public void addMusica(Musica musica){
        Musica[] novo = new Musica [this.getQtdMusicas() + 1];
        int iCont = 0; 
        for(iCont = 0; iCont < this.getQtdMusicas(); iCont++)
            novo[iCont] = this.musicas[iCont];
        novo[iCont] = musica;
        this.musicas = novo;        
    }
    public Musica[] getListaMusicas(){
        return musicas;
    }
}//musica.getTitulo(), musica.getSizeArtista(), musica.getTodosArtistas(), 
        //musica.getDuracao(), musica.getGenero(), musica.getCampoHarmonico(), musica.getNomeGravadora()