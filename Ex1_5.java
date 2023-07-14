//O gerente de uma empresa está planejando realizar um investimento, mas ele precisa de um programa para calcular o valor que ele obterá após um determinado período.

//Escreva um programa que lerá o valor do investimento inicial, a taxa de juros anual e o período que o valor ficará investido (em anos). A taxa de juros é recebida como um número fracionário, portanto, o valor 0.10 significa uma taxa de juros de 10% ao ano. O programa deve imprimir:

//Valor do investimento inicial
//Taxa de juros
//Tempo
//Valor total após o período (valor do investimento mais os rendimentos obtidos no período)

import java.util.Scanner;
import java.lang.Math;
public class Programa {
    public static void main(String[] args) {
        Scanner teclado1 = new Scanner(System.in);
        float valor = teclado1.nextFloat();
        float taxa = teclado1.nextFloat();
        int periodo = teclado1.nextInt();
        double taxa_2 = taxa+1, pot;
        pot = Math.pow(taxa_2, periodo);
        double total = valor * pot;
        System.out.printf("Valor = %.2f %n", +valor);
        System.out.printf("Taxa de juros = %.2f %n", taxa);
        System.out.println("Tempo = " +periodo);
        System.out.printf("Valor apos o periodo = %.2f", total);
    }
}
