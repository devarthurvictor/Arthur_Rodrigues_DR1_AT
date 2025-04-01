package br.edu.infnet.console;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidacaoSenha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        String senha;
        while (true){
            System.out.print("Digite uma senha: ");
            senha = input.nextLine();

            if(validarSenha(senha)){
                System.out.println("Senha cadastrada com sucesso!");
                break;
            } else{
                System.out.println("ERRO: A senha deve ter no mínimo 8 caracteres e conter pelo menos uma letra maiúscula, um número e um caractere especial (@, #,$,etc.)");
                System.out.println("Tente novamente!");
            }
        }

    }

    public static boolean validarSenha(String senha) {
        String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
        return Pattern.matches(regex, senha);
    }

}
