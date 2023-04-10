package listas_encadeadas;

public class Main {
    public static void main(String[] args){
        ListasEncadeadas<String> minhListasEncadeadas = new ListasEncadeadas<>();

        minhListasEncadeadas.add("Teste 1");
        minhListasEncadeadas.add("Teste 2");
        minhListasEncadeadas.add("Teste 3");
        minhListasEncadeadas.add("Teste 4");

        for(int i = 0; i < minhListasEncadeadas.size(); i++){
            System.out.println(minhListasEncadeadas.get(i));
        };

        System.out.println(minhListasEncadeadas);

        minhListasEncadeadas.remove(1);

        System.out.println(minhListasEncadeadas);

    }
}
