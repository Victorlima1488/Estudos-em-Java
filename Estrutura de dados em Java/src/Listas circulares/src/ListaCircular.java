public class ListaCircular<T> {
    private No<T> cabeca;
    private No<T> cauda;
    private  int tamanhoLista = 0;

    public int size(){
        return this.tamanhoLista;
    }

    public  boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    puclic void remove(int index){
        if(index >=  this.tamanhoLista){
            throw new IndexOutOfBoundsException("O indice é maior que o tamanho da lista.");
        }
    }

    private No<T> getNo(int index) {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("A lista está vazia!");
        }
        if(index == 0){
            return this.cauda;
        }
        No<T> noAuxiliar = this.cauda;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }
}
