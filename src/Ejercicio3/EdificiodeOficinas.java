package Ejercicio3;

public class EdificiodeOficinas extends Edificio{

	private int NumeroOficinas;

	
	EdificiodeOficinas(){
		super();
		this.NumeroOficinas = 0;
	}
	
	EdificiodeOficinas(int oficinas, double superficie){
		super(superficie);
		this.NumeroOficinas = oficinas;
	}
	
	
	
	public int getNumeroOficinas() {
		return NumeroOficinas;
	}


	public void setNumeroOficinas(int numeroOficinas) {
		NumeroOficinas = numeroOficinas;
	}


	@Override
	public String toString() {
		return "\nEdificioDeOficinas [NumeroOficinas=" + NumeroOficinas +
				", Superficie del edificio: " + getSuperficieEdificio() ;
	}

}
