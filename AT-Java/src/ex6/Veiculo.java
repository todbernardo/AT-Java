package ex6;

public class Veiculo {
    private String placa;
    private String modelo;
    private int ano;
    private double quilometragem;

    public void exibirDetalhes(){
        System.out.println("============VEÍCULO============");
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Quilometragem: " + quilometragem);
        System.out.println("===============================");
    }
    public void registrarViagem(double km){
        this.quilometragem += km;
    }

    public static void main(String[] args){
        Veiculo carro1 = new Veiculo();
        carro1.placa = "123ABC";
        carro1.modelo = "Modelo 93L";
        carro1.ano = 2020;
        carro1.quilometragem = 0;

        System.out.println("Sem registros de viagem: ");
        carro1.exibirDetalhes();

        System.out.println("Viagem de 300km: ");
        carro1.registrarViagem(300);
        carro1.exibirDetalhes();

        System.out.println("Viagem de 100km");
        carro1.registrarViagem(100);
        carro1.exibirDetalhes();
    }
}
