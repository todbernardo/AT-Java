package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CadeiaDeDna {
    public int gerarCadeiaDeDna() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho da cadeia: ");
        int tamanho = sc.nextInt();

        return tamanho;
    }
}

class AlgoritmosGeneticos{
    public String[] gerarSequenciasAleatorias(){
        Random rand = new Random();

        char[] letras = {'A', 'T', 'C', 'G'};
        String sequencia1 = "";
        String sequencia2 = "";

        CadeiaDeDna cadeia = new CadeiaDeDna();
        int tamanho = cadeia.gerarCadeiaDeDna();

        for(int i = 0; i < tamanho; i++){

            sequencia1 += letras[rand.nextInt(4)];
            sequencia2 += letras[rand.nextInt(4)];
        }
        return new String[]{sequencia1, sequencia2};
    }
    public String[] recombinacao(String s0, String s1) {
        Random rand = new Random();

        String[] sequencias = gerarSequenciasAleatorias();
        int tamanhoSequencia = sequencias[0].length();

        int fatorDeCorte = rand.nextInt(tamanhoSequencia);

        List<Character> sequencia1Char = new ArrayList<>();
        List<Character> sequencia2Char = new ArrayList<>();

        for(char letra : sequencias[0].toCharArray()){
            sequencia1Char.add(letra);
        }
        for(char letra : sequencias[1].toCharArray()){
            sequencia2Char.add(letra);
        }

        List<Character> sequencia1Cortada = new ArrayList<>();
        List<Character> sequencia2Cortada = new ArrayList<>();

        for(int i = fatorDeCorte; i < tamanhoSequencia; i++){
            sequencia1Cortada.add(sequencia1Char.get(i));
            sequencia2Cortada.add(sequencia2Char.get(i));
        }
        for(int i = 0, j = fatorDeCorte; i < sequencia1Cortada.size(); i++, j++){
            sequencia1Char.set(j, sequencia2Cortada.get(i));
            sequencia2Char.set(j, sequencia1Cortada.get(i));
        }
        String sequencia1Recombinada = "";
        String sequencia2Recombinada = "";

        for(char letra : sequencia1Char){
            sequencia1Recombinada += letra;
        }
        for(char letra : sequencia2Char){
            sequencia2Recombinada += letra;
        }

        String[] sequenciasRecombinadas = {sequencia1Recombinada, sequencia2Recombinada};

        System.out.println("Fator de corte: " + fatorDeCorte);
        System.out.println(sequencias[0]);
        System.out.println(sequencias[1]);
        System.out.println(sequencia1Recombinada);
        System.out.println(sequencia2Recombinada);

        return sequenciasRecombinadas;
    }

    public void mutacao(String sequenciaSorteada){
        Random rand = new Random();
        char[] letras = {'A', 'T', 'C', 'G'};

        char[] sequenciaSorteadaChars = sequenciaSorteada.toCharArray();

        int indiceSorteado = rand.nextInt(sequenciaSorteada.length());
        char letraOriginal = sequenciaSorteada.charAt(indiceSorteado);
        char letraNova;

        do{
            letraNova = letras[rand.nextInt(4)];
        } while(letraNova == letraOriginal);

        String sequenciaMutada = "";

        sequenciaSorteadaChars[indiceSorteado] = letraNova;
        for(char c : sequenciaSorteadaChars){
            sequenciaMutada += c;
        }
        System.out.println("Resultado da mutação: ");
        System.out.println("Índice Aleatório na mutação: " + indiceSorteado);
        System.out.println(sequenciaSorteada);
        System.out.println(sequenciaMutada);
    }
}

class Main{
    public static void main(String[] args) {
        Random rand = new Random();

        AlgoritmosGeneticos algoritmos = new AlgoritmosGeneticos();
        String[] sequencias = algoritmos.gerarSequenciasAleatorias();

        String sequenciaSorteada = sequencias[rand.nextInt(2)];

        algoritmos.mutacao(sequenciaSorteada);
        System.out.println("===================");
        algoritmos.recombinacao(sequencias[0], sequencias[1]);
        System.out.println("===================");
    }
}
