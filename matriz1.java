package matrizbd;
import java.util.Scanner;
public class matriz1 {
    public static void main(String[] args) {
            int num;
            Scanner entrada =new Scanner (System.in);
            System.out.println("cuantas filas y columnas quieres ingresar?");
            num=entrada.nextInt();
            char matriz[][] = new char[num][num];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = ' ';
                if(j==0 || i==0 || i==(num-1) || j==(num-1)) matriz[i][j] = '*';
            }
        }
        for (int i = 0; i < matriz.length; i++) { 
            System.out.println();
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
                if(j==(1-num)) System.out.println("\n");
            }
        }
    }
}