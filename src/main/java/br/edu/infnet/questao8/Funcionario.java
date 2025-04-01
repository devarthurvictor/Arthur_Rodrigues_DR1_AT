package br.edu.infnet.questao8;

public class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario(){
        return  salarioBase;
    }

    public void exibirSalario(){
        System.out.println(nome + " recebe R$ " + calcularSalario());
    }
}
