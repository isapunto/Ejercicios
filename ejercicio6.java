import java.util.Scanner;

public class ejercicio6 {

    /*Haciendo uso de un bucle, escribir un programa que muestre por pantalla las diez
    primeras potencias de un número leído de teclado. Es decir, si el número introducido
    es n, debe mostrar: n0,n1,n2,n3,...,n10 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int potencia;

        System.out.println("Escribe un numero: ");
        num = sc.nextInt();

        System.out.println("Las potencias de " + num + " son: ");
        for (int i = 0; i <= 10; i++) {
            potencia = (int) Math.pow(num, i);
            System.out.println(potencia);
        }
    }
}
