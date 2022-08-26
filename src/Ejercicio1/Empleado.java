package Ejercicio1;

public class Empleado {
	// declaracion de variables
		private int id;
		private String nombre;
		private int edad;
		static int idIni = 999;
		
	// creacion de constructores	
		public Empleado() {
			idIni++;
			this.id = idIni; 
			this.edad = 99;
			this.nombre = "sin nombre";
		}
		public Empleado(String nombre, int edad) {
			idIni++;
			this.id = idIni;
			this.nombre = nombre;
			this.edad = edad;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		
		@Override
		public String toString() {
			return "Empleado [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
		}
		
		
		public static int DevuelveProximoID() {
			//la clase devolvera el proximo ID
			return idIni+1;
		}
}
