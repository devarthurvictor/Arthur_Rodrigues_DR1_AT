package br.edu.infnet.questao6;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo("ABC-1234", "Sedan", 2020, 15000);
        carro.exibirDetalhes();
        carro.registrarViagem(200);
        carro.exibirDetalhes();

        System.out.println("----------------------------------------");

        Veiculo carro2 = new Veiculo("CBA-4321", "SUV", 2022, 12770);
        carro2.exibirDetalhes();
        carro2.registrarViagem(6000);
        carro2.exibirDetalhes();
    }
}
