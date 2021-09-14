# semestr-3
(opcional)
import java.net.Socket;
import java.util.Scanner;

public class pila {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int cont=0,opt=0;
       char [] pila = new char[26];
       do{
        System.out.print("1= agregar\n2= Mostrar \n3= Eliminar\n4= Salir\n");
        switch (opt = sc.nextInt()) {
            case 1:
                if(cont == pila.length){
                    System.out.println("pila llena....");
                }else{
                    System.out.println("agreaga la letra " + (cont+1));
                    pila[cont]= sc.next().charAt(0);
                    System.out.println("elemento guardadoen la posicion: "+ (cont+1));       
                    cont++;
                }
            break;
            case 2:
                if(cont >0){
                    for (int i= cont-1; i>=0;i--){
                        System.out.println(" " + pila[i]);
                    }
                }else{
                    System.out.println("pila vacia....");
                }
            break;
            case 3:
                if(cont > 0){
                    System.out.println("dato "+ cont  +" eliminado....");
                    cont--;
                }else{
                    System.out.println("pila vacia....");
                }
            break;
            default:
                System.out.println("selecciona una opcion valida");
            break;
        }
       }while(opt != 4);
    }
}
