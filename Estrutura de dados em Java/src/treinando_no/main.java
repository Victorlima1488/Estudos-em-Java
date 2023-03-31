package treinando_no;

public class main {
    public static void main(String[] args){
        
        No<String> no1 = new No<String>("Conteudo no1");

        No<String> no2 = new No<String>("Conteudo no2");
        no1.setProximoNo(no2);

        No<String> no3 = new No<String>("Conteudo no3");
        no2.setProximoNo(no3);

        No<String> no4 = new No<String>("Conteudo no4");
        no3.setProximoNo(no4);

        // no1 -> no2 -> no3 -> no4 -> null

        // System.out.println(no1.getConteudo());
        // System.out.println(no1.getProximoNo());

        System.out.println(no1.getProximoNo());
        System.out.println(no2.getProximoNo());
        System.out.println(no3.getProximoNo());
        System.out.println(no4.getProximoNo());


    }
}
