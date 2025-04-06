package ex3;

import java.util.Scanner;

public class CalculadoraImpostos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite seu salário mensal: ");
        double salarioMensal = sc.nextDouble();
        double salarioAnual = salarioMensal * 12;
        double imposto;

        if(salarioAnual >= 0 && salarioAnual <= 22847.76) {

            System.out.println("Você está isento de impostos.");
        }
        else if(salarioAnual >= 22847.77 && salarioAnual <= 33919.80) {

            imposto = salarioAnual * 0.075;
            salarioAnual -= imposto;

            System.out.println("Olá " + nome + "!");
            System.out.printf("Valor do imposto é: R$%.2f", imposto);
            System.out.printf("\nSalário líquido anual: R$%.2f", salarioAnual);
        }
        else if(salarioAnual >= 33919.81 && salarioAnual <= 45012.60) {

            imposto = salarioAnual * 0.15;
            salarioAnual -= imposto;

            System.out.println("Olá " + nome + "!");
            System.out.printf("Valor do imposto é: R$%.2f", imposto);
            System.out.printf("\nSalário líquido anual: R$%.2f", salarioAnual);
        }
        else if(salarioAnual >= 45012.61) {

            imposto = salarioAnual * 0.275;
            salarioAnual -= imposto;

            System.out.println("Olá " + nome + "!");
            System.out.printf("Valor do imposto é: R$%.2f", imposto);
            System.out.printf("\nSalário líquido anual: R$%.2f", salarioAnual);
        }
        sc.close();
    }
}
