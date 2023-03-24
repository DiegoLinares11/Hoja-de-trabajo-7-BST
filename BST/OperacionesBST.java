package BST;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class OperacionesBST {

    /*
     * Se utilizara File ya que la idea es que se pueda ingresar la ruta del txt
     * Este podra leer cualquier archivo txt sin importar su nombre.
     */
    File file;
    String[] texto; // a traducir.
    ArrayList<String> textoinicial = new ArrayList<String>();
    String answer;
    String string;

    public ArrayList<String> importText(String path) {
        try {
            file = new File(path);
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                string = scan.nextLine();
                answer = string.substring(string.indexOf("(") + 1, string.indexOf(")"));
                textoinicial.add(answer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return textoinicial;
    }

    public String[] print(int i) {
        String[] out = textoinicial.get(i).split(", ");
        return out;

    }

    public String[] traducir(String path) {
        try {
            file = new File(path);
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                texto = scan.nextLine().split(" ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return texto;
    }

}
