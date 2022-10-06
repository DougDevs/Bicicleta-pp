package NullObject;
public class Main{
	
	public static void main(String[] args) {
		Bicicleta bikosa = BicicletaFactory.criarBicicleta(
				"grande", new Modelo("sla","azul"));
		
		Bicicleta bikosa1 = BicicletaFactory.criarBicicleta(
				"grande",null);
		
		System.out.println(bikosa1.getModelo().getCor());
		
		
			
	}
	
	
}
 
 