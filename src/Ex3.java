import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
    //improvisado por falta de tempo
    public abstract class Imposto{
        public double calculaImposto(double valor, double porcentagem){
            double percentual = porcentagem / 100;
            return valor * porcentagem;
        }
    }

    public class ICMS extends Imposto {
        //o valor que passa é de 27%
        public int taxaICMS = 27;
    }

    public class IPI extends Imposto {
        //abaixo de 25.000 é 5%
        public int taxaMenorIPI = 5;
        //acima de 25.000 é 11%
        public int taxaMaior = 11;
    }

    public class COFINS extends Imposto {
        //acima de 13.000 é 4%
        //abaixo de 13.000 nao paga nada
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor para ser calculado os impostos(Use virgulas apenas para separar a fração da moeda):");
        String valorIn = "";
        valorIn = sc.next();
        Double valor = Double.parseDouble(valorIn.replace(",", "."));

        //icms
        Double icms = (27 /100) * valor;


        //IPI
        Double ipi = 0d;
        //ABAIXO 25000
        if(valor < 25000){
            ipi = (5/100) * valor;
        }else{
            ipi = (11/100) * valor;
        }

        //COFINS
        Double cofins = 0d;
        if(valor > 13000){
            cofins = (4/100) * valor;
        }else{
            cofins = 0d;
        }

        //quanto cada imposto custa
        System.out.println("O ICSM custará: " + icms);
        System.out.println("O IPI custará: " + ipi);
        System.out.println("O cofins custará: " + cofins);
        //qual o valor final com o somatorio dos impostos
        System.out.println("A soma é " + (icms + ipi + cofins));
    }

}
