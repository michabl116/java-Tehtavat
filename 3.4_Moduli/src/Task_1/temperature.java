import java.io.*;
import java.net.URL;
import java.text.*;
import java.util.*;

public class temperature {

    public static void main(String[] args) {
        String myUrl = "https://users.metropolia.fi/~jarkkov/temploki.csv";
        String line;
        List<Double> temperature = new ArrayList<>();
        SimpleDateFormat datformat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        DecimalFormat df = new DecimalFormat("#.##");

        try {
            URL url = new URL(myUrl);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));

            // Leer la primera línea (cabecera)
            String cabecera = br.readLine();
            String[] columnas = cabecera.split(";");

            int idxAika = -1;
            int idxUlkoTalo = -1;

            //Este bucle encuentra la posición de las columnas que nos interesan dentro del CSV.
            //Tämä silmukka etsii meitä kiinnostavien sarakkeiden sijainnin CSV:stä.
            for (int i = 0; i < columnas.length; i++) {
                if (columnas[i].equalsIgnoreCase("Aika")) {
                    idxAika = i;
                } else if (columnas[i].equalsIgnoreCase("UlkoTalo")) {
                    idxUlkoTalo = i;
                }
            }

            //Si no se encuentran las columnas necesarias, el programa termina con un mensaje.
            //Jos vaadittuja sarakkeita ei löydy, ohjelma päättyy sanomaan.
            if (idxAika == -1 || idxUlkoTalo == -1) {
                System.out.println("The required columns were not found.");
                return;
            }
                // Leer cada línea del archivo. Si la línea no tiene suficientes columnas, se salta.
                // Lue tiedoston jokainen rivi. Jos rivillä ei ole tarpeeksi sarakkeita, se ohitetaan.
            while ((line = br.readLine()) != null) {
                String[] partes = line.split(";");
                if (partes.length <= Math.max(idxAika, idxUlkoTalo)) continue;

                String textDat = partes[idxAika];
                String textTep = partes[idxUlkoTalo].replace(",", ".");  // Convertir coma a punto decimal

                Date fecha = datformat.parse(textDat);


                 // Luo kalenteri päivämäärän poimimiseksi
                // Crear un calendario para extraer la fecha
                Calendar cal = Calendar.getInstance();
                cal.setTime(fecha);

                
                //Poimimme päivän, kuukauden ja vuoden varmistaaksemme, onko se 1. tammikuuta 2023.
                //Extraemos día, mes y año para verificar si es 1 de enero de 2023.
                int dia = cal.get(Calendar.DAY_OF_MONTH);
                int mes = cal.get(Calendar.MONTH) + 1;
                int anio = cal.get(Calendar.YEAR);

                if (dia == 1 && mes == 1 && anio == 2023) {
                    try {
                        double temp = Double.parseDouble(textTep);
                        temperature.add(temp);
                    } catch (NumberFormatException e) {
                        // ignorar errores de conversión
                    }
                }
            }

            br.close();
                  // Jos lämpötiloja on, keskiarvo lasketaan lisäämällä kaikki arvot ja jakamalla kokonaismäärällä.
                 // Si hay temperaturas, se calcula el promedio sumando todos los valores y dividiendo por el total.
            if (!temperature.isEmpty()) {
                double suma = 0;
                for (double temp : temperature) {
                    suma += temp;
                }
                double average = suma / temperature.size();
                System.out.println(" Average temperature for January 1, 2023: " + df.format(average) + " °C");
            } else {
                System.out.println("No data found for January 1, 2023.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
