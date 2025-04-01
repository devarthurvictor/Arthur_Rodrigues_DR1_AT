package br.edu.infnet.questao6;

public class Veiculo {
    private String placa;
    private String modelo;
    private int anoFabricacao;
    private double quilometragem;

    public Veiculo(String placa, String modelo, int anoFabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }

    public void exibirDetalhes(){
        System.out.println("Placa: "+ placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabricação: " + anoFabricacao);
        System.out.println("Quilometragem: " + quilometragem);
    }

    public void registrarViagem(double km){
        if (km > 0) {
            quilometragem += km;
        } else {
            System.out.println("ERRO: O Km deve ser maior que zero");
        }
    }
}
