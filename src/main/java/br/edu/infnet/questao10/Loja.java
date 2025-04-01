package br.edu.infnet.questao10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {
    private static final String ARQUIVO_COMPRAS = "compras.txt";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Compra> compras = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Cadastro da compra " + i);
            Compra compra = obterCompra(input);
            compras.add(compra);
        }
        salvarComprasNoArquivo(compras);
        System.out.println("\nCompras registradas:");
        lerComprasDoArquivo();

    }

    private static Compra obterCompra(Scanner input) {
        System.out.print("Produto: ");
        String produto = input.nextLine();

        System.out.print("Quantidade: ");
        int quantidade = Integer.parseInt(input.nextLine());

        System.out.print("Preço unitário: ");
        double precoUnitario = Double.parseDouble(input.nextLine());

        return new Compra(produto, quantidade, precoUnitario);
    }

    private static void salvarComprasNoArquivo(List<Compra> compras) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO_COMPRAS))) {
            for (Compra compra : compras) {
                writer.write(compra.toString());
                writer.newLine();
            }
            System.out.println("\nCompras salvas com sucesso no arquivo!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar compras no arquivo: " + e.getMessage());
        }
    }

    private static void lerComprasDoArquivo(){
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO_COMPRAS))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
