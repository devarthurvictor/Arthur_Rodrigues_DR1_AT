package br.edu.infnet.questao9;

public class ContaBancaria {
    private String titular;
    private  double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void sacar(double valor){
        if(valor > 0 && valor <= saldo){
            this.saldo -= valor;
        }

    }

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
        }
    }

    public void exibirSaldo(){
        System.out.println("Saldo: R$ " + saldo);
    }
}
