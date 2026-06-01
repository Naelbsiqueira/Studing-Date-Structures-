package DateHomogeneous.Coletions.List.SetOrConjuntos;
/* O TreeSet é uma coleção que armazena elementos únicos de forma automaticamente ordenada.
Ele implementa a interface NavigableSet e utiliza uma árvore binária balanceada (Árvore Rubro-Negra)
em seu interior.
Sem duplicatas: Por ser um Set, ele não permite elementos repetidos. Se tentar adicionar um elemento que já existe,
a inserção será ignorada.
Ordenação: Os elementos são organizados na ordem crescente natural (ex: alfabética ou numérica)
ou por um Comparator customizado no momento da criação.
Performance: Operações como add, remove e contains têm complexidade (O log n), o que é um pouco mais lento que o HashSet O(1),
mas garante a ordenação.
Valores Nulos: O TreeSet não aceita elementos nulos (null), pois tenta compará-los com outros elementos,
o que geraria um NullPointerException*/

import java.util.*;

public class SetTree {
        public static void main(String args [] ) {
        Set <String> set = new TreeSet<String>();
        set.add("Nael");
        set.add("Bernardo");
        set.add("Alberto");
        set.add("Bernardo");
        set.add("Guilherme ");
        System.out.println(set);
    }
}
