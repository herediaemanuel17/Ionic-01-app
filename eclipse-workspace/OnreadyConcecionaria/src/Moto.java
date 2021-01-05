
public class Moto extends Vehiculo {
	private int cilindradas;
	
	public Moto(String nuevaMarca, String nuevoModelo, float nuevoPrecio, int cc) {
		super(nuevaMarca, nuevoModelo, nuevoPrecio);
		this.cilindradas=cc;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	

	

}
