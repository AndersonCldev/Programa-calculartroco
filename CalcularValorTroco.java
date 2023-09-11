import java.util.Scanner;
public class CalcularValorTroco {
	public static void main(String[]args) {
		
// O  Programa que ler o valor de um produto e valor pago pelo cliente, faz o cálculo do valor de troco e mostra na tela.
		
		Scanner Ler1 = new Scanner(System.in);
		
		System.out.print("Olá, digite o valor do produto: ");
		Double valorProduto = Ler1.nextDouble();
		
		System.out.print("Digite quantidade passada pelo clietne:  ");
		Double valorDigitadoCliente = Ler1.nextDouble();
		
		Double resulto = valorDigitadoCliente - valorProduto;
			
		System.out.println("Troco: " + resulto);
		
		Ler1.close();
		
	}

}
