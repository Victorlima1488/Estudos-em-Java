public class Main {

    public static void main(String[] args) {

        Moto moto = new Moto(125,5);

        moto.setPreco(1200);
        System.out.println(moto.getCilindrada());
        System.out.println(moto.getMachas());
        System.out.println(moto.getPreco());
    }
}