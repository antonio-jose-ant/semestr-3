import java.net.Socket;
import java.util.Scanner;
public class programatow {
    public static void main(String[] args) {
        int longitud=0,suma=0,num=1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresa un numero");
        longitud=entrada.nextInt();
        int numeros[] = new int[longitud]; 
        for(int i=0; i<numeros.length; i++){     
            for(int n=0;n<=longitud;n++){
                num=n*3*i+100;
                if(num<=200 && num>=100){
                    numeros[i] = num;
                }
                else{
                    int num2;
                    num2=(num/2)*9;
                    if(num2<=200 && num2>=100){
                        numeros[i] = num2;
                    }
                    else{
                        numeros[i] = 100;
                    }
                }
            }
            suma=suma+numeros[i];
        }
        for(int i=0; i<numeros.length; i++){
            System.out.println("["+ numeros[i] +"]");
        }
        System.out.println("el resultado de la suma es:"+ suma);
    }
}