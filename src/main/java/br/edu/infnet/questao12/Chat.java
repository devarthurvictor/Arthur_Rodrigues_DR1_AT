package br.edu.infnet.questao12;

import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro usuário: ");
        String usuario1 = input.nextLine();
        System.out.print("Digite o nome do segundo usuário: ");
        String usuario2 = input.nextLine();

        String[] mensagens = new String[10];
        for (int i = 0; i < 5; i++) {

            System.out.println(usuario1 + ", digite sua mensagem: ");
            mensagens[i * 2] = usuario1 + ": " + input.nextLine();

            System.out.println(usuario2 + ", digite sua mensagem: ");
            mensagens[i * 2 + 1] = usuario2 + ": " + input.nextLine();
        }

        System.out.println("Mensagens trocadas entre " + usuario1 + " e " + usuario2 + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println(mensagens[i]);
        }

        System.out.println("A conversa chegou ao fim. Até logo!");
        input.close();
    }
}
