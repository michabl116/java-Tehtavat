package Task_1;

import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    // Méto para agregar un artículo a la lista de compras / Metodi lisäämään kohteen ostoslistaan
    public void addItem(String item) {
        if (!groceryList.contains(item)) {
            groceryList.add(item);
            System.out.println(item + " has been added to the grocery list.");
        } else {
            System.out.println(item + " is already in the grocery list.");
        }
    }

    // Méto para eliminar un artículo de la lista de compras / Metodi poistamaan kohteen ostoslistasta
    public void removeItem(String item) {
        if (groceryList.contains(item)) {
            groceryList.remove(item);
            System.out.println(item + " has been removed from the grocery list.");
        } else {
            System.out.println(item + " is not in the grocery list.");
        }
    }

    // Méto para mostrar todos los artículos en la lista de compras / Metodi näyttämään kaikki kohteet ostoslistassa
    public void displayList() {
        System.out.println("Grocery List:");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    // Méto para verificar si un artículo está en la lista de compras / Metodi tarkistamaan, onko kohde ostoslistassa
    public boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    // Méto principal para demostrar la funcionalidad / Päämetodi toiminnallisuuden esittelemiseksi
    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // Agregar artículos a la lista de compras / Lisää kohteita ostoslistaan
        manager.addItem("Apples");
        manager.addItem("Milk");
        manager.addItem("Bread");

        // Mostrar la lista de compras / Näytä ostoslista
        manager.displayList();

        // Verificar si un artículo específico está en la lista de compras / Tarkista, onko tietty kohde ostoslistassa
        System.out.println("Is 'Milk' in the grocery list? " + manager.checkItem("Milk"));

        // Eliminar un artículo de la lista de compras / Poista kohde ostoslistasta
        System.out.println("Removing 'Milk' from the list...");
        manager.removeItem("Milk");

        // Mostrar la lista de compras actualizada / Näytä päivitetty ostoslista
        manager.displayList();
    }
}
