import java.util.Scanner;

public class Object1 {
	public static void main(String[]args){
				Scanner inn = new Scanner(System.in);
				System.out.println("Area of an Retangle");
				System.out.print("Enter the length of  the Rectangle: ");
				double length = inn.nextDouble();

				System.out.print("Enter the breadth of  the Rectangle: ");
				double breadth = inn.nextDouble();

				Area rect = new Area();

				rect.setDim(length, breadth);

				System.out.println("The area of the rectangle: " +rect.getArea());
	}
}