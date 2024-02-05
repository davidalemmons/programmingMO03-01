public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "red", true);
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        circle.printCircle();
    }
}
