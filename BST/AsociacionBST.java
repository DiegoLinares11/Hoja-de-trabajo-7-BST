package BST;

public class AsociacionBST<K, V> {

	private K ingles;
	private V espanol;
	String palabra;

	public AsociacionBST(K ingles, V espanol) {
		// ingles = ing;
		// espanol = esp;
		palabra = ingles + ", " + espanol;
	}

	public K getIngles() {
		return ingles;
	}

	public V getEspanol() {
		return espanol;
	}

}
