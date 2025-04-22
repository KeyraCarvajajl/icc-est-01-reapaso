package Views;

import Models.Persona;

/**
 * Clase ViewConsole para mostrar datos en consola.
 */
public class ViewConsole {

    /**
     * Imprime un mensaje con formato especial si es encabezado (main=true).
     * 
     * @param message Mensaje a imprimir.
     * @param main    Si es true, se imprimen con asteriscos y línea separadora.
     */
    public void printMessage(String message, boolean main) {
        if (main) {
            System.out.println("\n*** " + message + " ***");
        } else {
            System.out.println(message);
        }
    }

    /**
     * Imprime un arreglo de personas con formato de nombre y edad, separado por ||.
     * 
     * @param personas Arreglo de objetos Persona.
     */
    public void printPersonsArray(Persona[] personas) {
        for (Persona persona : personas) {
            System.out.print(persona.getNombre() + " - " + persona.getEdad() + " || ");
        }
        System.out.println(); // Salto de línea final
    }
}
