package desafios2.ex1;

import java.util.Scanner;

public class LeitorString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira uma frase:");
        String frase = sc.nextLine();

        int contador = 0;

        for(int i = 0; i < frase.length(); i++) {

            char letra = frase.charAt(i);
            if(letra == 'a' || letra == 'A'){
                contador++;
            }
        }
        System.out.println("A letra 'a' aparece " + contador + " vezes.");

        if(frase.startsWith("java") || frase.startsWith("Java")){
            System.out.println("A frase começa com 'Java'");
        }
        else{
            System.out.println("A frase não começa com 'Java'");
        }

        if(frase.contains("java") || frase.contains("Java")){
            frase = frase.replace("java", "Python");
            frase = frase.replace("Java", "Python");
            System.out.println("\nFrase modificada: " + frase);
        }
    }
}
