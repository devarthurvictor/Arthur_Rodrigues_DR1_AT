package br.edu.infnet.questao3;

public class ImpostoDeRenda {
    private double salarioAnual;

    public ImpostoDeRenda(double salarioMensal) {
        this.salarioAnual = salarioMensal * 12;
    }

    public double calcularImposto(){
        if(salarioAnual <= 22847.76){
            return 0;
        } else if (salarioAnual >= 22847.77 && salarioAnual <= 33919.80){
            return salarioAnual * 0.075;
        } else if (salarioAnual >= 33919.81 && salarioAnual <= 45012.60){
            return  salarioAnual * 0.15;
        } else {
            return salarioAnual * 0.275;
        }
    }

    public double calcularSalarioLiquido(){
        return  salarioAnual - calcularImposto();
    }
}
