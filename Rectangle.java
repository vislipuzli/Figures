public class Rectangle extends Triangle {

    private int sideA;
    private int sideB;
    private int sideC;
    private float area;

    public Rectangle(Triangle triangle) {
        this.sideA = triangle.getA();
        this.sideB = triangle.getB();
        this.sideC = triangle.getC();
    }

    public float getArea() {
        area = calculateRectangleArea();
        return area;
    }

    public float getPerimeter(){
        return 1;
    }

    public void printArea(){
        System.out.println("Rectangle area is: " + area);
    }

    private float calculateRectangleArea() {
        if (sideA == sideB && sideB == sideC) {
            Square square = new Square(sideA);
            System.out.println("Square area is: " + square.getArea());
        }
        else if(isThisRectangleSquare(sideA, sideB, sideC)) {
            area = sideB * sideA;
            printArea();
        } else {
            double highOfTriangle = calculateHighOfTriangle(sideA, sideB, sideC);
            area = (float) (highOfTriangle * sideC);
            printArea();
        }
        return area;
    }
}
