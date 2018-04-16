public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setSizes(7, 7, 7);
        triangle.printArea();
        triangle.printPerimeter();

        Rectangle rectangle = new Rectangle(triangle);
        rectangle.getArea();

        Circle circle = new Circle();
        circle.printArea(triangle);

        Shape oval = new Oval();
        oval.setSizes();
        oval.printaArea();
        oval.printPerimeter();
    }
}

//
//  Task for the next time will be all familiar:
//        Having following geometric figures:
//        1)	Circle
//        2)	Oval
//        3)	Square
//        4)	Triangle
//        5)	Rectangle
//        Create an hierarchy of classes an interfaces of those classes, and include:
//        1)	Properties
//        2)	Constructors
//        3)	Perimeter
//        4)	Area
