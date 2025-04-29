package products;

public abstract class Product {
    private String title;
    private Double price;
    private String id;
    public Product(String title, Double price) {
        setTitle(title);
        setPrice(price);
        this.id = generateId();
    }
    public String getTitle() {
        return title;
    }
    public Double getPrice() {
        return price;
    }
    public String getId() {
        return id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "title= " + title + ", price= " + price + ", id= " + id;
    }

    protected abstract String generateId();
}
