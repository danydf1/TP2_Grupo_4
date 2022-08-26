package Ejercicio2;

public class mainEjercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Productos p = new Productos("20/2/2022",4);
		ProductosCongelados pc = new ProductosCongelados("20/08/2022", 3,3);
		ProductosFrescos pf = new ProductosFrescos("31/08/2022",4, "1/1/2022","Argentina");
		System.out.println(p.toString());
		System.out.println(pc.toString());
		System.out.println(pf.toString());
		
	}

}
