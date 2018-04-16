public class Square extends Triangle {
    private int sideA;
    private int sideB;
    private int sideC;
    private float area;

    public Square(int sideA) {
        this.sideA = sideA;
    }

    public float getPerimeter(){
        return sideA * 4;
    }

    public void printPerimeter(){
        System.out.println("Perimeter of square is: " + getPerimeter());
    }

    public float getArea() {
        area = calculateSquareArea() * 2;
        return area;
    }

    private float calculateSquareArea() {
        super.setA(this.sideA);
        super.setB(this.sideA);
        super.setC(this.sideA);
        area = super.getArea();
        return area;
    }
}
