package ex8;

public class TesteClasse {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Cleber", 5000);
        Estagiario estagiario = new Estagiario("Sergio", 1500);

        System.out.println("Salário do " + gerente.nome + ": R$" + gerente.calcularSalario());
        System.out.println("Salário do " + estagiario.nome + ": R$" + estagiario.calcularSalario());
    }
}
