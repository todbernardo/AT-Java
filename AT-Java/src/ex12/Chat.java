package ex12;

import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro usuário: ");
        String user1 = sc.nextLine();
        System.out.println("Digite o nome do segundo usuário: ");
        String user2 = sc.nextLine();

        String[] mensagensUser1 = new String[5];
        String[] mensagensUser2 = new String[5];

        for(int i = 0; i < 5; i++) {
            System.out.println(user1 + ", digite sua mensagem: ");
            mensagensUser1[i] = sc.nextLine();

            System.out.println(user2 + ", digite sua mensagem: ");
            mensagensUser2[i] = sc.nextLine();
        }
        System.out.println("==== Histórico de Mensagens ====");
        for(int i = 0; i < 5; i++) {
            System.out.println(user1 + ": " + mensagensUser1[i]);
            System.out.println(user2 + ": " + mensagensUser2[i]);
        }
        System.out.println("\nObrigado por utilizarem o sistema! Boa sorte para vocês! \uD83D\uDE80");
        sc.close();
    }
}
