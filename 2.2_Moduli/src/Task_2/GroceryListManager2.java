package Task_2;
import java.util.HashMap;

public class GroceryListManager2 {
    private HashMap<String, Double> groceryList = new HashMap<>();

    // Metodi lisäämään kohteen ja sen hinnan ostoslistaan
    // Méto para agregar un artículo y su costo a la lista de compras
    public void addItem(String item, double cost) {
        if (!groceryList.containsKey(item)) {
            groceryList.put(item, cost);
            System.out.println(item + " has been added to the grocery list with a cost of " + cost);
        } else {
            System.out.println(item + " is already in the grocery list.");
        }
    }

    // Metodi poistamaan kohteen ostoslistasta
    // Méto para eliminar un artículo de la lista de compras
    public void removeItem(String item) {
        if (groceryList.containsKey(item)) {
            groceryList.remove(item);
            System.out.println(item + " has been removed from the grocery list.");
        } else {
            System.out.println(item + " is not in the grocery list.");
        }
    }

    // Metodi näyttämään kaikki kohteet ostoslistassa
    // Méto para mostrar todos los artículos en la lista de compras
    public void displayList() {
        System.out.println("Grocery List:");
        int index = 1;
        for (String item : groceryList.keySet()) {
            System.out.println(index + ". " + item + " - $" + groceryList.get(item));
            index++;
        }
    }

    // Metodi tarkistamaan, onko kohde ostoslistassa
    // Méto para verificar si un artículo está presente en la lista de compras
    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    // Metodi laskemaan kaikkien kohteiden kokonaiskustannukset ostoslistassa
    // Méto para calcular el costo total de todos los artículos en la lista de compras
    public double calculateTotalCost() {
        double totalCost = 0;
        for (double cost : groceryList.values()) {
            totalCost += cost;
        }
        return totalCost;
    }

    // Päämetodi toiminnallisuuden esittelemiseksi
    // Méto principal para demostrar la funcionalidad
    public static void main(String[] args) {
        GroceryListManager2 manager = new GroceryListManager2();

        // Lisää kohteita ostoslistaan
        // Añadir artículos a la lista de compras
        manager.addItem("Apples", 1.50);
        manager.addItem("Milk", 2.00);
        manager.addItem("Bread", 1.75);

        // Näytä ostoslista
        // Mostrar la lista de compras
        manager.displayList();

        // Tarkista, onko tietty kohde ostoslistassa
        // Comprobar si un artículo específico está presente en la lista de compras
        System.out.println("Is 'Milk' in the grocery list? " + manager.checkItem("Milk"));

        // Laske ostoslistan kokonaiskustannukset
        // Calcular el costo total de la lista de compras
        System.out.println("Total cost: €" + manager.calculateTotalCost());

        // Poista kohde ostoslistasta
        // Eliminar un artículo de la lista de compras
        System.out.println("Removing 'Milk' from the list...");
        manager.removeItem("Milk");

        // Näytä päivitetty ostoslista
        // Mostrar la lista de compras actualizada
        manager.displayList();

        // Laske päivitetyt kokonaiskustannukset ostoslistassa
        // Calcular el costo total actualizado de la lista de compras
        System.out.println("Updated total cost: $" + manager.calculateTotalCost());
    }
}
