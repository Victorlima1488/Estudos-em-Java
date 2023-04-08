package listas_encadeadas;

public class ListasEncadeadas<T> {
    
    No<T> referenciaEntrada;

    public ListasEncadeadas(){
        this.referenciaEntrada = null;
    }

    public boolean isEmpty(){
        return referenciaEntrada == null? true : false;
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;

        while(true){
            if(referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }

        return tamanhoLista;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);

        if(this.isEmpty()){
            referenciaEntrada = novoNo;
        }else{
            No<T> noAuxiliar = referenciaEntrada;
            for(int i = 0; i < this.size()-1; i++){
                noAuxiliar = noAuxiliar.getProximoNo();
            }

            noAuxiliar.setProximoNo(novoNo);
        }
    }
}
