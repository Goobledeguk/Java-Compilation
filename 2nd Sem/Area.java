class Triangle {
    private double side1;
    private double side2;
    private double side3;

    // Constructor without parameters, initializes to 3, 4, 5
    public Triangle() {
        this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;
    }

    // Method to calculate area using base and height formula
    public double getArea() {
        return (side1 * side2) / 2;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}

