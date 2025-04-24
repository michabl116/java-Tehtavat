package Task_1.DictionaryModel;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Dictionary {
    private final Map<String, String> palabras;

    public Dictionary() {
        palabras = new HashMap<>();
        agregarPalabrasIniciales();
    }

    private void agregarPalabrasIniciales() {
        palabras.put("java".toLowerCase(Locale.ROOT), "Lenguaje de programación orientado a objetos.");
        palabras.put("python".toLowerCase(Locale.ROOT), "Lenguaje de programación de alto nivel y fácil de leer.");
        palabras.put("javaFX".toLowerCase(Locale.ROOT),"Framework para crear interfaces gráficas en Java.");
    }

    public void agregarPalabra(String palabra, String significado) {
        palabras.put(palabra.toLowerCase(), significado);
    }

    public String buscarPalabra(String palabra) {
        return palabras.getOrDefault(palabra.toLowerCase(Locale.ROOT), "Palabra no encontrada.");
    }
}