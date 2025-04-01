package br.edu.infnet.questao11;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class JogoLoteria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int[] numerosSorteados = new int[6];
        for (int i = 0; i < 6; i++) {
            numerosSorteados[i] = random.nextInt(60) + 1;
        }

        int[] numerosUsuario = new int[6];
        System.out.println("Digite 6 números entre 1 e 60:");

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numerosUsuario[i] = input.nextInt();
        }

        int acertos = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (numerosSorteados[i] == numerosUsuario[j]) {
                    acertos++;
                }
            }
        }
        System.out.println("Você teve " + acertos + " acertos!");

    }
}
