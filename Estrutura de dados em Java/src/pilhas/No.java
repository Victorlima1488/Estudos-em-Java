package pilhas;

public class No {
    int conteudo;
    No refNo;

    public No(int conteudo){
        this.conteudo = conteudo;
        this.refNo = null;
    }

    public int getConteudo(){
        return this.conteudo;
    }

    public void setConteudo(int conteudo){
        this.conteudo = conteudo;
    }

    public No getRefNo(){
        return this.refNo;
    }

    public void setRefNo(No reNo){  
        this.refNo = reNo;
    }

}
