package sort;

public class Shoe implements Comparable<Shoe> {

    double price;
    String colour;
    int size;

    public Shoe(double price, String colour, int size) {
        this.price = price;
        this.colour = colour;
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shoe{" + "price=" + price + ", colour=" + colour + ", size=" + size;
    }


    public int compareTo(Shoe o) {
        return o.size - this.size;
    }
    

}
