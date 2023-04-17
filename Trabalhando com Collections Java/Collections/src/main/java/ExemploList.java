import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploList {
    public static void main(String[] args){
//        List notas = new ArrayList(); //Antes do Java 5
//        List<Double> notas = new ArrayList<Double>(); //Generics(jdk 5) - Diamond Operador
//        ArrayList<Double> notas = new ArrayList<>();
//        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 5d, 7d, 0d, 3.6));
//        List<Double> notas = Arrays.asList(7d, 8.5, 5d, 7d, 0d, 3.6);
//        notas.add(10d);
//        System.out.println(notas);
        List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);

    }

}
