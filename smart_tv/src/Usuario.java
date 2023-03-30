public class Usuario {
    
    public static void main(String[] args) throws Exception{
        SmartTV smartTv = new SmartTV();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("O canal atual é: " + smartTv.canal);
        System.out.println("O volume atual é: " + smartTv.volume);

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.mudarDeCanal();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("O canal atual é: " + smartTv.canal);
        System.out.println("O volume atual é: " + smartTv.volume);
    }
}
