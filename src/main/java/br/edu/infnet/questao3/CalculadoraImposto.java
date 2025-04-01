package br.edu.infnet.questao3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraImposto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite seu salário mensal: ");
        double salarioMensal = input.nextDouble();

        ImpostoDeRenda ir = new ImpostoDeRenda(salarioMensal);
        double imposto = ir.calcularImposto();
        double salarioLiquido = ir.calcularSalarioLiquido();

        System.out.println(nome + ", seu imposto de renda anual é: " + formatoMoeda.format(imposto));
        System.out.println("Seu salário líquido anual é: " + formatoMoeda.format(salarioLiquido));

        input.close();

    }
}
