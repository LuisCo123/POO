public class Aging{
    private int[] p1 = new int[8];
    private int[] p2 = new int[8];
    private int[] p3 = new int[8];
    private int[] p4 = new int[8];
    
    public Aging(){
        this.zerar(this.p1);
        this.zerar(this.p2);
        this.zerar(this.p3);
        this.zerar(this.p4); 
    }
    
    private void zerar(int[] pasta){
        int iCont;
        
        for(iCont = 0; iCont < 8; iCont++)
            pasta[iCont] = 0;
    
    }
    
    public void setValor(int[] valores ){
        this.trocar(this.p1);
        this.trocar(this.p2);
        this.trocar(this.p3);
        this.trocar(this.p4);
        this.p1[0]= valores[0];
        this.p2[0]= valores[1];
        this.p3[0]= valores[2];
        this.p4[0]= valores[3];
    }
    
    private void trocar(int[] pasta){
        for(int iCont = pasta.length - 1 ; iCont > 0; iCont--){
            pasta[iCont] = pasta[iCont-1];
        }
    }
    
    public void swap(){
        int[] numeros = new int[4]; 
        int indice; 
       
        numeros[0] = this.somar(this.p1);
        numeros[1] = this.somar(this.p2);
        numeros[2] = this.somar(this.p3);
        numeros[3] = this.somar(this.p4);
        indice = this.menor(numeros);
        switch(indice){
                    case 0 : this.zerar(p1);
                             break;
                    case 1 : this.zerar(p2);
                             break;
                    case 2 : this.zerar(p3);
                             break;
                    case 3 : this.zerar(p4);
                             break;
        }
    }
    
    private int menor(int[] valores){
        int indice = 0 ;
        
        for(int iCont =0; iCont < valores.length; iCont++ )
            for(int jCont = iCont + 1; jCont < valores.length - 1; jCont++){
                indice = (iCont < jCont) ? iCont : jCont;
            }
            
        return indice;
     
    }
    
    private int somar(int[] pasta){
        int result = 0;
        
        for(int iCont = 0; iCont < pasta.length; iCont++)
            result += pasta[iCont];
            
        return result;
    }
  
}