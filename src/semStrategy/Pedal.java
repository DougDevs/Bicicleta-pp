package semStrategy;

public class Pedal {
	
	private TipoPedal tipo;
	
	public Pedal(TipoPedal tipo) {
		this.tipo = tipo;
	}
	
	public double calcularTempo(int distancia) {
		double tempo = 0;
		if (TipoPedal.MTB.equals(tipo)) {
			tempo = distancia * 0.35;
	} else if (TipoPedal.SPEED.equals(tipo)) {
			tempo = distancia * 0.25;
	}
	
		return tempo;
	}
	}
