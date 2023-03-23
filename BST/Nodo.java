package BST;

public class Nodo<E>{
	
	private Asociacion<String, String> as;
	Nodo<E> right;
	Nodo<E> left;
	
	
	public Nodo(String ingles, String espanol) {
		as = new Asociacion<String, String>(ingles, espanol);
		
	}
	
	public Asociacion<String, String> getLast(){
		return as;
		
	}

	
}
