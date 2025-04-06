package desafios2.ex4;

public class ContaBancaria {
    public String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if(saldo >= valor) {
            saldo -= valor;
        }
    }
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Ana", 100);
        ContaBancaria conta2 = new ContaBancaria("Bob", 200);
        ContaBancaria conta3 = new ContaBancaria("Carlos", 300);

        ContaBancaria[] contas = {conta1, conta2, conta3};

        contas[0].sacar(50);
        contas[0].depositar(100);
        contas[1].sacar(50);
        contas[1].depositar(100);
        contas[2].sacar(50);
        contas[2].depositar(100);
    }
}
