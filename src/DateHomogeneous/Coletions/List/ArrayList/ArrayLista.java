package DateHomogeneous.Coletions.List.ArrayList;
/*Um ArrayList em Java é uma estrutura de dados que funciona como um array dinâmico redimensionável é que aceita
elementos de tipos diferentes.Ele não tem tamanho fixo. Ele cresce e diminui automaticamente conforme
elementos são adicionados ou removidos. Ele pertence ao pacote java.util e é uma implementação da interface*/

import java.util.ArrayList;

public class ArrayLista {
    public static void main(String[] args) {
        ArrayList nomes = new ArrayList<String>();

        // Adicionando elementos
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add(10.3);
        nomes.add(true);
        System.out.println(nomes); // Saída: [Ana, Bruno]
    }
    }

