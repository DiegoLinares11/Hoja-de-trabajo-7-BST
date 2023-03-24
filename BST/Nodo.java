package BST;

public class Nodo<E> {

	private AsociacionBST<String, String> as;
	Nodo<E> right;
	Nodo<E> left;

	public Nodo(String ingles, String espanol) {
		as = new AsociacionBST<String, String>(ingles, espanol);

	}

	public AsociacionBST<String, String> getLast() {
		return as;

	}

}
