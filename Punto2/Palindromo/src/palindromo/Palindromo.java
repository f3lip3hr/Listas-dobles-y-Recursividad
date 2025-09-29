package palindromo;

import java.util.Scanner;

public class Palindromo {
    public static boolean Palindromo(String palabra, int inicio, int fin) {
        if (inicio >= fin) {
            return true;
        }
        if (palabra.charAt(inicio) != palabra.charAt(fin)) {
            return false;
        }
        return Palindromo(palabra, inicio + 1, fin - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        boolean resultado = Palindromo(palabra.toLowerCase(), 0, palabra.length() - 1);
        System.out.println("La palabra \"" + palabra + "\" es palindromo? " + resultado);
    }
}