import java.util.Locale;
import java.util.Scanner;

public class Ex_1_nomeEIdade {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nome;
        int idade;

        while(true){
            System.out.println("Informe o seu nome: ");
            nome = scanner.next();

            if(nome.equals("0")) break;

            System.out.println("Informe a sua idade");
            idade = scanner.nextInt();

            System.out.println("Seu nome é " + nome + ", e você tem " + idade + " anos");
        }
    }
}
