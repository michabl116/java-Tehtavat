package Task_1.DictionaryController;


import Task_1.DictionaryModel.Dictionary;
public class DictionaryController {
    private final Dictionary dictionary;

    public DictionaryController() {
        dictionary = new Dictionary();
    }

    public String buscarSignificado(String palabra) {
        if (palabra == null || palabra.trim().isEmpty()) {
            return "Ingrese una palabra válida.";
        }
        return dictionary.buscarPalabra(palabra);
    }
}
