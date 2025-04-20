public class RadiusCircle {
    double radius;

    public RadiusCircle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
    }

    public static void main(String[] args) {
        RadiusCircle circle1 = new RadiusCircle(5);
        RadiusCircle circle2 = new RadiusCircle(30);
        RadiusCircle circle3 = new RadiusCircle(150);

        System.out.println("Circle 1:");
        circle1.display();

        System.out.println("\nCircle 2:");
        circle2.display();

        System.out.println("\nCircle 3:");
        circle3.display();

        circle2.radius = 300;

        System.out.println("\nUpdated Circle 2:");
        circle2.display();
    }
}
