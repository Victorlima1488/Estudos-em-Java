import java.util.Random;

public class EX_5_NumerosAleatorios {
    
    public static void main(String[] args){

        Random random = new Random();

        int[] numeros = new int[20];

        for(int i = 0; i < numeros.length; i++){
            int numero = random.nextInt(100);
            numeros[i] = numero;
            System.out.println(numeros[i]);
        }

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i] + " + 1 = " + (numeros[i] + 1));
        }
    }
}
