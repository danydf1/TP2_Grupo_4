package Ejercicio2;

public class Productos {
	private String fechadeCad;
	private int numLote;

	public Productos() {
		super();
	}
	
	public Productos(String fechadeCad, int numLote) {
		this.fechadeCad = fechadeCad;
		this.numLote = numLote;
	}
	public String getFechadeCad() {
		return fechadeCad;
	}
	public void setFechadeCad(String fechadeCad) {
		this.fechadeCad = fechadeCad;
	}
	public int getNumLote() {
		return numLote;
	}
	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}
	
	@Override
	public String toString() {
		return "Productos fecha de caducidad: " + fechadeCad + ", numero de lote: " + numLote + ".";
	}
	
	
}
