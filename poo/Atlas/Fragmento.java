public class Fragmento
{
   private Pixel[][] fragmento;
   
   public Fragmento (int dimensaoX, int dimensaoY){
       this.fragmento = new Pixel[dimensaoX][dimensaoY];
    
   }
   public int getAltura(){
       return this.fragmento.length;
   }
    
   public int getLargura(){
       return this.fragmento[0].length;
   }
   public Pixel getpixel(int posicaoX, int posicaoY){
       return fragmento[posicaoX][posicaoY];
    }
}
