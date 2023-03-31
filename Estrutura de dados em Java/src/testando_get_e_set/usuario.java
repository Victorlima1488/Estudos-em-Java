package testando_get_e_set;

import java.util.Locale;
import java.util.Scanner;

public class usuario {
    public static void main(String[] args){
        Caneta caneta = new Caneta();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o modelo da caneta: ");
        String modelo = scanner.next(); 

        System.out.println("Digite a numeração ponta da caneta: ");
        String ponta = scanner.next(); 

        caneta.setModelo(modelo);
        caneta.setPonta(ponta);

        System.out.println(caneta.getModelo());
        System.out.println(caneta.getPonta());
    }
}
