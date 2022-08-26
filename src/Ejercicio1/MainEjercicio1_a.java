package Ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainEjercicio1_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			Profesor Profe1 = new Profesor();
			Profesor Profe2 = new Profesor();
			Profesor Profe3 = new Profesor();
			Profesor Profe4 = new Profesor();
			Profesor Profe5 = new Profesor();
			
			ArrayList<Profesor> ListaProf = new ArrayList<Profesor>(5);
				
					
			ListaProf.add(Profe1);
			ListaProf.add(Profe2);
			ListaProf.add(Profe3);
			ListaProf.add(Profe4);
			ListaProf.add(Profe5);
			
			ListIterator<Profesor> IListProf = ListaProf.listIterator();
			
			while (IListProf.hasNext())
			{
				Profesor Profesor = IListProf.next();
				System.out.println(Profesor.toString());
			}
				
		}
	

}
