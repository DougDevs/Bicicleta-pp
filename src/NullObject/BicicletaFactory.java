package NullObject;

public class BicicletaFactory  {
	public static Bicicleta criarBicicleta(String tamanho, Modelo modelo) {
		Bicicleta bicicleta = new Bicicleta(tamanho);
					
		if(modelo == null) {
			bicicleta.setModelo(new ModeloNull());
		}else{
			bicicleta.setModelo(modelo);
		}
		
		return bicicleta;
	}

	
}
