import java.util.ArrayList;
import java.util.Collections;

public class Triangle implements Figure{

    private int sideA;
    private int sideB;
    private int sideC;
    private float area;

    @Override
    public float getArea() {
        calculateAreaOfTriangle();
        return area;
    }

    @Override
    public float getPerimeter() {
        return getA() + getB() + getC();
    }

    @Override
    public void printArea() {
        System.out.println("Triangle area is: " + getArea());

    }

    @Override
    public void printPerimeter() {
        System.out.println("Triangle perimeter is: " + getPerimeter());
    }

    public void setA(int a) {
        this.sideA = a;
    }

    public void setB(int b) {
        this.sideB = b;
    }

    public void setC(int c) {
        this.sideC = c;
    }

    public int getA() {
        return sideA;
    }

    public int getB() {
        return sideB;
    }

    public int getC() {
        return sideC;
    }

    public void setSizes(int i, int i1, int i2) {
        ArrayList<Integer> listOfSides = new ArrayList<>();
        listOfSides.add(i);
        listOfSides.add(i1);
        listOfSides.add(i2);
        Collections.sort(listOfSides);

        setA(listOfSides.get(0));
        setB(listOfSides.get(1));
        setC(listOfSides.get(2));
    }

    private void calculateAreaOfTriangle() {
        double sumOfSides = this.sideA + this.sideB + this.sideC;
        sumOfSides /= 2;
        this.area = (float) Math.sqrt(sumOfSides * (sumOfSides - this.sideA) * (sumOfSides - this.sideB) * (sumOfSides - this.sideC));
    }

    boolean isThisRectangleSquare(int sideA, int sideB, int sideC) {
        return (Math.pow(sideC, 2) == Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }

    public float calculateHighOfTriangle(int sideA, int sideB, int sideC) {
        float p = 0.5f * (sideA + sideB + sideC);
        float h = (float)(2 * Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC))) / sideA;
        return h;
    }
}
