package BST
public class Asociacion<K, V> {

	private K ingles;
	private V espanol;
	String palabra;

	public Asociacion(K ing, V esp) {
		ingles = ing;
		espanol = esp;
		palabra = ingles + ", " + espanol;
	}

	public K getIngles() {
		return ingles;
	}

	public V getEspanol() {
		return espanol;
	}

}
