package br.edu.infnet.questao9;

public class Main {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria("Machado de Assis", 2000);

        cb.depositar(200);
        cb.exibirSaldo();

        cb.sacar(700);
        cb.exibirSaldo();
    }
}
