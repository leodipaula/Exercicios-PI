//A distância de Manhattan entre os pontos (x1, y1) e (x2, y2) é definida da seguinte forma:

//∣x2−x1∣+∣y2−y1∣

//Escreva um programa que leia os parâmetros x1, y1, x2 e y2 (nesta ordem) e imprima o valor da distância de Manhattan entre os pontos (x1, y1) e (x2, y2). Neste exercício, assuma que os valores de x1, y1, x2 e y2 são números inteiros.

import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        Scanner teclado1 = new Scanner(System.in);
        int x1 = teclado1.nextInt();
        int y1 = teclado1.nextInt();
        int x2 = teclado1.nextInt();
        int y2 = teclado1.nextInt();
        int D = Math.abs(x2-x1) + Math.abs(y2 -y1);
        System.out.println(D);
        
    }
}
