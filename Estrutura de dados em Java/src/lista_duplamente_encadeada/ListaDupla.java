package lista_duplamente_encadeada;

public class ListaDupla<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDupla(){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public int size(){
        return tamanhoLista;
    }

    public void  add(T conteudo){
        NoDuplo<T> novoNo = new NoDuplo<T>(conteudo);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);

        if(primeiroNo == null){
            primeiroNo = novoNo;
        }
        if(ultimoNo != null){
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;   
    }

    public void add(int index, T conteudo){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<T>(conteudo);
        novoNo.setNoProximo(noAuxiliar);

        if(novoNo.getNoProximo() != null){
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        }else{
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }

        if(index == 0){
            primeiroNo = novoNo;
        }else{
            novoNo.getNoPrevio().setNoPrevio(novoNo);
        }

        this.tamanhoLista++;
    }

    public void remove(int index){
        if(index == 0){
            primeiroNo = primeiroNo.getNoProximo();
            if(primeiroNo != null){
                primeiroNo.setNoPrevio(null);
            }
        }else{
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
            if(noAuxiliar != ultimoNo){
                noAuxiliar.getNoProximo().getNoPrevio();
            }else{
                ultimoNo = noAuxiliar;
            }
        }

        this.tamanhoLista--;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;

        for(int i=0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        return noAuxiliar;
    }

    @Override
    public String toString(){
        String strRetorno = "";

        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; i < size(); i++){

            strRetorno += "[No{Conteudo = " + noAuxiliar.getConteudo() + "}]---->";

            noAuxiliar = noAuxiliar.getNoProximo();
        }

        strRetorno += "null";
        return strRetorno;
    }
}
