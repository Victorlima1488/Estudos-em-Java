import java.util.Locale;
import java.util.Scanner;

public class EX_3_Fatorial {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um número e retornarei o seu faotrial: ");
        int fatorial = scanner.nextInt();

        int multi = 1;

        for(int i = fatorial; i >= 1; i--){
            multi = multi * i;
        }

        System.out.println(fatorial + "! = " + multi);
    }
}
