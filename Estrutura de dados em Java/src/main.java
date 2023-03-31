public class main {
    public static void main(String[] args){
        
        No no1 = new No("Conteudo no1");

        No no2 = new No("Conteudo no2");
        no1.setProximoNo(no2);

        No no3 = new No("Conteudo no3");
        no2.setProximoNo(no3);

        No no4 = new No("Conteudo no4");
        no3.setProximoNo(no4);

        // no1 -> no2 -> no3 -> no4 -> null

        // System.out.println(no1.getConteudo());
        // System.out.println(no1.getProximoNo());

        System.out.println(no1.getConteudo());
        System.out.println(no2.getConteudo());
        System.out.println(no3.getConteudo());
        System.out.println(no4.getConteudo());


    }
}
