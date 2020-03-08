public class ConverteCMYKpRGB implements ConversorCor{
    public Mapa getNovoMapa(int dimensaoX, int dimensaoY){
        MapaRGB novo = new MapaRGB(dimensaoX, dimensaoY);
        return novo;
    }
    public Pixel converter(Pixel cor){
       if(cor instanceof CMYK){
            CMYK novo = (CMYK) cor;
            double R = 255 * (1 - novo.getCyan()) * (1- novo.getKey());
            double G =  255 * (1 - novo.getMagenta()) * (1- novo.getKey());
            double B =  255 * (1 - novo.getYellow()) * (1- novo.getKey());
        
            RGB novaCor = new RGB(R,G,B);
            return novaCor;
       }
       return cor;
    }

}
