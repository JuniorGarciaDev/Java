public class aulaUm {

    public static void main (String[] args) throws Exception{

       //tipos primitivos
        int numero = 34;
        boolean solteiro = false;
        double altura = 1.91;

       //tipos por referencia
       String nome = "Plactronic";

       System.out.println("Olá,como é o seu nome?");
       String nomeDoUsuario = new java.util.Scanner( System.in).nextLine();
       
       //%s == String
       System.out.printf("Prazer %s. meu nome é plactronic", nomeDoUsuario);
        System.out.println("");
        System.out.println("Quantos anos você tem?");
         
        int idadeDoUsuario = new java.util.Scanner( System.in).nextInt();
        // %i == int
        System.out.printf("Interesante! %d é o dobro da sua idade!", idadeDoUsuario*2);

        System.out.println("");

        System.out.printf("%s Qual a sua altura?",nomeDoUsuario);
        double alturoDoUsuario = new java.util.Scanner(System.in).nextDouble() ;
        System.out.printf("%s Legal! Eu tenho %s",alturoDoUsuario,Math.random()*100);

        System.out.println("");

        System.out.println("Tenha um bom dia! Até a proxima aula");




    }
    
}
