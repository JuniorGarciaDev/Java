public class jogoDaVelha {
    public static void main (String[] args){
    char p1=' ',p2=' ',p3=' ',p4=' ',p5=' ',p6=' ',p7=' ',p8=' ',p9=' ';
    char jogador;
    int contj = 0,ganhador = 0;
    int posicao;
    System.out.println("\t " + p1 + " | " + p2 + " | " + p3);
    System.out.println("\t___|___|___");
    System.out.println("\t " + p4 + " | " + p5 + " | " + p6);
    System.out.println("\t___|___|___");
    System.out.println("\t " + p7 + " | " + p8 + " | " + p9);
    System.out.println("\t   |   | ");

    System.out.printf("\n\nBem vindo ao jogo da velha");
    System.out.printf("\n\n\nQual jogador vai começar ? X ou O :");
    jogador = new java.util.Scanner( System.in).next().charAt(0);
    if (jogador != 'X' && jogador != 'O'){
        System.out.printf("\n\nValor Invalido o jogador que vai começar sera o jogador X por causa do valor invalido\n\n");
        jogador = 'X';
    }
    if (jogador == 'X'){
        contj = 1;
    }else if(jogador == 'O') {
        contj = 2;
    }
    do{
    if(contj == 1){
    jogador = 'X';
    contj=2;
    System.out.printf("\nÉ a vez do jogador X\n");
    }else if (contj == 2){
    jogador = 'O';
    contj = 1;
    System.out.printf("\nÉ a vez do jogador O\n");
    }


    System.out.printf("qual posição vc deseja acessar?\n");
    posicao = new java.util.Scanner(System.in).nextInt();
    switch(posicao){
        case 1:
            if (p1 == ' '){
            p1 = jogador;
            }else {
                System.out.printf("Posição ja ocupada");
                if (contj == 1){
                contj =2;
            }else {
                contj = 1;
            }
            }
            break;

        case 2:
            if (p2 == ' '){
            p2 = jogador;
            }else {
                System.out.printf("Posição ja ocupada");
                if (contj == 1){
                contj =2;
            }else {
                contj = 1;
            }
            }
            break;


        case 3:

            if (p3 == ' '){
            p3 = jogador;
            }else {
                System.out.printf("Posição ja ocupada");
                if (contj == 1){
                contj =2;
            }else {
                contj = 1;
            }
            }
            break;

        case 4:

             if (p4 == ' '){
            p4 = jogador;
            }else {
                System.out.printf("Posição ja ocupada");
                if (contj == 1){
                contj =2;
            }else {
                contj = 1;
            }
            }
            break;

        case 5:

             if (p5 == ' '){
            p5 = jogador;
            }else {
                System.out.printf("Posição ja ocupada");
                if (contj == 1){
                contj =2;
            }else {
                contj = 1;
            }
            }
            break;


        case 6:

             if (p6 == ' '){
            p6 = jogador;
            }else {
                System.out.printf("Posição ja ocupada");
                if (contj == 1){
                contj =2;
            }else {
                contj = 1;
            }
            }
            break;

        case 7:

             if (p7 == ' '){
            p7 = jogador;
            }else {
                System.out.printf("Posição ja ocupada");
                if (contj == 1){
                contj =2;
            }else {
                contj = 1;
            }
            }
            break;

        case 8:

             if (p8 == ' '){
            p8 = jogador;
            }else {
                System.out.printf("Posição ja ocupada");
                if (contj == 1){
                contj =2;
            }else {
                contj = 1;
            }
            }
            break;

        case 9:
             if (p9 == ' '){
            p9 = jogador;
            }else {
                System.out.printf("Posição ja ocupada");
                if (contj == 1){
                contj =2;
            }else {
                contj = 1;
            }
            }
            break;

        default:
            System.out.printf("Posição Invalida");
            if (contj == 1){
                contj =2;
            }else {
                contj = 1;
            }


    }
    System.out.println("\t " + p1 + " | " + p2 + " | " + p3);
    System.out.println("\t___|___|___");
    System.out.println("\t " + p4 + " | " + p5 + " | " + p6);
    System.out.println("\t___|___|___");
    System.out.println("\t " + p7 + " | " + p8 + " | " + p9);
    System.out.println("\t   |   | ");
    

    if ((p1 == 'X' && p2 == 'X' && p3 == 'X') || (p4 == 'X' && p5 == 'X' && p6 == 'X') || (p7 == 'X' && p8 == 'X' && p9 == 'X') || (p1=='X' && p4=='X' && p7=='X') || (p2=='X' && p5=='X' && p8=='X') || (p3=='X' && p6=='X' && p9=='X') || (p1=='X' && p5=='X' && p9=='X')|| (p3=='X' && p5=='X' && p7=='X')){
        System.out.printf("\n\nO jogador X foi o ganhador\n\n");
        ganhador = 1;
    }else  if ((p1 == 'O' && p2 == 'O' && p3 == 'O') || (p4 == 'O' && p5 == 'O' && p6 == 'O') || (p7 == 'O' && p8 == 'O' && p9 == 'O') || (p1=='O' && p4=='O' && p7=='O') || (p2=='O' && p5=='O' && p8=='O') || (p3=='O' && p6=='O' && p9=='O') || (p1=='O' && p5=='O' && p9=='O') || (p3=='O' && p5=='O' && p7=='O')){
        System.out.printf("\n\nO jogador O foi o ganhador\n\n");
        ganhador = 1;
    }else if (p1 != ' ' && p2 != ' '&& p3 != ' '&& p4 != ' '&& p5 != ' '&& p6 != ' '&& p7 != ' '&& p8 != ' '&& p9 != ' '){
        System.out.printf("\nEmpate \n");
        ganhador = 1;
    }

    }while(ganhador != 1);
        
    }
}
