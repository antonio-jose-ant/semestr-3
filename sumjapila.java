import java.util.Scanner;
import java.util.Random;
public class sumjapila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont=0,opcion=0,longitud,optp=0;
        System.out.println("ingresa el tamaño de la pila");
        longitud=sc.nextInt();
        int pilaA[] = new int[longitud];
        int pilaB[] = new int[longitud];
        int pilaC[] = new int[longitud];
        do{
            System.out.print("!----------------------!\n!  1=llenar pilas A,B  !\n!----------------------!\n!  2=mostrar pilas A,B !\n!----------------------!\n!  3=vaciar pilas A,B  !\n!----------------------!\n!  4=unir pilas        !\n!----------------------!\n!  5=mostrar pila C    !\n!----------------------!\n!  6=Salir             !\n!----------------------!\n");
            switch (opcion = sc.nextInt()) {
                case 1:
                    if(cont == pilaA.length){
                        System.out.println("pila llena....");
                    }else{
                        for(int i=cont;i<pilaA.length;i++){
                            pilaA[cont]=(int)(Math.random()*(100));
                            pilaB[cont]=(int)(Math.random()*(200-100)+(100));
                            cont++;
                        }
                    }
                break;
                case 2:
                    if(cont >0){
                            System.out.println("Pila A    Pila B");
                        for (int i= cont-1; i>=0;i--){
                            System.out.println(pilaA[i] + "         " + pilaB[i]);
                        }
                    }else{
                        System.out.println("pila vacia....");
                    }
                break;
                case 3:
                    if(cont > 0){
                        System.out.println("!------------------!\n!   1= un dato     !\n!------------------!\n!   2=toda la pila !\n!------------------!");
                        switch(optp = sc.nextInt()){
                            case 1:   
                                System.out.println("dato "+ cont  +" eliminado....");
                                cont--;
                            break;
                            case 2:
                                for(int i=0;i<=longitud-1;i++){
                                    cont--;
                                }
                            break;
                        }
                    }else{
                        System.out.println("pila vacia....");
                    }
                break;
                case 4:
                    if(cont > 0){
                        int j=0;
                        for(int i= cont-1; i>=0;i--){
                            pilaC[j]=pilaA[i]+pilaB[i];
                            j++;
                        }
                    }else{
                        System.out.println("pila vacia....");
                    }
                break;
                case 5:
                if(cont >0){
                    int j=0;
                    for (int i= cont-1; i>=0;i--){
                        System.out.println(pilaA[j]+" + "+pilaB[j]+" = "+pilaC[i]);
                        j++;
                    }
                    }else{
                        System.out.println("pila vacia....");
                    }
                break;
                default:
                    System.out.println("selecciona una opcion valida");
                break;
         }
        }while(opcion != 6);       
    }
}
