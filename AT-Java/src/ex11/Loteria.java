package ex11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Loteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random randNumber = new Random();

        int[] arrayRandomNumbers = new int[6];
        int[] arrayChutes = new int[6];
        int acertos = 0;
        boolean temRepetidos = true;

        do{

            for(int i = 0; i < arrayRandomNumbers.length; i++){

                int randomNumbers = randNumber.nextInt(60) + 1;

                if(Arrays.stream(arrayRandomNumbers).noneMatch(num -> num == randomNumbers)){
                    arrayRandomNumbers[i] = randomNumbers;
                    temRepetidos = false;
                }
                else{
                    temRepetidos = true;
                }
                System.out.println(arrayRandomNumbers[i]);
            }
        }
        while(temRepetidos);
        try{
            for(int i = 0; i < arrayChutes.length; i++){

                System.out.printf("Insira o %dº número: \n", i + 1);
                int chute = sc.nextInt();

                if(chute > 0 && chute <= 60){
                    if(Arrays.stream(arrayChutes).noneMatch(n -> n == chute)){
                        arrayChutes[i] = chute;
                    }
                    else{
                        System.out.println("Você não pode repetir números");
                        return;
                    }
                }
                else{
                    System.out.println("Erro: número inválido");
                    return;
                }
            }
            for(int i = 0; i < arrayRandomNumbers.length; i++){
                for(int number : arrayRandomNumbers){
                    if(number == arrayChutes[i]){
                        acertos++;
                    }
                }
            }
            System.out.println("Acertos: " + acertos);
        }
        catch(Exception e){
            System.out.println("Erro: número inválido");
        }

    }
}
