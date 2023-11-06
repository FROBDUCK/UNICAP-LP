//victor luiz almeidda medeiros (individual)
import java.util.Scanner;
public class atividade {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a quantidade de morangos (em kg): ");
	        double quantidadeMorangos = scanner.nextDouble();

	        System.out.print("Digite a quantidade de maçãs (em kg): ");
	        double quantidadeMaca = scanner.nextDouble();

	        double valorMorangos;
	        double valorMaca;

	        if (quantidadeMorangos <= 5) {
	            valorMorangos = quantidadeMorangos * 8.50;
	        } else {
	            valorMorangos = quantidadeMorangos * 7.50;
	        }

	        if (quantidadeMaca <= 5) {
	            valorMaca = quantidadeMaca * 5.50;
	        } else {
	            valorMaca = quantidadeMaca * 4.50;
	        }

	        double valorTotal = valorMorangos + valorMaca;

	        if (quantidadeMorangos + quantidadeMaca > 8 || valorTotal > 35.00) {
	            valorTotal *= 0.90;
	        }

	        System.out.println("Valor a ser pago pelo cliente: R$" + valorTotal);
	}
}
