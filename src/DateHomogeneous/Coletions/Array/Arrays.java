package DateHomogeneous.Coletions.Array;
/*Um array é um objeto/estrutura liner ou unidimencional que serve como um contêiner para armazenar uma quantidade
fixa de dados do mesmo tipo. Em vez de criar várias variáveis para armazenar valores individuais, você pode usa um
array para agrupar todos eles sob uma única variável, facilitando a organização e a manipulação dos dados*/

public class Arrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] numeros = new int[5];

// Preenchendo as posições
        numeros[0]=10;
        numeros[1]=20;
        numeros[2]=30;
        numeros[3]=40;
        numeros[4]=50;
        for(int i=0; i<array.length; i++){
            System.out.print(" "+  array[i]
            );
        }
        System.out.println("--------------------------------");
        for(int i=0; i<numeros.length; i++){
            System.out.printf("%d ", numeros[i]
            );
        }
    }

}


