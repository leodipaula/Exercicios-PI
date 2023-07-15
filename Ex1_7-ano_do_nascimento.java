//Implemente um algoritmo que leia, via teclado, o ano de nascimento de uma pessoa, o ano atual e mais um outro ano. Depois. calcule e mostre:

//a) A idade dessa pessoa;
//b) Quantos anos essa pessoa terá em um determinado ano definido, via teclado, pelo usuário.

import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        Scanner teclado1 = new Scanner(System.in);
        int ano_nascimento = teclado1.nextInt();
        int ano_atual = teclado1.nextInt();
        int ano_futuro = teclado1.nextInt();
        int idade_atual = ano_atual - ano_nascimento;
        int idade_futura = (ano_futuro-ano_atual) + idade_atual;
        
        System.out.println("Idade atual: " +idade_atual);
        System.out.print("Em "+ano_futuro+", a idade sera: " +idade_futura);
    }
}    
