public class App{
    private int[] p1 = {0,1,1,0};
    private int[] p2 = {0,1,1,1};
    private int[] p3 = {0,0,1,0};
    private int[] p4 = {0,1,1,0};
    private int[] p5 = {1,1,1,1};
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
       //this.memoria.swapOut();
    }
    public void GetMatriz(){
        int matriz[][] = this.memoria.getPasta();
        for(int i = 0; i < matriz.length; i++){
            System.out.print("\n" + "Pasta " + "[ " + i + " ] = " );
            for(int j = 0; j< matriz[i].length; j++)
                System.out.print(matriz[i][j] + " | " );
        }
    }
}