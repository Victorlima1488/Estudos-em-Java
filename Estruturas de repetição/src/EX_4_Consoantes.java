import java.util.Locale;
import java.util.Scanner;

public class EX_4_Consoantes {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String[] letras = new String[6];
        String[] consoantes = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        int quantConsoantes = 0;

        for(int i = 0; i <= letras.length -1; i++){
            System.out.print("Digite uma letra: ");
            String letra = scanner.next();
            letras[i] = letra;
            
            for(String c: consoantes){
                if(c.equals(letra)){
                    quantConsoantes += 1;
                }
            }
        }
        System.out.println("Dentre as letras que você escreveu, tem " + quantConsoantes + " vogais.");
    }
}
