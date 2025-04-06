package ex4;

import java.util.Scanner;

public class SimuladorEmprestimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o valor do empréstimo: ");
        double valor = sc.nextDouble();

        System.out.println("Digite o número de parcelas (mín. 6 / máx. 48): ");
        int parcelas = sc.nextInt();

        if(parcelas >= 6 && parcelas <= 48) {

            double jurosMensal = valor * 0.03;
            double emprestimo = jurosMensal * parcelas;
            double total = valor + emprestimo;

            System.out.println("Olá " + nome + "!");
            System.out.println("Valor total a ser pago: R$" + total);
            System.out.println("Valor da parcela mensal: R$" + jurosMensal);
        }
        else{
            System.out.println("Número de parcelas inválido.");
        }
        sc.close();
    }
}
