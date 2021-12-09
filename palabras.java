import java.util.Scanner;
import java.util.Random;

public class palabras {
    Scanner scaner = new Scanner(System.in);

    Nodo top = null;
    Random random = new Random();
    int nodos=500;
    static class Nodo {

        //Datos y enlace usados
        String name;
        Nodo next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        palabras nodos = new palabras();
        do {
            System.out.print("Menu"+ "\n1.-Llenar lista."+"\n2.-Mostrar lista."+"\n3.-Ordenar lista."+"\n4.-Salir." + "\nSelecciona una opción: ");
            switch (opc = sc.nextInt()) {
                case 1:
                    nodos.LlenarLista();
                    break;
                case 2:
                    nodos.MostrarLista();
                    break;
                case 3:
                    nodos.OrdenarLista();
                    break;
            }
        } while (opc != 4);
    }

    public void LlenarLista() {
        if (top == null) {
            top = new Nodo();
            top.next = null;
            String Matricula = "";
                Nodo temp;
                for (int j = 0; j < 4; j++){
                    Matricula +=  (char)(Math.random()*(122-97+1)+97);
                }
                temp = new Nodo();
                temp.name = Matricula;
                
                temp.next = top;
                top = temp;
        } else {
            System.out.print( "Seleccione la opción 5!!" );
        }
    }

    public void MostrarLista() {
        Nodo temp = new Nodo();
        temp = top;
        if (top != null) {
            System.out.println("");
            System.out.println( "LISTA DE NODOS");
            while (temp != null) {
                for (int i = 1; i <= nodos; i++) {
                    System.out.println("Nodo:  " + i + " [ "  + temp.name +" ]");
                    temp = temp.next;
                }
            }
            System.out.println("");
        } else {
            System.out.println("\n" + "La lista esta vacia!!!");
        }
    }

    public static void mostrar(String name, Nodo sig) {
        System.out.println(name);
        while (sig != null) {
            //System.out.print(sig.num + " ");
            System.out.print(sig.name + " ");
            sig = sig.next;
        }
    }

    public void OrdenarLista() {
    }


}
