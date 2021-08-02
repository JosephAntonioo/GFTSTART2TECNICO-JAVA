import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os dados dos 10 atletas:");
        List<Atleta> atletaList = new ArrayList<>();
        for (int i = 1; i <11;i++) {
            Atleta atleta = new Atleta();
            String nome = "";
            String pais = "";
            double distancia = 0;
            System.out.println("Digite o nome do Atleta " + i + ":");
            nome = sc.next();
            System.out.println("Digite o país do Atleta " + i + ":");
            pais = sc.next();
            System.out.println("Digite o resultado(em metros) do Atleta "+ i + ":");
            String distI = "";
            distI = sc.next();
            distancia = Double.parseDouble(distI.replace(",", "."));
            atleta.nome = nome;
            atleta.pais = pais;
            atleta.distancia = distancia;
            atletaList.add(atleta);
        }
        //ordena por dist
        atletaList.sort(Comparator.comparing(Atleta::getDistancia));
        System.out.println("Ouro: " + atletaList.get(9).nome + " - " + atletaList.get(9).pais + " Resultado: " + atletaList.get(9).distancia + "m");
        System.out.println("Prata: " + atletaList.get(8).nome + " - " + atletaList.get(8).pais + " Resultado: " + atletaList.get(8).distancia + "m");
        System.out.println("Bronze: " + atletaList.get(7).nome + " - " + atletaList.get(7).pais + " Resultado: " + atletaList.get(7).distancia + "m");
    }

    public static class Atleta{
        public String nome;
        public String pais;
        public double distancia;

        public Atleta(String nome, String pais, double distancia) {
            this.nome = nome;
            this.pais = pais;
            this.distancia = distancia;
        }

        public Atleta() {

        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getPais() {
            return pais;
        }

        public void setPais(String pais) {
            this.pais = pais;
        }

        public double getDistancia() {
            return distancia;
        }

        public void setDistancia(double distancia) {
            this.distancia = distancia;
        }
    }
}
