import java.util.Locale;
import java.util.Scanner;

public class Ex3 {

    public abstract class Imposto{
        public double calculaImposto(double valor, double porcentagem){
            double percentual = porcentagem / 100;
            return valor * porcentagem;

        }
    }

    public class ICMS extends Imposto {
        //o valor que passa é de 27%

    }

    public class IPI extends Imposto {
        //abaixo de 25.000 é 5%
        //acima de 25.000 é 11%
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
    }

}
