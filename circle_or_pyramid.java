package circle_or_pyramid;

import java.util.Scanner;

public class circle_or_pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for Circle, 2 for Pyramid: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            calculateCircle(radius);
        } else if (choice == 2) {
            System.out.println("Enter the length, width and height of the pyramid: ");
            double length = scanner.nextDouble();
            double width = scanner.nextDouble();
            double height = scanner.nextDouble();
            calculatePyramid(length, width, height);
        } else {
            System.out.println("Invalid choice");
        }
        scanner.close();
    }

    public static void calculateCircle(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        System.out.println("Area of the circle is: " + area);
        System.out.println("Circumference of the circle is: " + circumference);
    }

    public static void calculatePyramid(double length, double width, double height) {
        double baseArea = length * width;
        double volume = (baseArea * height) / 3;
        System.out.println("Base area of the pyramid is: " + baseArea);
        System.out.println("Volume of the pyramid is: " + volume);
    }
}
