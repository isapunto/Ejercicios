//package Ejemplo;
import java.util.ArrayList;

public class Ejemplo {
	public Ejemplo() {}

	public static void main(String[] args) {
	ArrayList<String> arrayString = new ArrayList<String>();
	System.out.println("Añadimos datos: Hola, Adios, Perro y Gato.");
	arrayString.add("Hola");
	arrayString.add("Adios");
	arrayString.add("Perro");
	arrayString.add("Gato");
	System.out.println("Imprimimos el ArrayList: ");
	System.out.println(arrayString);

	System.out.println("Mostramos lo que hay en la posición 1: ");
	System.out.println(arrayString.get(1));
	System.out.println("Cambiamos lo que hay en la posición 2 por Platanos. ");
	arrayString.set(2,"Platanos");
	System.out.println(arrayString);
	System.out.println("Eliminamos lo que hay en la posición 2: ");
	arrayString.remove(2);
	System.out.println(arrayString);
	System.out.println("Eliminamos Adios: ");
	System.out.println(arrayString.remove("Adios"));
	System.out.println(arrayString);
	System.out.println("Volvemos a eliminar Adios: ");
	System.out.println(arrayString.remove("Adios"));
	System.out.println(arrayString);

	// Se puede usar while para crear un bucle que borre el
	// elemento (mientras exista devolverá true) hasta que
	// devuelva false porque ya no haya eliminado nada.
	while (arrayString.remove("Perro"));

	// Borrar sio se cumple la condición de dentro del parentesis
	// Esto:
	arrayString.removeIf(elementoArrayList->elementoArrayList.equals("Gato"));
 	// Es lo mismo que esto:
	/*
	for (int i = 0 ; i < arrayString.size() ; i++){
		if ( arrayString.get(i).equals("Gato")) arrayString.remove(i);
	}
	*/

	// Borrar las palabras que tengan en la primera letra una P y
	// en la  segunda letra una e.
	arrayString.removeIf(elementoArrayList->(elementoArrayList.charAt(0)=='P' && elementoArrayList.charAt(1)=='e'));

	// Para ordenar el array se usa sort (El null es porque ordena con el valor por defecto)
	arrayString.sort(null);
	}
}
