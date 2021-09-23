import java.net.Socket;
import java.time.temporal.Temporal;
import java.util.Scanner;
import java.util.Random;
public class pila3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int cont=0,opt=0,temporal=0;
       char letra='A';
       char [] pila = new char[26];
       char [] cpomp =new char[26];
       int numc=0,c=0;
       int [] mayor =new int [26];
       do{
        System.out.print("\n!--------------------!\n!   1= agregar       !\n!--------------------!\n!   2= Eliminar      !\n!--------------------!\n!   3= Mostrar       !\n!--------------------!\n!   4= repetidos     !\n!--------------------!\n!   5= Salir         !\n!--------------------!\n");
        switch (opt = sc.nextInt()) {
            case 1:
                if(cont == pila.length){
                    System.out.println("pila llena....");
                }else{
                    if(cont<pila.length){
                        char[] aleatorio={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','X','Z'};
                        for(int i=cont;i<26;i++){
                            pila[cont] = aleatorio[(int)(Math.random()*26)];
                            cpomp[cont]=letra;
                            cont++;
                            letra++;
                        }
                    }
                    
                }
            break;
            case 2:
            if(cont > 0){
                System.out.println("dato "+ cont  +" eliminado....");
                cont--;
            }else{
                System.out.println("pila vacia....");
            }
            break;
            case 3:
                if(cont >0){
                    for (int i= cont-1; i>=0;i--){
                        System.out.print(" " + pila[i]+ ",");
                    }
                }else{
                    System.out.println("pila vacia....");
                }
            break;
            case 4:
                if(cont >0){
                    for (int j= cont-1; j>=0;j--){
                        for (int i= cont-1; i>=0;i--){
                            if(pila[i]==cpomp[j]){
                                numc++;
                            }
                        }
                        mayor[c] = numc;
                        c++;
                        /*System.out.println("--"+mayor[j] + cpomp[j]);*/
                        /*if(numc>0){
                            System.out.println(cpomp[j] +" aparece " + numc);
                            System.out.println();
                        
                        }*/
                        numc=0;
                    } 
                    for (int j= 0; j<26;j++){
                        for (int i=j+1; i<26-1;i++){
                            if(mayor[j]>=mayor[i]){
                                temporal=mayor[j];
                                mayor[j]=mayor[i];
                                mayor[i]=temporal;
                            }
                        }
                    }
                    for(int i=0;i<26;i++){
                        System.out.print(" ");
                    }
                    System.out.println(cpomp[24] + " aparece:  "+ mayor[24] );
                }else{
                    System.out.println("pila vacia....");
                }
            break;
            default:
                System.out.println("selecciona una opcion valida");
            break;
        }
       }while(opt != 5);
    }
}
