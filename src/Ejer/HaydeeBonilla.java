
package Ejer;

import java.util.Scanner;


public class HaydeeBonilla {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        String N ;
        String A ;
        
        System.out.println("Ingrese su nombre: ");
        N = l.next();
        
        System.out.println("Ingrese su apellido: ");
        A = l.next();
        
        System.out.println("Su nombre es: " + N + " " + A);
    }
}
