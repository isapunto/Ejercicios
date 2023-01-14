import java.util.Scanner;

public class ejercicio8 {
  /*Crea un programa que rellene la matriz identidad de 4x4 elementos y la muestre por
pantalla.*/

  public static void main(String[] args) {
    int numFilas = 4, numColum = 4;
    int[][] matriz = new int[numFilas][numColum];

    for(int i = 0 ; i < numFilas ; i++){
      for (int j = 0 ; j < numColum ; j++){
        if (i == j) {
          matriz[i][j] = 1;
        } else {
          matriz[i][j] = 0;
        }
      }
    }

    for(int i = 0 ; i < numFilas ; i++){
      for (int j = 0 ; j < numColum ; j++){
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
  }
}
