public class Memoria{
    private int[][] pastas;
    private int lin;
    private int col;
    
    public Memoria(int numPastas){
        this.lin = numPastas;
        this.col = 8;
        this.pastas = new int[lin][col];
        this.zerar(this.pastas);
    }
    
    private void zerar(int[][] past){
        for(int i = 0; i < this.lin; i++)
            for(int j = 0; j < this.col; j++)
                past[i][j] = 0;
    }
    
    private void zerar(int indice){
        for(int j = 0; j < this.col; j++)
            this.pastas[indice][j] = 0;
    }
    
    public void setValor(int[] valores){
         this.trocar(this.pastas);
         for(int i = 0; i < this.lin; i++)
            this.pastas[i][0] = valores[i];        
    }
    
    private void trocar(int[][] past){
        for(int i = 0; i < this.lin; i++)
            for(int j = this.col - 1; j > 0 ; j--)
                past[i][j] = past[i][j-1];
    }
    
    public void swapOut(){
        int[] numeros = new int[pastas.length];
        int indice;
        
        this.somar(numeros, pastas);
        indice = this.menor(numeros);
        this.zerar(indice);
    }
    
    private void somar(int[] numeros, int[][] past){
        for(int i = 0; i < this.lin; i++)
            for(int j = 0; j < this.col; j++){
                numeros[i] += past[i][j];
            } 
    }
    
    private int menor(int[] numeros){
        int indice = 0;
            for(int i = 0; i < numeros.length - 1 ; i++)
                indice = (numeros[indice] < numeros [i+1]) ? indice : i+1;
            
        return indice;
    }
   
}