package Observer;
import java.util.Observable;
import java.util.Observer;


	public class BikeOggi extends Observable {
		
	
		private int modelo;
		
		public void setNovoModelo(int novoModelo ) {
			this.modelo = novoModelo;
		
		
			setChanged();
			notifyObservers();
	}
		public int getModelo() {
			return this.modelo;		
	}
		public static void main(String[] args) {
			int novoModelo = 2025;
			BikeOggi bikeOggi = new BikeOggi();
			Ciclista ciclista = new Ciclista(bikeOggi);
			
			bikeOggi.setNovoModelo(novoModelo);
			
		}
	}
	
	
class Ciclista implements Observer {
	Observable bikeOggi;
	int modeloNovoModelo;
	
	public Ciclista(Observable BikeOggi) {
		this.bikeOggi = BikeOggi;
		BikeOggi.addObserver(this);
	}
	public void update(Observable bikeInfSubject, Object agr1) {
		if (bikeInfSubject instanceof BikeOggi) {
			BikeOggi bikeOggi = (BikeOggi) bikeInfSubject;
			modeloNovoModelo = bikeOggi.getModelo();
			System.out.println("Ateenção ja há um novo modelo da bike Oggi na knorek, o modelo é o: " + modeloNovoModelo);
		}
	}
}
	
/*Null object (10% da nota);
Hook method (10% da nota);
State (20% da nota);*/
		
			
