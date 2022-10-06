package Pedal;

import comStrategy.Pedal;

public class Speed implements Pedal{
	
		public double calcularTempo(int distancia) {
			return	distancia * 0.25;
	}

		@Override
		public double calcularPedal(int distancia) {
			// TODO Auto-generated method stub
			return 0;
		}
	
}
