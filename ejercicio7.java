import java.util.Scanner;

public class ejercicio7 {
  /*Diseñe e implemente un método que calcule la media de los valores de un array
    de entrada dado.*/
    public static double mediaArray(int[] array){
      double sumaArray = 0;
      double media;

      for(int i = 0 ; i < array.length ; i++){
        // sumaArray = sumaArray + array[i] ;
        sumaArray += array[i];
      }
      media = sumaArray / array.length;
      return media;
    }

    public static void main(String[] args) {
      int[] arrayNumeros = {5,4,8,7,9,5,8,2,3,6,5,8,4,4,8,5,8,9,1,7};
      double media;

      media = mediaArray(arrayNumeros);
      System.out.println("La media del array es: " + media);
    }
}
