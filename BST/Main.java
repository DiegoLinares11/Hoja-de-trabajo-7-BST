package BST;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Nodo<AsociacionBST<String, String>>> tree = new BinaryTree<Nodo<AsociacionBST<String, String>>>();
        Scanner scan = new Scanner(System.in);
        OperacionesBST op = new OperacionesBST();

        System.out.println("Para continuar, ingrese la ruta donde contiene el diccionario "); // Ingles/ español
        String path = scan.nextLine();
        op.importText(path);
        for (int i = 0; i < op.textoinicial.size(); i++) {
            tree.addNode(op.print(i)[0], op.print(i)[1]);
        }

        int opcion = 0;
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("");

            System.out.println("Seleccione una opcion");
            try {
                opcion = scan.nextInt();
                scan.nextLine();
            } catch (Exception ex) {
                opcion = 0;
                System.out.println("Ingrese una opcion valida");
                scan.nextLine();
            }
            switch (opcion) {

                case 1:
                    tree.InOrder(tree.raiz);
                    break;

                case 2:
                    System.out.println("Ingrese la ruta del archivo: ");
                    path = scan.nextLine();
                    String[] oracion = op.traducir(path);
                    for (int k = 0; k < oracion.length; k++) {
                        if (tree.find(oracion[k]) != null) {
                            System.out.print(tree.find(oracion[k]) + " ");
                        } else {
                            System.out.print("*" + oracion[k] + "* ");
                        }
                    }
                case 3:
                    System.out.println("Hasta luego!");
                    opcion = 7;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;

            }
            System.out.println();

        } while (opcion != 3);
        scan.close();

    }
}
