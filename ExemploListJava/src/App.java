import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Crie uma lista e adcione as sete notas");
        List<Double> notas = new ArrayList<>(); // Cria um arraylist de dobles usando <> generics
        // Adicionar itens a lista
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        // Imprime na tela o conteudo de notas
        System.out.println(notas);

    }
}
