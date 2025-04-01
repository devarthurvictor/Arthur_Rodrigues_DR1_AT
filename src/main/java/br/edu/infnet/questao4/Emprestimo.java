package br.edu.infnet.questao4;

public class Emprestimo {
    private double valorEmprestimo;
    private int parcelas;
    private double taxaJuros = 0.03;

    public Emprestimo(double valorEmprestimo, int parcelas) {
        this.valorEmprestimo = valorEmprestimo;
        this.parcelas = parcelas;
    }

    public double calcularTotalPago(){
        return valorEmprestimo * Math.pow(1 + taxaJuros, parcelas);
    }

    public double calcularValorParcela(){
        return calcularTotalPago() / parcelas;
    }
}
