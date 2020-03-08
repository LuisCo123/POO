public abstract class Mapa{
    public abstract Pixel[][] getMapa();
    

    public abstract int getAltura();
    public abstract int getLargura();
    public abstract double getSimilaridade(Fragmento fragmento);
    public abstract Pixel getPixel(int dimensaoX, int dimensaoY);
    public abstract void setPixel(int dimensaoX, int dimensaoY,Pixel pixel);
}