public class aulaCinco {

    public static void main (String[] args){
        System.out.println("Criando um objeto da classe Livro");
        Livro livroUm = new Livro();
        livroUm.setnada("O Senhor dos Anéis");

        System.out.println("Livro um: " + livroUm.getnada());
    }
    
}

class Livro {
    String titulo;
    String autor;
    int numeroDePaginas;
    String editora;

    public void setnada(String novoTitulo){
        this.titulo = novoTitulo;
    }

    public String getnada(){
        return this.titulo;
    }
}