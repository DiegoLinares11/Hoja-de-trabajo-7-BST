
  package BST;
  import org.junit.Test;
  import org.junit.jupiter.api.Test;

  import static org.junit.Assert.*;


  class encontrarTest {

  @Test
  void test() {
  BinaryTree<Nodo<AsociacionBST<String, String>>> tree = new
  BinaryTree<Nodo<AsociacionBST<String,String>>>();
  tree.addNode("Hello", "Hola");
  String palabra;
  palabra = tree.find("Hello");
  assertEquals("Hola", palabra);

  }

  }
