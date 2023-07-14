//Implemente um algoritmo que calcule a área de um triângulo (area = (base*altura) / 2), sendo que a base e a altura devem ser definidas pelo usuário (teclado).

//Observação: imprima o valor da área usando duas casas decimais.

import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        Scanner teclado1 = new Scanner(System.in);
        float base = teclado1.nextFloat();
        float altura = teclado1.nextFloat();
        float area = (base*altura)/2;
        System.out.printf("Valor = %.2f", +area);
    }
}        
