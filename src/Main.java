import Inventory.Inventory;
import products.*;
import products.Product;

public class Main {
    public static void main(String[] args) {
        Inventory<Book> inventory1 = new Inventory<Book>();
        Inventory<NoteBook> inventory2 = new Inventory<NoteBook>();
        Inventory<Accessory> inventory3 = new Inventory<Accessory>();

        Book book1 = new Book("Java Basics", 50.0, "Smith", "O'Reilly", "Education");
        Book book2 = new Book("Data Structures", 60.0, "Miller", "Pearson", "CS");
        inventory1.addItem(book1);
        inventory1.addItem(book2);

        NoteBook notebook1 = new NoteBook("Math Notebook", 10.0, 200, true);
        NoteBook notebook2 = new NoteBook("Daily Notebook", 15.0, 100, false);
        inventory2.addItem(notebook1);
        inventory2.addItem(notebook2);

        Accessory accessory1 = new Accessory("Pen", 2.0, "Blue");
        Accessory accessory2 = new Accessory("Eraser", 1.0, "White");
        inventory3.addItem(accessory1);
        inventory3.addItem(accessory2);

        System.out.println("Books:");
        inventory1.displayAll();
        System.out.println("\nNotebooks:");
        inventory2.displayAll();
        System.out.println("\nAccessories:");
        inventory3.displayAll();

        inventory1.removeItemsById(book1.getId());
        inventory2.removeItemsById(notebook1.getId());

        double total = calculateTotalPrice(inventory1) + calculateTotalPrice(inventory2) + calculateTotalPrice(inventory3);
        System.out.println("\nTotal Inventory Price: $" + total);


        try {
            inventory1.findItemById(book1.getId());
            inventory1.findItemById(notebook2.getId());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        inventory1.applyDiscount("Data Structures", 30);
        inventory3.applyDiscount("Pen", 50);

        System.out.println("Books:");
        inventory1.displayAll();
        System.out.println("\nNotebooks:");
        inventory2.displayAll(
        System.out.println("\nAccessories:");
        inventory3.displayAll();

    }
    public static double calculateTotalPrice(Inventory<? extends Product> inventory) {
        double total = 0.0;
        for (Product product : inventory.getItems()) {
            total += product.getPrice();
        }
        return total;
    }
}