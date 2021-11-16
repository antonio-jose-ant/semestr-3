import java.util.Scanner;
import java.util.Random;
public class eliminar {
    Scanner scaner = new Scanner(System.in);
    int cont = 0, ini = 0, total = 0;
    Nodo top = null;

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        eliminar nodos = new eliminar();
        int Opcion;
        do {
            System.out.print("\n" + "1. Agregar nodo.\n"
                    + "2. Mostrar lista.\n"
                    + "3. Eliminar nodo.\n"
                    + "4. Salir.\n"
                    + "Selecciona una opción: ");
            switch (Opcion = scaner.nextInt()) {
                case 1:
                    nodos.AgregarNodo();
                    break;
                case 2:
                    nodos.MostrarLista();
                    break;
                case 3:
                    nodos.EliminarNodo();
                    break;
            }
        } while (Opcion != 4);
    }

    static class Nodo {
        String name;
        Nodo next;
    }

    public void AgregarNodo() {
        if (top == null) {
            top = new Nodo();
            System.out.print("\n" + "Ingresa el contenido para el nodo incial: ");
            top.name = scaner.nextLine();
            System.out.print("[" + top.name +  "]\n");
            top.next = null;
        } else {
            Nodo temp;
            temp = new Nodo();
            System.out.print("\n" + "Ingresa el contenido para el nodo anterior a inicial: ");
            temp.name = scaner.nextLine();
            temp.next = top;
            System.out.print("[" +temp.name +  "]\n");
            top = temp;
        }
    }
    public void MostrarLista() {
        Nodo temp = new Nodo();
        temp = top;
        if (top != null) {
            System.out.println("");
            /*mostrar("\n" + magenta + "Lista de nodos: ", top);
            System.out.println("\n");*/
            while (temp != null) {
                System.out.println( "Nodo: ["  + temp.name + "]");
                temp = temp.next;
            }
        } else {
            System.out.println("\n" + "La lista esta vacia!!!");
        }
    }

    public static void mostrar(String name, Nodo sig) {
        System.out.println(name);
        while (sig != null) {
            System.out.print(sig.name + " ");
            sig = sig.next;
        }
    }

    public void EliminarNodo() {
        if (top != null) {
            System.out.print("\n" + "El nodo ["  + top.name + "] se elimino.");
            top = top.next;
        } else {
            System.out.print("\n" + "La lista esta vacia!!!");
        }
        System.out.println("");
    }
}
