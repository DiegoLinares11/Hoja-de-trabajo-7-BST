
  package BST;
  import static org.junit.jupiter.api.Assertions.*;

  import org.junit.jupiter.api.Test;


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
