import java.util.Scanner;

public class ejercicio4 {
        //Implemente un programa que pida la edad de una persona por teclado e indique si es mayor de edad o no.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;

        System.out.println("¿Cuantos anios tienes? ");
        edad = sc.nextInt();

        if (edad >= 18){
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("No eres mayor de edad.");
        }
    }
}
