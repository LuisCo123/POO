public class Atlas{
    private Mapa[] mapas;
    
    
    public Mapa getMapaMaiSimilar(Fragmento fragmento){
        int indice = 0;
        double media = 0;
        double mediaMax = 0;
        
        for(int iCont = 0; iCont < mapas.length; iCont++)
            if((this.mapas[iCont].getAltura() >= fragmento.getAltura()) && 
            (this.mapas[iCont].getLargura() >= fragmento.getLargura())){
                media = mapas[iCont].getSimilaridade(fragmento);
                mediaMax = (mediaMax > media) ? mediaMax : media;
                indice = (mediaMax > media) ? indice : iCont;
            }
        
        return this.mapas[indice];
    };
}