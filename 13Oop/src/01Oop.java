 class Oop {
    public static void main(String[] args) {
        Pen pen1 = new Pen();

        pen1.color = "Blue";
        pen1.price = 10;

        pen1.write();

    }
}
 
class Pen {

    int price;
    String color;
    String brand;

    public void write() {
        System.out.println("Writing...");
    }

    public void refill() {
        System.out.println("Refilling...");
    }

    public void changeColor() {
        System.out.println("Changing color...");
    }
    
}
