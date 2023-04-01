
package Q2;


public class Brick {
    private String place;
    private int price;

    public Brick() {
    }

    public Brick(String place, int price) {
        this.place = place;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return place + ", " + price + ", ";
    }
    
}