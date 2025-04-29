package products;

public class Accessory extends Product {
    private String color;
    private static int accessoryCount = 0;

    public Accessory(String title, Double price, String color) {
        super(title, price);
        setColor(color);
        accessoryCount++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    protected String generateId() {
        return "3" + String.format("%03d", accessoryCount);
    }
    @Override
    public String toString() {
        return super.toString() + ", color: " + getColor();
    }
}
