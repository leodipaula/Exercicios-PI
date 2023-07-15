//Escreva um programa que leia o endereço de e-mail do remetente, o endereço de e-mail do destinatário e o texto da mensagem. Após isso, imprima o e-mail no seguinte formato:

//De:<endereço remetente>
//Para:<endereço destinatário>
//Mensagem:<texto da mensagem>

import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
   // ENTRADA     
        Scanner teclado1 = new Scanner(System.in);
        String remetente = teclado1.nextLine();
        String destinatario = teclado1.nextLine();
        String mensagem = teclado1.nextLine();
   // SAIDA     
        System.out.println("De:" +remetente);
        System.out.println("Para:" +destinatario);
        System.out.println("Mensagem:" +mensagem);
        
    }
}
