package matrizbd;
import java.util.Scanner;
public class matriz3 {
    public static void main(String[] args) {
        int num;
        Scanner ventana = new Scanner(System.in);
        System.out.println("¿cuantos numeros deseas ingresar?");
        num=ventana.nextInt();
        char matriz[][] = new char[num][num];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = ' ';
                for(int n =0; n<num;n++){
                    if(i==n-j)  matriz[i][j] = '*';
                }                      
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ") ;
                if(j==(1-num))  System.out.print("\n");
            }
        }
    }
}
