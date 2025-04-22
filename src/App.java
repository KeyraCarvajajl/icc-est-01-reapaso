import Models.Persona;
import Controllers.PersonaController;
import Views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        // Crear arreglo de personas
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("María", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofía", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26)
        };

        // Instanciar clases necesarias
        PersonaController pC = new PersonaController();
        ViewConsole vC = new ViewConsole();

        // Imprimir arreglo original
        vC.printMessage("Personas", true);
        vC.printPersonsArray(personas);

        // Ordenar por edad
        vC.printMessage("Personas Ordenadas por edad", true);
        pC.ordenarPorEdad(personas);
        vC.printPersonsArray(personas);

        // Buscar edad 40
        vC.printMessage("Buscar persona con edad 40", true);
        Persona pB = pC.buscarPorEdad(personas, 40);
        if (pB == null) {
            vC.printMessage("\tNo hay persona con esa edad", false);
        } else {
            vC.printMessage("\tLa persona con la edad 40 es:", false);
            vC.printMessage("\t" + pB.getNombre() + " - " + pB.getEdad(), false);
        }

        // Buscar edad 99
        vC.printMessage("Buscar persona con edad 99", true);
        Persona pC2 = pC.buscarPorEdad(personas, 99);
        if (pC2 == null) {
            vC.printMessage("\tNo hay persona con esa edad", false);
        } else {
            vC.printMessage("\tLa persona con la edad 99 es:", false);
            vC.printMessage("\t" + pC2.getNombre() + " - " + pC2.getEdad(), false);
        }
    }
}
