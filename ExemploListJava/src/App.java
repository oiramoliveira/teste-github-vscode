import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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

        System.out.println("Exibir a posição da nora 5.0: " + notas.indexOf(5.0));

        System.out.println("Adicione na lista a nota 8.0 na posição 4");
        notas.add(4, 8.0);// adiciona
        System.out.println("Exibe a nota da posição 4: " + notas.get(4));
        System.out.println(notas);
        System.out.println("Subtitui a nota 5.0 por 6.0");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        // Percorre o array e exibe as notas
        for (Double nota : notas)
            System.out.println(nota);

        System.out.println("Exibe a 3ª nota adicionada: " + notas.get(2));

        System.out.println("Exibir a menor nota: " + Collections.min(notas));

        System.out.println("Exibir a maior nota: " + Collections.max(notas));

        System.out.println("Exibir a soma dos valores: ");
        // Método Iterator
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {// Enquanto houver elementos no arraylist os valores serão somados
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Soma dos valores = " + soma);

        System.out.println("Média das notas: " + (soma / notas.size()));

        System.out.println(notas);
        System.out.println("Remova a nota 0");
        notas.remove(0.0);
        System.out.println(notas);

        System.out.println("Remova a nota na posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista:");
        // Utiliza o metodo iterator
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7)
                iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lisa: ");
        notas.clear();

        System.out.println("Confirma se a lista está vazia: " + notas.isEmpty());

    }
}
