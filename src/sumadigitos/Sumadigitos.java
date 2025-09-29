package sumadigitos;

import java.util.Scanner;

public class Sumadigitos {
    public static int sumaDigitos(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) + sumaDigitos(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un numero entero que sea positivo: ");
        int numero = sc.nextInt();

        int resultado = sumaDigitos(numero);
        System.out.println("La suma de los digitos de " + numero + " es: " + resultado);
    }
}
