public class Cromossomos{
    public Gene[] cromossomos;
    
    public Cromossomos(int QtdGene){
        this.cromossomos = new Gene[QtdGene];
        
        //for(int iCont = 0; iCont < QtdGene; iCont++)
            //this.cromossomos[iCont] = new Gene(-1);
    };
    
    public void setValorGene(int alelo, int valor){
        this.cromossomos[alelo] = new Gene();
        this.setAlteraValorGene(alelo, valor);
    };
    
    public void setAlteraValorGene(int alelo, int valor){
        this.cromossomos[alelo].setAlteraValor(valor);
    };
    
    public int getGene(int alelo){
        if(this.cromossomos[alelo] == null)
            return -1;
        return this.cromossomos[alelo].getEstadoDoGene();
    };
    
    public Gene[] Clonar(){
        Gene[] clone = new Gene[cromossomos.length];
        
        for(int iCont = 0; iCont < this.cromossomos.length; iCont++){
            if(this.cromossomos[iCont] == null){
                continue;
            }else{clone[iCont] = new Gene();
            clone[iCont].setAlteraValor(this.cromossomos[iCont].getEstadoDoGene());
            };
        };
        return clone;
    };
    
    public int equals(Cromossomos outro){
        int retorno = 0;
        boolean retornoEquals;
        for(int iCont = 0; iCont < this.cromossomos.length; iCont++){
            
            if(this.cromossomos[iCont] == null && outro.cromossomos[iCont] == null){
                continue;               
            }else if(this.cromossomos[iCont] == null || outro.cromossomos[iCont] == null){
                retorno += -2;
                continue;
            };
            
            retornoEquals = this.cromossomos[iCont].equals(outro.cromossomos[iCont]);
            
            if(retornoEquals)
                retorno += 1;
            else if(!retornoEquals)
                retorno = -1;
        };
        return retorno / this.cromossomos.length;
    };
    
    public void cruzaCromossomos(Cromossomos outro, int alelo){
        if(this.cromossomos[alelo]==null){
            if(outro.cromossomos[alelo] == null)
                return;
            else{
                this.cromossomos[alelo] = new Gene(outro.cromossomos[alelo].getEstadoDoGene());
                outro.cromossomos[alelo] = null;
            };
        }else if(outro.cromossomos[alelo] == null){
            outro.cromossomos[alelo] = new Gene(this.cromossomos[alelo].getEstadoDoGene());
            this.cromossomos[alelo] = null;
        }else{
            int valor = 0;
            
            valor = this.cromossomos[alelo].getEstadoDoGene();
            this.cromossomos[alelo].setAlteraValor(outro.cromossomos[alelo].getEstadoDoGene());
            outro.cromossomos[alelo].setAlteraValor(valor);
            
        };
    };
};