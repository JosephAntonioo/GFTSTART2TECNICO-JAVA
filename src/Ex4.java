import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Multiplicando:");

        //Multiplicando
        String multiplicandoIn = "";
        multiplicandoIn = sc.next();
        double multiplicando = Double.parseDouble(multiplicandoIn.replace(",", "."));
        //Regras
        if(multiplicando > 1000){
            System.out.println("O multiplicando não pode ser maior que 1000");
            System.exit(0);
        }


        //Inicio
        System.out.println("Início do intervalo:");
        String inicioIIN = "";
        inicioIIN = sc.next();
        double inicioI = Double.parseDouble(inicioIIN.replace(",", "."));
        //Regras
        if(inicioI < 0){
            System.out.println("Nem o início nem o fim do intervalo podem ser menores que 0.");
            System.exit(0);
        }
        if(inicioI > 1000){
            System.out.println("Nem o início nem o fim do intervalo podem ser maiores que 1000.");
            System.exit(0);
        }

        //Fim
        System.out.println("Fim do intervalo:");
        String fimIIN = "";
        fimIIN = sc.next();
        double fimI = Double.parseDouble(fimIIN.replace(",", "."));
        //Regras
        if(fimI < 0){
            System.out.println("Nem o início nem o fim do intervalo podem ser menores que 0.");
            System.exit(0);
        }
        if(fimI > 1000){
            System.out.println("Nem o início nem o fim do intervalo podem ser maiores que 1000.");
            System.exit(0);
        }

        //Regras intervalo
        double intervalo = fimI - inicioI;
        if(intervalo < 0){
            System.out.println("O fim do intervalo não pode ser maior que o início do intervalo.");
            System.exit(0);
        }
        if(intervalo > 9){
            System.out.println("O intervalo entre início e fim não pode ser maior que 10");
            System.exit(0);
        }

        //Multiplicação
        for(double i = inicioI; i < fimI; i++){
            System.out.println(multiplicando + " X " + i + " = " + (multiplicando*i));
        }

    }
}
