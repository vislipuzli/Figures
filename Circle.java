public class Circle extends Triangle{
    private float radius;
    private float diameter;
    private float area;


    public float getArea(Triangle triangle) {
        area = (triangle.getA() * triangle.getB() * triangle.getC()) / (4 * triangle.getArea());
        return area;
    }

    public void printArea(Triangle triangle){
        System.out.println("Circle area is: " + getArea(triangle));
    }
}