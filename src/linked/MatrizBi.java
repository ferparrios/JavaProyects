package linked;

import java.util.Scanner;

public class MatrizBi {
    public static void main(String[] args) {

        int[] numeros = new int[2];

        int[][] arreglo = new int[4][4];

        Scanner leer;

        int i, j;
        leer = new Scanner(System.in);

        for (i = 0; i < arreglo.length; i++){
            for (j=0; j < arreglo.length; j++){
                System.out.println("Ingresa un numero");
                arreglo[i][j]= leer.nextInt();
            }
        }

        for (i = 0; i < arreglo.length; i++){
            for (j=0; j < arreglo.length; j++){
                System.out.println(arreglo[i][j]);
            }
        }
    }
}
