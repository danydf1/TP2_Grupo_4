package Ejercicio2;

public class ProductosCongelados extends Productos {
	private int tempRecomendada;
	
	public ProductosCongelados() {
		super();
	}
	
	public ProductosCongelados(String Fecha, int numLote,int temp) {
		super(Fecha, numLote);
		this.tempRecomendada = temp;
	}

	public int getTempRecomendada() {
		return tempRecomendada;
	}

	public void setTempRecomendada(int tempRecomendada) {
		this.tempRecomendada = tempRecomendada;
	}

	@Override
	public String toString() {
		return  super.toString() + " ProductosCongelados temperatura recomendada: " + tempRecomendada + ".";
	}
	
	
}
