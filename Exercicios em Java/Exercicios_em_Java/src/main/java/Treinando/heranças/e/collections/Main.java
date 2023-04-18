package Treinando.heranças.e.collections;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Float> LisOfTemperature = new ArrayList<Float>();
        Scanner scanner = new Scanner(System.in);
        List<String> meses = new ArrayList<>(Arrays.asList("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"));
        Float soma = null;
        Float temp;

        do{
            System.out.println("Digite uma temperatura. quando quiser parar, digite -0: ");
            temp = scanner.nextFloat();
            LisOfTemperature.add(temp);
        }while(temp != 100);

        System.out.println(LisOfTemperature);

        for (int i = 0; i < LisOfTemperature.size(); i++) {
            soma += LisOfTemperature.get(i);
            System.out.println(meses.get(i) + ": " + LisOfTemperature.get(i) + "°");
        }

        System.out.println(soma/LisOfTemperature.size());
    }
}
