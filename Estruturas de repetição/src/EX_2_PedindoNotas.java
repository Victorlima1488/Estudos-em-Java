import java.util.Locale;
import java.util.Scanner;

public class EX_2_PedindoNotas{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int nota;

        do{
            System.out.println("Digite uma nota entre 0 e dez");
            nota = scanner.nextInt();
        } while(nota <= 10 && nota >= 0);
    }
}