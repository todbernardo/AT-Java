package ex7;

import java.util.Scanner;

public class Aluno {
    String nome;
    int matricula;
    double nota1;
    double nota2;
    double nota3;

    public Aluno(String nome, int matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }
    public String verificarAprovacao() {
        return calcularMedia() >= 7 && calcularMedia() <= 10 ? "aprovado" : "reprovado";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do aluno: ");
        String nomeEntrada = sc.nextLine();

        System.out.println("Matricula do aluno: ");
        int matriculaEntrada = sc.nextInt();

        System.out.println("Nota 1: ");
        double nota1Entrada = sc.nextDouble();
        if(nota1Entrada >= 7 && nota1Entrada <= 10) {

            System.out.println("Nota 2: ");
            double nota2Entrada = sc.nextDouble();

            if(nota2Entrada >= 7 && nota2Entrada <= 10) {

                System.out.println("Nota 3: ");
                double nota3Entrada = sc.nextDouble();

                if(nota3Entrada >= 7 && nota3Entrada <= 10) {

                    Aluno gabriel = new Aluno(nomeEntrada, matriculaEntrada, nota1Entrada, nota2Entrada, nota3Entrada);
                    System.out.printf("\nMédia das notas: %.2f", gabriel.calcularMedia());
                    System.out.printf("\nStatus: %s", gabriel.verificarAprovacao());

                    sc.close();
                }
                else{
                    System.out.println("Nota inválida!");
                }
            }
            else{
                System.out.println("Nota inválida!");
            }
        }
        else{
            System.out.println("Nota inválida!");
        }
    }
}
