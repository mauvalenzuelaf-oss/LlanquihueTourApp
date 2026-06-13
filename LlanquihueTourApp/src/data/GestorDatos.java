package data;

import model.Tour;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase encargada de cargar datos de tours desde un archivo de texto.
 */
public class GestorDatos {

    /**
     * Lee un archivo de texto con datos de tours separados por punto y coma.
     * Cada línea debe tener el formato: nombre;tipo;ubicacion;precioAdulto.
     *
     * @param rutaArchivo ruta del archivo que contiene los datos de los tours
     * @return lista dinámica de objetos Tour cargados desde el archivo
     */
    public ArrayList<Tour> cargarTour(String rutaArchivo) {

        // Lista dinámica donde se almacenarán los destinos turísticos
        ArrayList<Tour> listaTour = new ArrayList<>();

        try {
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 4) {
                    String nombre = partes[0].trim();
                    String tipo = partes[1].trim();
                    String ubicacion = partes[2].trim();
                    int precioAdulto = Integer.parseInt(partes[3].trim());

                    Tour tour = new Tour(nombre, tipo, ubicacion, precioAdulto);
                    listaTour.add(tour);
                }
            }

            lector.close();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return listaTour;
    }

}
