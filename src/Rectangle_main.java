public class Rectangle_main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println("Rectangle Area: " + rectangle.getArea());


        Rectangle Rectangles[] = new Rectangle[3];
        Rectangles[0] = new Rectangle(5.0, 3.0);
        Rectangles[1] = new Rectangle(7.0, 4.0);
        Rectangles[2] = new Rectangle(6.0, 2.5);

        for (int i = 0; i < Rectangles.length; i++) {

        }

        System.out.println("Rect1: " + Rectangles[0].getArea());

    }
}
