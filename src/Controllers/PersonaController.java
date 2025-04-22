package Controllers;

import Models.Persona;

/**
 * Controlador para manejar operaciones sobre arreglos de Persona.
 */
public class PersonaController {

    /**
     * Ordena un arreglo de personas por edad usando el método de inserción.
     */
    public void ordenarPorEdad(Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Persona actual = personas[i];
            int j = i - 1;

            while (j >= 0 && personas[j].getEdad() > actual.getEdad()) {
                personas[j + 1] = personas[j];
                j--;
            }

            personas[j + 1] = actual;
        }
    }

    /**
     * Realiza una búsqueda binaria por edad (requiere que el arreglo esté ordenado).
     * 
     * @param personas Arreglo ordenado por edad.
     * @param edad     Edad a buscar.
     * @return Persona con la edad indicada o null si no existe.
     */
    public Persona buscarPorEdad(Persona[] personas, int edad) {
        int inicio = 0;
        int fin = personas.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (personas[medio].getEdad() == edad) {
                return personas[medio];
            }

            if (personas[medio].getEdad() < edad) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return null;
    }
}
