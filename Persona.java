import java.util.Scanner;
/*Implemente una clase Persona con los atributos nombre y apellidos. A continuación,
implemente un programa que almacene varias personas en un array, muestre la
lista, invierta el orden de los elementos y lo vuelva a mostrar.*/
public class Persona {
  private String nombre;
  private String apellidos;

  public Persona(){
    this.nombre = "nombre";
    this.apellidos = "apellido1 apellido2";
  }
  public Persona(String nombre, String apellidos){
    this.nombre = nombre;
    this.apellidos = apellidos;
  }
  public String getNombre(){
    return this.nombre;
  }
  public String getApellidos(){
    return this.apellidos;
  }
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public void setApellidos(String apellidos){
    this.apellidos = apellidos;
  }

  public static void mostrarArrayPersonas(Persona[] array){
    for(int i = 0 ; i < array.length ; i++){
      System.out.println(array[i]);
    }
  }

  public static Persona[] invertirArrayPersonas(Persona[] array){
    Persona[] arrayInv = new Persona[array.length];
    int iInv = array.length - 1;
    for(int i = 0 ; i < array.length ; i++){
      arrayInv[iInv] = array[i];
      iInv--;
    }
    return arrayInv;
  }

  public String toString(){
    return "Mi nombre es " + this.nombre + " " + this.apellidos + ".";
  }
  public static void main(String[] args) {
    Persona persona1 = new Persona("Isa", "Plaza Fernandez");
    Persona persona2 = new Persona("Dorotea", "de Angulo Morcillo");
    Persona persona3 = new Persona("Benigno", "Santos Armas");
    Persona persona4 = new Persona("Rosa", "Mosquera Vera");
    Persona persona5 = new Persona("Dolores", "Fuertes de Barriga");

    /*
    //Prueba de funcionamiento.
    System.out.println(persona2);
    persona2.setNombre("DOROTEA");
    persona2.setApellidos("DE ANGULO MORCILLO");
    System.out.println(persona2.getNombre());
    System.out.println(persona2.getApellidos());
    */

    Persona[] arrayPersonas = {persona1,persona2,persona3,persona4,persona5};
    Persona[] arrayInv = new Persona[arrayPersonas.length];
    System.out.println("Array inicial:");
    mostrarArrayPersonas(arrayPersonas);
    arrayInv = invertirArrayPersonas(arrayPersonas);
    System.out.println("Array invertido:");
    mostrarArrayPersonas(arrayInv);

  }
}
