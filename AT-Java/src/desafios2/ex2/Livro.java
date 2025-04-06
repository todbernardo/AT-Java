package desafios2.ex2;

public class Livro {
    String titulo;
    String autor;
    int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void ExibirLivros(){
        System.out.println("======== LIVRO ========");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano: " + this.ano);
    }
    public static void main(String[] args) {
        Livro livro1 = new Livro("Ladrao de Raios", "Rick Riordan", 2006);
        Livro livro2 = new Livro("Mar de Monstros", "Rick Riordan", 2007);
        Livro livro3 = new Livro("Maldicao do Tita", "Rick Riordan", 2008);
        Livro livro4 = new Livro("A Batalho do Labirinto", "Rick Riordan", 2009);
        Livro livro5 = new Livro("O Ultimo Olimpiano", "Rick Riordan", 2010);

        Livro[] livros = {livro1, livro2, livro3, livro4, livro5};

        for(Livro livro : livros){
            livro.ExibirLivros();
        }
    }
}
