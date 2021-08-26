package V164_Creacion_Clase_ArryList_Propia;

public class Uso_arrayList {

	public static void main(String[] args) {
		
		
		Mi_ArrayList miarrayList = new Mi_ArrayList(4);
		
		miarrayList.add("manu");
		
		miarrayList.add("renee");
		
		miarrayList.add("pedro");
		
		miarrayList.add("pepe");
		
		String nombre = (String) miarrayList.get(0);
		
		System.out.println(nombre);

	}

}
