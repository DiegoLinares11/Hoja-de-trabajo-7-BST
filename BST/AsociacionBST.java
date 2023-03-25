package BST;

public class AsociacionBST<K, V> {

	private K ingles;
	private V espanol;
	String palabra;

	public AsociacionBST(K ing, V esp) {
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
