package Ejercicio2;

public class ProductosFrescos extends Productos{
	private String fechaEnvasado;
	private String paisOrigen;
	
	public ProductosFrescos() {
		super();
	}
	public ProductosFrescos(String Fecha, int numlote,String fechaEnvasado, String paisOrigen) {
		super(Fecha,numlote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}
	
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	@Override
	public String toString() {
		return super.toString()+" ProductosFrescos Fecha de envasado: " + fechaEnvasado + ", pais de origen: " + paisOrigen + ".";
	}
	
}
