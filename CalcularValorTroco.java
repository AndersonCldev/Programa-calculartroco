import java.util.Scanner;
public class CalcularValorTroco {
	public static void main(String[]args) {
		
// O  Programa que ler o valor de um produto e valor pago pelo cliente, faz o cálculo do valor de troco e mostra na tela.
		Double valorDigitadoCliente, resultado;
		Scanner Ler1 = new Scanner(System.in);
		
		System.out.print("Olá, digite o valor do produto: ");
		Double valorProduto = Ler1.nextDouble();
		
		System.out.print("Digite quantidade passada pelo clietne:  ");
		Double valorDigitadoCliente = Ler1.nextDouble();
		
		resultado = valorDigitadoCliente - valorProdudo;
			
		System.out.println("Troco: " + resultado);
		
		Ler1.close();
		
	}

}
