import java.util.Scanner;

public class TesteMoeda {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Moeda moeda = new Moeda();
        System.out.println("Informe o valor em R$");
        moeda.valorReal = leitor.nextDouble();
        System.out.println("Informe a cotação do dólar de hoje");
        moeda.cotacaoDolar = leitor.nextDouble();

        moeda.calcularConversao();
        System.out.println(moeda.quantidadeDolar); // método sem retorno
        System.out.println(moeda.retonarcalculoConversao()); // metodo com retorno


    }
}
