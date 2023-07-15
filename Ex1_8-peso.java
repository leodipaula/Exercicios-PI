//Implemente um algoritmo que calcule e mostre o peso, informado pelo usuário, se a pessoa engordar e emagrecer 34% e 13% sobre o peso digitado, respectivamente.

import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
     // ENTRADAS   
        Scanner teclado1 = new Scanner(System.in);
        float peso = teclado1.nextFloat();
     // PROCESSAMENTO   
        double engordou_1 = 0.34 * peso;
        double engordou = engordou_1 + peso;
        double emagreceu_1 = 0.13 * peso;
        double emagreceu = peso - emagreceu_1;
     //SAIDA   
        System.out.printf("Peso (engordou): %.2f\n", +engordou);
        System.out.printf("Peso (emagreceu): %.2f\n", +emagreceu);
    }
}    
