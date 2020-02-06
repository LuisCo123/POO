public class App{
    private int[] p1 = {1,1,1,0};
    private int[] p2 = {0,1,1,1};
    private int[] p3 = {1,0,1,0};
    private int[] p4 = {0,1,1,0};
    private int[] p5 = {0,1,1,1};
    private Memoria memoria = new Memoria(4);
    public App(){
        this.run();
    }
    
    
   private void run(){
       this.memoria.setValor(p1);
       this.memoria.setValor(p2);
       this.memoria.setValor(p3);
       this.memoria.setValor(p4);
       this.memoria.setValor(p5);
       this.memoria.swapOut();
    }
}