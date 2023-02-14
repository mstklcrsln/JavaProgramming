package recap_tasks.candie;

public class Candie {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPenauts;


    public Candie(String brand, int quantity, double price, boolean hasPenauts) {
        this.brand = brand;
        if(quantity<=0){
            throw new RuntimeException("Invalid quantity "+ quantity);
        }
        this.quantity = quantity;
        if(price<0){
            throw new RuntimeException("Invalid price "+ price);
        }else if(price==0){
            System.out.println("free");
        }
        this.price = price;
        this.hasPenauts = hasPenauts;
    }

    @Override
    public String toString() {
        return "Candie{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", hasPenauts=" + hasPenauts +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasPenauts() {
        return hasPenauts;
    }

    public void setHasPenauts(boolean hasPenauts) {
        this.hasPenauts = hasPenauts;
    }
}
