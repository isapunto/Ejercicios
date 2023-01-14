import java.util.Scanner;

public class ejercicio2 {

    /*Escribe un programa que pida el precio de un producto y calcule el precio final con
    IVA (21%). El programa debe mostrar el precio original, el importe del IVA
    (precio*0,21) y el precio final (la suma de los dos importes anteriores). */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio;
        double iva;
        double precioConIva;

        System.out.print("¿Cuantos euros vale el producto?: ");
        precio = sc.nextDouble();
        iva = precio * 0.21;
        precioConIva = precio + iva;
        System.out.println("El precio original es: " + precio + " euros");
        System.out.println("El IVA es: " + iva  + " euros");
        System.out.println("El precio final: " + precioConIva + " euros");
            }
        }
