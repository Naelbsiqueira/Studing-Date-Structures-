package DateHomogeneous.Arrays.List;
/*Um ArrayList em Java é uma estrutura de dados que funciona como um array dinâmico redimensionável.
Diferente dos arrays tradicionais, ele não tem tamanho fixo. Ele cresce e diminui automaticamente conforme
elementos são adicionados ou removidos. Ele pertence ao pacote java.util e é uma implementação da interface*/

import java.util.ArrayList;

public class ArrayLista {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();

        // Adicionando elementos
        nomes.add("Ana");
        nomes.add("Bruno");

        System.out.println(nomes); // Saída: [Ana, Bruno]
    }
    }

