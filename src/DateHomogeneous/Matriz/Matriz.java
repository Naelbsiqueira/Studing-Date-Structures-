package DateHomogeneous.Matriz;
/*Uma matriz  é um array bidimensional (um "array de arrays") organizado em linhas e colunas, usado para armazenar
dados do mesmo tipo. As posições são acessadas por dois índices numéricos (linha e coluna), e ambos começam sempre em zero.*/

public class Matriz {

    public static void main(String[] args) {

        int[][] array = {
                {1, 2,},
                {3, 4, 5}
        };

        int[][] x = new int[3][];

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

// Primeiro for percorre as linhas
        for (int i = 0; i < matriz.length; i++) {
            // Segundo for percorre as colunas da linha atual
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Pula linha para a próxima linha da matriz
        }




    }
}
