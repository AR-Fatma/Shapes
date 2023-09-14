public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(0, 0, 7);
        Circle circle2 = new Circle(7, 7, 7);

        Triangle triangle1 = new Triangle(0, 0, 7);
        Triangle triangle2 = new Triangle(3, 4, 4);

        Square square1 = new Square(0, 0, 8);
        Square square2 = new Square(9, 9, 8);

        Pentagon pentagon1 = new Pentagon(0, 0, 1);
        Pentagon pentagon2 = new Pentagon(-3, -3, 6);

        Shape[] shapes = {circle1, circle2, triangle1, triangle2, square1, square2, pentagon1, pentagon2};

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());

            shape.move(1, 1);
            System.out.println("After moving: (" + shape.getCenterx() + ", " + shape.getCentery() + ")");

            shape.setParameters(-1);
            System.out.println("After setting parameters: (" + shape.getCenterx() + ", " + shape.getCentery() + "), Side Length: " + shape.getPerimeter());

            System.out.println("--------------------------------");
        }
    }
}
