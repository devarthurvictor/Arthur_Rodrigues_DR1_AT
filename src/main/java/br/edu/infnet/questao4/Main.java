package br.edu.infnet.questao4;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite o valor do emprestimo: ");
        double valorEmprestimo = input.nextDouble();;

        int parcelas;
        do{
            System.out.print("Digite o número de parcelas (entre 6 e 48):");
            parcelas = input.nextInt();
        } while (parcelas < 6 || parcelas > 48);

        Emprestimo emprestimo = new Emprestimo(valorEmprestimo, parcelas);
        double totalPago = emprestimo.calcularTotalPago();
        double valorParcela = emprestimo.calcularValorParcela();

        System.out.println(nome + ", o total a ser pago será: " + formatoMoeda.format(totalPago));
        System.out.println("Valor da parcela mensal: " + formatoMoeda.format(valorParcela));

        input.close();
    }
}
