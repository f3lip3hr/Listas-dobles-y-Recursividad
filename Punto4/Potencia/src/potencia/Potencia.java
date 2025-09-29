package potencia;

import java.util.Scanner;

public class Potencia {
    
    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1; 
        } else {
            return base * potencia(base, exponente - 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la base: ");
        int base = sc.nextInt();
        
        System.out.print("Ingrese el exponente: ");
        int exp = sc.nextInt();
        
        int resultado = potencia(base, exp);
        
        System.out.println(base + " ^ " + exp + " = " + resultado);
    }
}