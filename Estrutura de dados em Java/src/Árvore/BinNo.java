package Árvore;

public class BinNo<T extends  Comparable<T>> {
    private T conteudo;
    private BinNo<T> noEsq;
    private BinNo<T> noDir;

    public BinNo(T conteudo){
        this.conteudo = conteudo;
        this.noDir = this.noEsq = null;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setNoDir(BinNo<T> niDir) {
        this.noDir = niDir;
    }

    public BinNo<T> getNoDir() {
        return noDir;
    }

    public void setNoEsq(BinNo<T> noEsq) {
        this.noEsq = noEsq;
    }

    public BinNo<T> getNoEsq() {
        return noEsq;
    }

    @Override
    public String toString(){
        return "BiNo{" + "conteudo =" + conteudo + "}";
    }
}
