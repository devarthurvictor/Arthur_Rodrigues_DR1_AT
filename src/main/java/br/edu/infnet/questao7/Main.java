package br.edu.infnet.questao7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite a matrícula: ");
        String matricula = input.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = input.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 =input.nextDouble();

        Aluno aluno = new Aluno(nome, matricula, nota1, nota2, nota3);
        aluno.verificarAprovacao();

        input.close();

    }
}
