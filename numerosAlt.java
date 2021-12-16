import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class numerosAlt {

    Scanner sc = new Scanner(System.in);

    public class Nodo {

        int Dato;
        Nodo siguiente;
        Nodo atras;
    }
    int nodos=500;
    Nodo inicial = null;
    Nodo fin = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        numerosAlt n = new numerosAlt();
        int opc;

        do {
            System.out.print("\nMenu."
                    + "\n 1- Llenar "
                    + "\n 2- Mostrar"
                    + "\n 3- Ordenar "
                    + "\n 4- Eliminar repetidos"
                    + "\n 5- Agregar faltantes"
                    + "\n 6- Salir"
                    + "\nSeleccione la opcion a realizar:");

            switch (opc = sc.nextInt()) {
                case 1:
                    n.LlenarN();
                    break;
                case 2:
                    n.MostrarN();
                    break;
                case 3:
                    n.OrdenarN();
                    break;
                case 4:
                    n.Eliminar();
                    break;
                case 5:
                    n.Agregarfalt();
                    break;
            }

        } while (opc != 6);

    }

    public void LlenarN() {
        if(inicial==null){
            inicial = new Nodo();
            inicial.siguiente = null;
            for (int i = 2; i <= 500; i++) {
                int Numeros = ((int) (Math.random() * 500 + 0));
                Nodo temp;
                temp = new Nodo();
                temp.Dato = Numeros;
                temp.siguiente = inicial;
                inicial = temp;
            }
        
        System.out.println("\n"+"Datos agregados");
        }else{
            System.out.println("\n"+"lista llena");
        }
    }

    public void MostrarN() {
        Nodo actual = new Nodo();
        actual = inicial;
        if (inicial != null) {
            while (actual != null) {
                for (int i = 1; i <= 500; i++) {
                System.out.println("Nodo "+i+" [ " + actual.Dato + " ] ");
                actual = actual.siguiente;
                }
            }
        }
    }

    public void OrdenarN() {
        if (inicial != null) {
            System.out.println("\n"+"Datos ordenados ");
            for (int i = 1; i <= 500; i++) {
                Nodo anterior = new Nodo();
                anterior = inicial;
                Nodo actual = new Nodo();
                actual = anterior.siguiente;
                    for (int j = 499; j >= 0; j--) {
                        while (anterior.siguiente != null) {
                            if (anterior.Dato > actual.Dato) {
                                int  au;
                                au = anterior.Dato;
                                anterior.Dato = actual.Dato;
                                actual.Dato = au;
                            }
                            anterior = actual;
                            actual = anterior.siguiente;
                        }
                    }
            }
        }
    }
    public void Eliminar() {
        if (inicial != null) {
            System.out.println("\n"+"Datos ordenados ");
            for (int i = 1; i <= 500; i++) {
                Nodo temp=inicial;
                int contador=1;
                while (temp != null){
                    if(temp.Dato==i){
                        contador++;
                    }
                }
                if(contador>1){
                    for(int j=contador-1;j>0;j--){
                        Nodo anterior=new Nodo ();
                        anterior=null;
                        Nodo actual=new Nodo();
                        actual=inicial;
                        while(actual!=null){
                            if(actual.Dato==i){
                                if(actual==inicial){
                                    inicial=inicial.siguiente;
                                    inicial.atras=null;
                                }
                                else{
                                    anterior.siguiente=actual.siguiente;
                                    actual=actual.siguiente;
                                    actual.atras=anterior.atras;
                                }
                            }
                            anterior=actual;
                            actual=anterior.siguiente;
                        }
                    }
                }
            }   
        } else {
            System.out.print("\n" + "La lista esta vacia!!!");
        }
        System.out.println("");
       
    }
    public void Agregarfalt() {
        for (int i = nodos; i <= 499; i++) {
            int Numeros2 = ((int) (Math.random() * 500 + 0));
            Nodo temp;//Si la lista tiene valores entonces se creara un nodo temporal para almacenarlo en la lista y hara el mimos procediminto como anteriormente
            temp = new Nodo();//Nuevo nodo temporal
            //System.out.print("\n" + "Ingresa el contenido para el nodo: ");
            temp.Dato = Numeros2;
            temp.siguiente = inicial;
            //System.out.print(reset + "[" + azul + temp.name + reset + "]\n");
            inicial = temp;
            nodos++;
        }
        System.out.print("\n" + "La lista esta llena!!!");
    }
}
