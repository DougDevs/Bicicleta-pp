package Pedal;
import comStrategy.Pedal;

public class MTB implements Pedal{
	public double calcularTempo(int distancia) {
		return	distancia * 0.33;
}

	@Override
	public double calcularPedal(int distancia) {
		// TODO Auto-generated method stub
		return 0;
	}
}	