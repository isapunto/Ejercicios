import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioArrayRatas {
  public static double calcularMedia(ArrayList<Double> numeros){
    double sumaTotal = 0;
    double media;
    /*
    for(int i = 0 ; i < numeros.size() ; i++){
      // sumaTotal = sumaTotal + numeros.get(i);
      sumaTotal += numeros.get(i);
    }
    */
    // Para cada elemento (num) que haya en el array (numeros)
    // realizamos la operación:
    for (double num : numeros ) {
      sumaTotal += num;
    }

    media = sumaTotal/numeros.size();
    return media;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tamaArrayRatas = 5;
    double pesoRata;
    ArrayList<Double> pesosRatas = new ArrayList<Double>();

    for (int i = 0 ; i < tamaArrayRatas ; i++ ) {
      System.out.println("Introduce el peso de la rata " + (i+1) +" en gramos: ");
      pesoRata = sc.nextDouble();
      pesosRatas.add(pesoRata);
      // Podemos hacerlo directamente sin la variable pesoRata:
      // pesosRatas.add(sc.nextDouble())
    }
    System.out.println(pesosRatas);
    System.out.println("La media de los pesos es: " + calcularMedia(pesosRatas) + "g.");
  }
}
