package arreglo;

import java.util.Scanner;

public class Arreglo {

    public static void mostrarArreglo(int[] arreglo, int indice) {
        if (indice == arreglo.length) { // Caso base: fin del arreglo
            return;
        }
        System.out.println("Indice " + indice + " : " + arreglo[indice]);
        mostrarArreglo(arreglo, indice + 1); // Llamada recursiva
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la dimension del arreglo: ");
        int n = sc.nextInt();

        int[] arreglo = new int[n];
        System.out.println("Ingrese los valores del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento en indice " + i + ": ");
            arreglo[i] = sc.nextInt();
        }

        System.out.println("Mostrando indices y valores del arreglo:");
        mostrarArreglo(arreglo, 0);
    }
}