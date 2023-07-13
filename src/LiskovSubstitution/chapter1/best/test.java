package LiskovSubstitution.chapter1.best;

public class test {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 5);
        rectangle.area();

        Shape square = new Square(5);
        square.area();
    }
}
