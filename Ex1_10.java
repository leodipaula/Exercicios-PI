//O professor calcula a nota do curso (N) da seguinte forma:

//N = 0,6 x NT + 0,4 x NP + 0,05 x ML

//Neste cálculo, NT é a nota da parte teórica, NP é a nota prática e ML é a média obtida em um curso com exercícios extras (usados para bônus).

//O cálculo do NT é realizado da seguinte forma:

//0,5 x PT1 + 0,5 x PT2

//Neste cálculo, PT1 e PT2 são as notas de duas provas, e MET a uma média dos exercícios teóricos.

//O cálculo do NT é realizado da seguinte forma:

//NP = 0,3 x PP1 + 0,5 x PP2 + 0,2 x MEP

//Neste cálculo, PP1 e PP2 são as notas de duas provas, e MEP a uma média dos exercícios práticos.

//Escreva um programa que leia as notas PT1, PT2, PP1, PP2, MEP e ML. Após isso, imprima os valores de NT, NP e N.

import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        Scanner teclado1 = new Scanner(System.in);
        int pt1 = teclado1.nextInt();
        int pt2 = teclado1.nextInt();
        int pp1 = teclado1.nextInt();
        int pp2 = teclado1.nextInt();
        int mep = teclado1.nextInt();
        int ml = teclado1.nextInt();
        
        double nt = (0.5*pt1)+(0.5*pt2);
        double np = (0.3*pp1)+(0.5*pp2)+(0.2*mep);
        double n = (0.6*nt)+(0.4*np)+(0.05*ml);
        
        System.out.printf("Nota teorica: %.2f %n", +nt);
        System.out.printf("Nota pratica: %.2f %n", +np);
        System.out.printf("Nota: %.2f", +n);
        
    }
}
