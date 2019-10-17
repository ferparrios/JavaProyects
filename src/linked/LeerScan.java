package linked;

import java.util.Scanner;

public class LeerScan {
    public static void main(String[] args) {
        System.out.println("Escribe tu nombre:");
        Scanner leer = new Scanner(System.in);//recibe datos por el teclado
        String nombre2 = leer.next();
        System.out.println("Escribe tu edad:");
        Scanner leer2 = new Scanner(System.in);
        int edad = leer.nextInt();


        System.out.println("Tu nombre es: " + nombre2);
        System.out.println("Tu edad es: " + edad);
    }
}
