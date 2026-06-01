package DateHomogeneous.Colection.Sets;
/*O HashSet armazena elementos únicos (não permite duplicatas) e não garante uma ordem específica para os itens.
Ele permite o armazenamento de valores null e oferece excelente desempenho constante O(1) para operações básicas
como adição e busca.
Principais características:
Não permitir elementos duplicados, caso inserido será ignorado.
Não ordenado: A ordem em que os elementos são adicionados não é preservada.
Implementação interna: Funciona com base em uma tabela hash (gerenciada internamente por um HashMap).
Não seguro para threads: Não é sincronizado. Deve ser tratado externamente em ambientes com múltiplas threads simultâneas.*/

import java.util.HashSet;

public class SetHash {
    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Ana"); // duplicado, será ignorado
        System.out.println(nomes); // Ordem não garantida
    }
}
