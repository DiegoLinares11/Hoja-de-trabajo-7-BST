package BST;

public class AsociacionBST<K, V> {

	private K ingles;
	private V espanol;
	// private V frances;
	String palabra;

	public AsociacionBST(K ing, V esp) {
		ingles = ing;
		espanol = esp;
		// frances = fran;
		palabra = ingles + ", " + espanol;
	}

	public K getIngles() {
		return ingles;
	}

	public V getEspanol() {
		return espanol;
	}
	/*
	 * 
	 * 
	 * public V getFrances(){
	 * return frances;
	 * }
	 */

}
