This is a Java-based inventory management application that demonstrates object-oriented programming principles such as inheritance, 
abstraction, and generics.
The application supports different types of products including Book, Notebook, and Accessory, each of which inherits from an abstract Product class.
Each product is assigned a unique ID using a static counter within its class. 
Products are stored and managed using a generic Inventory<T extends Product> class, 
which supports operations like adding items, removing items by ID, finding items by ID, 
applying discounts by product title, and displaying all products. 
The Main class demonstrates usage by creating inventories for each product type, performing operations like adding and removing products, applying discounts, and calculating the total inventory value. 
The project is structured with a clear package layout, separating inventory logic and product definitions, and is implemented in Java 8 or higher.
To run the project, open it in your preferred Java IDE, and execute Main.java to see the system in action.
