package fila;

public class Fila {
    
    private No refEntradaFila;

    public Fila(){
        this.refEntradaFila = null;
    }

    public boolean isEmpty(){
        return refEntradaFila == null ? true : false;
    }

    public void enqueue(No novoNo){
        novoNo.setRefNo(refEntradaFila);
        refEntradaFila = novoNo;
    }


    public No first(){
        if(!this.isEmpty()){
            No primeiroNo = refEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }
        }
        
        return null;
    }

    public No dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = refEntradaFila;
            No noAuxiliar = refEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
        }
        
        return null;
    }

    @Override
    public String toString(){
        String stringRetorno = "";
        No noAuxiliar = refEntradaFila;

        if(refEntradaFila != null){
            while(true){
                stringRetorno += "[No{object=" + noAuxiliar.getObject() + "}]---->";   
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}