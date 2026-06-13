package ui;

import data.GestorDatos;
import model.Tour;
import java.util.ArrayList;

/**
 * Clase principal del programa Llanquihue Tour.
 * Carga los tours desde un archivo de texto, los muestra por consola
 * y aplica un filtro por tipo de tour.
 */
public class Main {

    /**
     * Método principal que ejecuta el programa.
     *
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {

        // Ruta de archivo de texto
        String rutaArchivo = "resources/tours.txt";

        // Se crea un objeto de la clase GestorDatos
        GestorDatos gestor = new GestorDatos();

        // Se carga la lista de destinos turísticos desde el archivo
        ArrayList<Tour> tour = gestor.cargarTour(rutaArchivo);

        // Mostrar todos los destinos turísticos cargados
        System.out.println("===== CATÁLOGO DE DESTINOS TURÍSTICOS LLANQUIHUE TOUR =====");

        // Recorrer una lista de objetos
        for (Tour t : tour) {
            System.out.println(t);
        }

        // Filtrar destinos turísticos de tipo Gastronómico
        System.out.println("\n===== LISTA DE RUTAS GASTRONÓMICAS =====");

        for (Tour t : tour) {
            if (t.getTipo().equalsIgnoreCase("ruta gastronomica")) {
                System.out.println(t);
            }
        }
    }
}