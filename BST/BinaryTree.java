package BST;

public class BinaryTree<E> {
    Nodo<E> raiz;

    public void addNode(String ing, String esp) {
        Nodo<E> nodoInicial = new Nodo<E>(ing, esp);
        if (raiz == null) {
            raiz = nodoInicial; // Si esta vacia la raiz nuestro nodo inicial sera la nueva raiz
        } else {
            Nodo<E> focus = raiz;
            Nodo<E> padre;

            while (true) {
                padre = focus;
                if (ing.compareTo(focus.getLast().getIngles()) < 0) {
                    focus = focus.left;
                    if (focus == null) {
                        padre.left = nodoInicial;
                        return;
                    }

                } else {
                    focus = focus.right;
                    if (focus == null) {
                        padre.right = nodoInicial;
                        return;
                    }
                }
            }
        }
    }

    public String find(String key) {
        Nodo<E> focus = raiz;

        while (focus.getLast().getIngles().equalsIgnoreCase(key) != true) {
            if (key.compareTo(focus.getLast().getIngles()) < 0) {
                focus = focus.left;
            } else {
                focus = focus.right;
            }
            if (focus == null) {
                return null;
            }

        }
        return focus.getLast().getEspanol();

    }

    public void InOrder(Nodo<E> focus) {
        if (focus != null) {
            InOrder(focus.left);
            System.out.println(focus.getLast().palabra);
            InOrder(focus.right);

        }
    }
}
