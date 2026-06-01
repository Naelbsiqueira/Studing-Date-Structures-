package DateHomogeneous.Colection.Sets;
import java.util.*;
/*Um LinkedHashSet é uma coleção que evita duplicatas (pois implementa a interface Set) e mantém a ordem de inserção dos elementos.
Ele combina a velocidade de busca de uma tabela Hash com a previsibilidade de uma lista encadeada
Principais CaracterísticasSem duplicatas:
Não permite elementos repetidos. Se você tentar adicionar um elemento que já existe, a operação é ignorada.
Ordenação previsível: Diferente do HashSet comum, que bagunça os elementos, o LinkedHashSet itera pelos elementos
exatamente na mesma ordem em que foram adicionados ao conjunto.
Performance: É ligeiramente mais lento para inserir e remover do que um HashSet puro, pois tem o custo extra de manter
uma lista duplamente encadeada nos bastidores. No entanto, sua complexidade se mantém em tempo constante O(1) para operações básicas.
Permite nulos: Aceita um único elemento null.*/

public class SetHashLinked {
    public static void main(String[] args) {
        // Criando um LinkedHashSet de Strings
        Set<String> linguagens = new LinkedHashSet<>();

        // Adicionando elementos
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("C++");

        // Elemento duplicado (será ignorado)
        linguagens.add("Java");

        // Imprimindo os elementos (mantém a ordem de inserção)
        System.out.println("Elementos: " + linguagens);

        // Verificando se contém um elemento
        boolean contem = linguagens.contains("Python");
        System.out.println("Contém Python? " + contem);

        // Removendo um elemento
        linguagens.remove("C++");

        // Iterando pelos elementos
        System.out.println("\nIterando:");
        for (String lang : linguagens) {
            System.out.println("- " + lang);
        }
    }
}
