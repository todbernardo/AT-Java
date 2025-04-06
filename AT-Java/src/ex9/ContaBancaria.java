package ex9;

public class ContaBancaria {
    String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }
    public void sacar(double valor) {
        if(saldo >= valor) {
            saldo -= valor;
        } else{
            System.out.println("Saldo insuficiente");
        }
    }
    public void exibirSaldo() {
        System.out.println("Saldo: R$" + saldo);
    }
    public static void main(String[] args) {

        ContaBancaria conta =  new ContaBancaria("Lucas", 1500);

        System.out.println("==========CONTA==========");
        conta.exibirSaldo();
        conta.sacar(1000);
        conta.exibirSaldo();
        conta.depositar(2500);
        conta.exibirSaldo();
        System.out.println("=========================");

    }
}
