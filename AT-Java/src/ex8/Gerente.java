package ex8;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario(){
        return this.salario * 1.2;
    }
}
