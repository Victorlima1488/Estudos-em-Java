package Listas_circulares;

public class No<T> {
    private T conteudo;
    private No<T> noProximo;

    public No(T conteudo){
        this.noProximo = null;
        this.conteudo = conteudo;
    }

    public No<T> getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(No<T> noProximo) {
        this.noProximo = noProximo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    @Override
    public String toString(){
        return "NO{" + "conteudo =" + conteudo + "}";
    }
}
