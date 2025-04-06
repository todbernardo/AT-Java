package ex10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Compras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String caminho = "compras.txt";

        System.out.println("Nome do produto: ");
        String nomeProduto = sc.nextLine();

        System.out.println("Quantidade: ");
        try{
            int qntProduto = sc.nextInt();

            System.out.println("Preço: ");
            try{
                double precoProduto = sc.nextDouble();

                try(FileWriter fw = new FileWriter("compras.txt", true)){
                    fw.write(nomeProduto + "," + qntProduto + "," + precoProduto + "\n");

                } catch (IOException e) {
                    System.out.println("Erro ao salvar o arquivo.");
                }
                try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
                    String linha;

                    while((linha = br.readLine()) != null){
                        String[] dadosArquivo = linha.split(",");

                        String nome = dadosArquivo[0];
                        String quantidade = dadosArquivo[1];
                        String preco = dadosArquivo[2];

                        System.out.println("Produto: " + nome + " | Quantidade: " + quantidade + " | Preço: R$ " + preco);
                    }
                } catch (IOException e) {
                    System.out.println("Erro ao ler o arquivo.");
                }
            } catch (Exception e){
                System.out.println("Preço inválido.");
            }
        }catch (Exception e){
            System.out.println("Quantidade inválida.");
        }
        sc.close();
    }
}
