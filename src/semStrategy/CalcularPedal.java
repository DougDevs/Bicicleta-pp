package semStrategy;


import java.util.Scanner;

public class CalcularPedal {
	
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("informe a distancia: ");
			int distancia = entrada.nextInt();
			System.out.println("qual o tipo de bike? (1) MTB, ou (2) Speed: ");
			int opcaoPedal = entrada.nextInt();
			TipoPedal tipoPedal = TipoPedal.values()[opcaoPedal - 1];
			
			Pedal pedal = new Pedal(tipoPedal);
			double tempo = pedal.calcularTempo(distancia);
			System.out.printf("o tempo estimado é de %.2f minutos", tempo);
		}
	}
}
