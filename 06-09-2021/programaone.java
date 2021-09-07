import java.net.Socket;
import java.util.Scanner;

public class programaone {
    public static void main(String[] args) {
        int col, fil,num=1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿cuantas filas deseas ingresar?");
        fil=entrada.nextInt();
        System.out.println("¿cuantas columnas deseas ingresar?");
        col=entrada.nextInt();
        int matriz[][] = new int[col][fil];
        for(int i=0;i<col;i++){
            for(int j=0;j<fil;j++){
                for(int n=0;n<=col;n++){
                    num=n*3*j+1*i+5-2;
                    if(num<=100){
                        matriz[i][j] = num;
                    }
                    else{
                        int num2;
                        num2=(num/9)*2;
                        if(num2<=100){
                            matriz[i][j] = num2;
                        }
                        else{
                            matriz[i][j] = 0;
                        }
                    }
                }
            }
        }
        System.out.println("valores introducidos:");
        for(int i=0;i<matriz.length;i++){
            System.out.println();
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}
