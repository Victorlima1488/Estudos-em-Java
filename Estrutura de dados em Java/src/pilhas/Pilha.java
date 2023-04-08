package pilhas;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha(){
        this.refNoEntradaPilha = null;
    }

    public boolean isEmpty(){
        return refNoEntradaPilha == null ?  true :  false;     
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        else{
            return null;
        }
        
    }

    public No viewRef(){
        return refNoEntradaPilha.getRefNo();
    }

    @Override
    public String toString(){
        String stringRetorno = "----------\n";
        stringRetorno += "  Pilha\n";
        stringRetorno += "----------\n";

        No noAuxiliar = refNoEntradaPilha;

        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{conteudo = " + noAuxiliar.getConteudo() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "==========\n"; 
        return stringRetorno;
    }
}
