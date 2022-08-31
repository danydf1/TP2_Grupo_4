package Ejercicio3;

public class Edificio {
	
	private double Superficie;
	
	Edificio(){
		this.Superficie = 0;
	}
	
	Edificio(double superficie){
		this.Superficie = superficie;
		}

	public double getSuperficieEdificio() {
		return Superficie;
	}

	public void setSuperficieEdificio(double superficie) {
		Superficie = superficie;
	}

	@Override
	public String toString() {
		return "Edificio [Superficie=" + Superficie + "]";
	}

	
}
	
