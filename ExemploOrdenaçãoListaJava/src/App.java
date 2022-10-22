import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.print.attribute.standard.JobName;

public class App {
    public static void main(String[] args) throws Exception {

        List<Gato> meusGatos = new ArrayList<>() {
            {
                add(new Gato("Jon", 18, "Preto"));
                add(new Gato("Simba", 6, "Tigrado"));
                add(new Gato("Jon", 12, "Amarelo"));
            }
        };

        // Ordem de inserção na list
        System.out.println(meusGatos);

        // ordem aleatoria
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        // Ordem natural po nome, utiliza o comparable na classe gato

    }
}
