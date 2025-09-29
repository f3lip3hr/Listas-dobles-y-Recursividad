package vocales;

import java.util.Scanner;

public class Vocales {
    
    public static int Vocales(String texto, int indice) {
        if (indice == texto.length()) {
            return 0; 
        } else {
            char c = Character.toLowerCase(texto.charAt(indice));
            int suma = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
            return suma + Vocales(texto, indice + 1); 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un texto: ");
        String texto = sc.nextLine();
        
        int total = Vocales(texto, 0);
        
        System.out.println("El texto tiene " + total + " vocales.");
    }
}