package DateHomogeneous.Coletions.List.LinkedLista;
import java.util.LinkedList;
/*Uma lista ligada (ou lista encadeada) é uma estrutura de dados linear e dinâmica em que os elementos
não ficam armazenados em posições contínuas de memória. Cada item (conhecido como nó) guarda o dado
desejado e uma referência para o próximo elemento da sequência.*/

public class LinkedLista {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
    }
}
