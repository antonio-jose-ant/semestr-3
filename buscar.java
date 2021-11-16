import java.util.Scanner;
import java.util.Random;
public class buscar {
    Scanner scaner = new Scanner(System.in);
    int cont = 0, ini = 0, total = 0;
    Nodo top = null;

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        buscar nodos = new buscar();
        int Opcion;
        do {
            System.out.print("\n" + "1. Agregar nodo.\n"
                    + "2. Mostrar lista.\n"
                    + "3. palabra aleatoria \n"
                    + "4. buscar nodo.\n"
                    + "5. Eliminar nodo.\n"
                    + "6. Salir.\n"
                    + "Selecciona una opción: ");
            switch (Opcion = scaner.nextInt()) {
                case 1:
                    nodos.AgregarNodo();
                    break;
                case 2:
                    nodos.MostrarLista();
                    break;
                case 3:
                    nodos.agregarpalabra();
                    break;
                case 4:
                    nodos.buscar();
                    break;
                case 5:
                    nodos.EliminarNodo();
                    break;
            }
        } while (Opcion != 6);
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
    public void agregarpalabra(){
        Nodo temp;
        String Matricula = "";
        temp = new Nodo();
        for (int i = 0; i < 4; i++)
        {
            if(i < 1)
            {
                Matricula +=  (char)(Math.random()*(90-65+1)+65);
            }
            else
            {
                Matricula +=  (char)(Math.random()*(122-97+1)+97);
                if(i >= 3)
                {
                    Matricula +=  (char)(Math.random()*(47-33+1)+33);
                }
            }
        }
        temp.name = Matricula;
        temp.next = top;
        System.out.print( "[" + temp.name + "]\n");
        top = temp;
    }
    public void buscar() {
        Nodo temp = new Nodo();
        int nd=0;
        String ndb;
        temp = top;
        if (top != null) {
            System.out.println("\n" + "ingresa el nodo que quieres buscar");
            ndb = scaner.nextLine();
            while (temp != null) {
                while(ndb == temp.name){
                    System.out.println("\n" + "el nodo" + ndb + "es el numeo" + nd);
                }
                    System.out.println("\n" + "el nodo no existe");
                    temp = temp.next;
                nd++;
            }
        } else {
            System.out.println("\n" + "La lista esta vacia!!!");
        }
    }

    public void MostrarLista() {
        Nodo temp = new Nodo();
        temp = top;
        if (top != null) {
            System.out.println("");
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
