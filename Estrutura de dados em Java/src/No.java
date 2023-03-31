public class No {
    private String conteudo;
    private No proximoNo;

    public No(String conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public String getConteudo(){
        return this.conteudo;
    }
    public void setConteudo(String conteudo){
        this.conteudo = conteudo;
    }
    public No getProximoNo(){
        return this.proximoNo;
    }
    public void setProximoNo(No proximoNo){
        this.proximoNo = proximoNo;
    }
}
