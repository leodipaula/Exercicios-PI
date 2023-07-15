//Implemente um algoritmo que leia três números (a, b e c) e então calcule:

//1) O quadrado de a;
//2) O cubo de a;
//3) Resto da divisão de b por c.

import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        Scanner teclado1 = new Scanner(System.in);
        int a = teclado1.nextInt();
        int b = teclado1.nextInt();
        int c = teclado1.nextInt();
        double a_quadrado = Math.pow(a, 2);
        int quadrado_int = (int) Math.round(a_quadrado);
        double a_cubo = Math.pow(a, 3);
        int cubo_int = (int) Math.round(a_cubo);
        int bc_resto = b%c;
        
        System.out.println("Quadrado de "+a+":" +quadrado_int);
        System.out.println("Cubo de "+a+":" +cubo_int);
        System.out.print("Resto de "+b+" por "+c+":" +bc_resto);
        
    }
}
