package fila;

public class No {
    
    private Object object;
    private No refNo;

    public No(Object object){
        this.object = object;
        this.refNo = null;
    }

    public Object getObject(){
        return object;
    }

    public No getRefNo(){
        return refNo;
    }

    public void setObject(Object object){
        this.object = object;
    }

    public void setRefNo(No refNo){
        this.refNo = refNo;
    }
}

