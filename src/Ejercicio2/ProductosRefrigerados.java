package Ejercicio2;

public class ProductosRefrigerados extends Productos{
	private int codOrgSupAli;
	
	public ProductosRefrigerados() {
		
	}
	public ProductosRefrigerados(String fecha, int num, int id) {
		super(fecha,num);
		this.codOrgSupAli = id;
	}
	public int getCodOrgSupAli() {
		return codOrgSupAli;
	}
	public void setCodOrgSupAli(int codOrgSupAli) {
		this.codOrgSupAli = codOrgSupAli;
	}
	@Override
	public String toString() {
		return super.toString() +" ProductosRefrigerados temperatura de congelacion recomendada" + codOrgSupAli + ".";
	}
	
}
