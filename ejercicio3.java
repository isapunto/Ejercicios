import java.util.Scanner;

public class ejercicio3 {
    // Implemente un programa que pida el radio de un círculo y calcule su área
    //(área=PI*radio^2) y la longitud de su circunferencia (Longitud = 2*PI*radio).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio;
        double longitud;
        double area;

        System.out.print("¿Cuantos centimetros mide el radio del circulo?: ");
        radio = sc.nextDouble();
        area = (3.1416*Math.pow(radio, 2));
        longitud = (2*3.1416*radio);
        System.out.println("El area del circulo es: " + area + " cm");
        System.out.println("La longitud de la circunferencia del circulo es: " + longitud + " cm");


    }

}
