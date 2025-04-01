package br.edu.infnet.questao8;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Messi", 5000);
        Funcionario estagiario = new Estagiario("Neymar", 2000);

        gerente.exibirSalario();
        estagiario.exibirSalario();

    }
}
