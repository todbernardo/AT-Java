package ex2;

import java.util.Scanner;

public class ValidacaoSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean senhaValida;

        System.out.println("Digite seu usuário:");
        sc.nextLine();

        do{
            senhaValida = true;

            System.out.println("Digite a senha: ");
            String senha = sc.nextLine();

                if(!(senha.length() >= 8)) {
                    System.out.println("Senha deve ter pelo menos 8 caracteres!");
                    senhaValida = false;
                }
                if(!(senha.matches(".*[!@#$%¨&*].*"))){
                    System.out.println("Senha deve ter pelo menos 1 caracter especial!");
                    senhaValida = false;
                }
                if(!(senha.matches(".*[A-Z].*"))){
                    System.out.println("Senha deve ter pelo menos 1 letra maiúscula!");
                    senhaValida = false;
                }
                if(!senha.matches(".*[0-9].*")){
                    System.out.println("Senha deve ter pelo menos 1 número");
                    senhaValida = false;
                }
                
        }while(!senhaValida);
        System.out.println("Login feito com sucesso!");
        sc.close();
    }
}
