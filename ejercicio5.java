import java.util.Scanner;

public class ejercicio5 {
    /*Implemente un programa que pida un número entre 1 y 7, y muestre por pantalla el
    día de la semana que le corresponde ('lunes', 'martes', ...). En caso de que el valor
    leído esté fuera de rango debe mostrar un mensaje de error. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;

        System.out.println("Escribe el dia de la semana en numero: ");
        dia = sc.nextInt();

        switch (dia) {
        case 1:
            System.out.println("Lunes");
            break;
        case 2:
            System.out.println("Martes");
            break;
        case 3:
            System.out.println("Miercoles");
            break;
        case 4:
            System.out.println("Jueves");
            break;
        case 5:
            System.out.println("Viernes");
            break;
        case 6:
            System.out.println("Sabado");
            break;
        case 7:
            System.out.println("Domingo");
            break;
        default:
            System.out.println("Error, introduzca un numero del 1 al 7.");
        }
    }
}
