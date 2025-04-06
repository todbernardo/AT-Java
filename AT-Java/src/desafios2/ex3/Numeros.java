package desafios2.ex3;

import java.util.Arrays;

public class Numeros {
    public static void main(String[] args) {

        int[] numeros = {42, 7, 13, 89, 24, 56, 31, 68, 3, 77};

        Arrays.sort(numeros);

        System.out.println("Array ordenado:");

        for(int numero : numeros){
            System.out.print(numero + ", ");
        }

        System.out.println("\nMenor número: " + numeros[0]);
        System.out.println("Maior número: " + numeros[numeros.length - 1]);
    }
}
