package V164_Creacion_Clase_ArryList_Propia;

public class Mi_ArrayList {

	public Mi_ArrayList(int z) {

		datosElemento = new Object[z];

	}

	public Object get(int i) {

		return datosElemento[i];

	}

	public void add(Object o) {

		datosElemento[i] = o;

		i++;
	}

	private Object[] datosElemento;

	private int i = 0;

}
