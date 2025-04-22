package Models;

/**
 * Clase Persona que representa una entidad Persona con atributos para nombre y edad.
 * Esta clase forma parte del modelo dentro de una arquitectura MVC.
 */
public class Persona {
    // Atributos de la clase

    /**
     * Almacena el nombre de la persona.
     */
    private String nombre;

    /**
     * Almacena la edad de la persona.
     */
    private int edad;

    /**
     * Constructor para crear una nueva instancia de Persona con un nombre y edad específicos.
     * 
     * @param nombre Nombre de la persona.
     * @param edad   Edad de la persona.
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre; // Asigna el nombre pasado como parámetro al atributo 'nombre'
        this.edad = edad;     // Asigna la edad pasada como parámetro al atributo 'edad'
    }

    /**
     * Método sobrescrito para obtener una representación en cadena de la persona.
     * 
     * @return Una cadena con el nombre y edad de la persona.
     */
    @Override
    public String toString() {
        return nombre + " - " + edad;
    }

    // --- Getters y Setters ---

    /**
     * Obtiene el nombre de la persona.
     * 
     * @return El nombre actual de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para la persona.
     * 
     * @param nombre El nuevo nombre que se desea asignar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad actual de la persona.
     * 
     * @return La edad de la persona.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece una nueva edad para la persona.
     * 
     * @param edad La nueva edad que se desea asignar.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
