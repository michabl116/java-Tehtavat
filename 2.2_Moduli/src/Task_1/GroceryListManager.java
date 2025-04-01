package Task_1;

import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    // Metodi lisäämään kohteen ostoslistaan
    public void addItem(String item) {
        if (!groceryList.contains(item)) {
            groceryList.add(item);
            System.out.println(item + " has been added to the grocery list.");
        } else {
            System.out.println(item + " is already in the grocery list.");
        }
    }

    // Metodi poistamaan kohteen ostoslistasta
    public void removeItem(String item) {
        if (groceryList.contains(item)) {
            groceryList.remove(item);
            System.out.println(item + " has been removed from the grocery list.");
        } else {
            System.out.println(item + " is not in the grocery list.");
        }
    }

    // Metodi näyttämään kaikki kohteet ostoslistassa
    public void displayList() {
        System.out.println("Grocery List:");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    // Metodi tarkistamaan, onko kohde ostoslistassa
    public boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    // Päämetodi toiminnallisuuden esittelemiseksi
    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // Lisää kohteita ostoslistaan
        manager.addItem("Apples");
        manager.addItem("Milk");
        manager.addItem("Bread");

        // Näytä ostoslista
        manager.displayList();

        // Tarkista, onko tietty kohde ostoslistassa
        System.out.println("Is 'Milk' in the grocery list? " + manager.checkItem("Milk"));

        // Poista kohde ostoslistasta
        System.out.println("Removing 'Milk' from the list...");
        manager.removeItem("Milk");

        // Näytä päivitetty ostoslista
        manager.displayList();
    }
}
