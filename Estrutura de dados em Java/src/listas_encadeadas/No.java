package listas_encadeadas;

public class No<T> {
    
    private T conteudo;
    private No<T> proximoNo;

    public No(T conteudo){
        this.conteudo = conteudo;
        this.proximoNo = null;
    }

    public void setConteudo(T conteudo){
        this.conteudo = conteudo;
    }

    public void setProximoNo(No<T> proximoNo){
        this.proximoNo = proximoNo;
    }

    public T getConteudo(){
        return this.conteudo;
    }

    public No<T> getProximoNo(){
        return this.proximoNo;
    }

    @Override
    public String toString(){
        return "No{" + " Conteudo = " + conteudo + "}";
    }

    public String toStringEncadeado(){
        String str = "No{" + " Conteudo = " + conteudo + "}";

        if(proximoNo != null){
            str += "-> " + proximoNo.toString();
        } else{
            str += "-> null";
        }

        return str;
    }
    
}
