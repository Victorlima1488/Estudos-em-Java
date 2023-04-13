package Árvore;

public class ArvoreBinaria<T extends Comparable<T>>{
    private BinNo<T> raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo);
        this.raiz = inserir(raiz, novoNo);
    }
    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){
        if(atual == null){
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        }else{
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }

    public void exibirInOrdem(){
        System.out.println("\n Exibindo em ordem");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(BinNo<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsq());
            System.out.println(atual.getConteudo() + ", ");
            exibirInOrdem(atual.getNoDir());
        }
    }

    public void exibirPosOrdem(){
        System.out.println("\n Exibindo Posordem");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(BinNo<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.println(atual.getConteudo() + ", ");
        }
    }

    public void exibirPreOrdem(){
        System.out.println("\n Exibindo Preordem");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(BinNo<T> atual){
        if(atual != null){
            System.out.println(atual.getConteudo() + ", ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }

    public void remove(T conteudo){
        try{
            BinNo<T> atual = this.raiz;
            BinNo<T> noPai = null;
            BinNo<T> noFilho = null;
            BinNo<T> temp = null;

            while(atual != null && !atual.getConteudo().equals(conteudo)){
                noPai = atual;
                if(conteudo.compareTo(atual.getConteudo()) < 0){
                    atual = atual.getNoEsq();
                }else{
                    atual = atual.getNoDir();
                }
            }

            if(atual == null){
                System.out.println("Conteudo não encontrado. Bloco Try");
            }

            if(noPai == null){
                if(atual.getNoDir() == null){
                    this.raiz = atual.getNoEsq();
                }else if(atual.getNoEsq() == null){
                    this.raiz = atual.getNoDir();
                }else{
                    for(temp = atual, noFilho = atual.getNoEsq(); noFilho.getNoDir() != null; temp = noFilho, noFilho = noFilho.getNoEsq()){
                        if(noFilho != atual.getNoEsq()){
                            temp.setNoDir(noFilho.getNoEsq());
                            noFilho.setNoEsq(this.raiz.getNoEsq());
                        }
                    }
                    noFilho.setNoDir(this.raiz.getNoDir());
                    raiz = noFilho;
                }
            }else if(atual.getNoDir() == null){

            }else if((atual.getNoEsq() == null){

            }else{

            }

        }catch (NullPointerException erro){
            System.out.println("Conteudo não encontrado. Bloco catch");
        }
    }
}
