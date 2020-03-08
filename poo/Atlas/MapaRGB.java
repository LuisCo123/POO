public class MapaRGB extends Mapa{
    private RGB[][] mapa;
    
    public MapaRGB(int dimensaoX, int dimensaoY){
        this.mapa = new RGB[dimensaoX][dimensaoY];
    }
    
    public void setPixel(int dimensaoX, int dimensaoY,Pixel pixel){
       if(pixel instanceof RGB){
       RGB novo = (RGB) pixel;
       this.mapa[dimensaoX][dimensaoY] = novo;
       }
    }   
    
    public Pixel[][] getMapa(){
        return this.mapa;
    }
    
    public int getAltura(){
        return this.mapa.length;
    }
    
    public int getLargura(){
        return this.mapa[0].length;
    }
    
    public double getSimilaridade(Fragmento fragmento){
       int media = 0;
       int mediaMax = 0 ;
       int soma = 0;
        for(int iCont = 0; iCont <= this.getAltura() - fragmento.getAltura(); iCont++)
            for(int jCont = 0; jCont <= this.getLargura()- fragmento.getLargura(); jCont++){
                for(int kCont = 0; kCont < fragmento.getAltura(); kCont++)
                    for(int mCont = 0; mCont < fragmento.getLargura(); mCont++){
                        soma += fragmento.getpixel(kCont, mCont).getLuminosidade()
                                    - this.mapa[kCont + iCont][mCont + jCont].getLuminosidade();
                    
                    }
                media = soma / (fragmento.getAltura() * fragmento.getLargura());
                mediaMax = (media > mediaMax) ? media : mediaMax;
            }
       return mediaMax;
    }
    
    public Pixel getPixel (int dimensaoX, int dimensaoY){
        return this.mapa[dimensaoX][dimensaoY];
    }
}
