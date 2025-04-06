package desafios2.ex5;

import java.util.Scanner;

public class Aluno {
    String nome;
    double[] notas;

    public Aluno(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public double calcularMedia() {
        double media = 0;

        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        return media / notas.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno1 = new Aluno("Jorge", new double[]{4, 6, 9});
        ;
        Aluno aluno2 = new Aluno("Cleber", new double[]{2, 5, 6});
        Aluno aluno3 = new Aluno("Paulo", new double[]{9, 9, 8});

        System.out.println("Média do aluno 1: " + aluno1.calcularMedia());
        System.out.println("Média do aluno 2: " + aluno2.calcularMedia());
        System.out.println("Média do aluno 3: " + aluno3.calcularMedia());
    }
}
