import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();

        //gera numero aleatorio
        int numeroAleatorio = gerador.nextInt(8);
        System.out.println("Insira um número entre 0 e 7:");

        //input do user
        int numeroUser = sc.nextInt();

        //enquanto o input do user nao for igual ao numeroAleatorio continua pedindo mais numero ao usuario
        while (numeroUser != numeroAleatorio){
            System.out.println("Errou, entre com outro número até acertar o número gerado entre 0 e 7:");

            if(numeroUser > 7 ){
                System.out.println("O número correto é menor ou igual a 7, tente novamente:");
                numeroUser = sc.nextInt();
            }
            if(numeroUser < 0) {
                System.out.println("O número correto é maior ou igual a 0, tente novamente:");
                numeroUser = sc.nextInt();
            }else {
                numeroUser = sc.nextInt();
            }
        }
        System.out.println("Acertou, o numero correto é " + numeroUser);
    }
}
