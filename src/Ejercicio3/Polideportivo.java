package Ejercicio3;

public class Polideportivo extends Edificio implements InstalacionDeportiva {

private String NombrePolideportivo;

	
	Polideportivo (){
		super();
		this.NombrePolideportivo = "Sin nombre";
	}
	
	Polideportivo (String nombre, double superficie){
		super(superficie);
		this.NombrePolideportivo = nombre;
	}
	
	public String getNombrePolideportivo() {
		return NombrePolideportivo;
	}

	public void setNombrePolideportivo(String nombrePolideportivo) {
		NombrePolideportivo = nombrePolideportivo;
	}

	@Override
	public String toString() {
		return "\nPolideportivo [NombrePolideportivo=" + NombrePolideportivo + 
				", Superficie del edificio: " + getSuperficieEdificio() + 
				", Tipo de edificio: " + getTipoDeInstalacion() + "]";
	}

	
	@Override
	public int getTipoDeInstalacion() {
		return 1;
	}

	

}
