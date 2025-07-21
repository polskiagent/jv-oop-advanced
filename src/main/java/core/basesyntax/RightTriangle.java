package core.basesyntax;

public class RightTriangle implements Figure{
    private String color;
    private double firstLeg;
    private double secondLeg;

    @Override
    public double getArea() {
        return firstLeg * secondLeg /2;
    }

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("figure: right triangle, " + " area: " + String.format("%.2f", getArea()) + " sq. units, " + " firstLeg: " + firstLeg + " units, " + " secondLeg: " + secondLeg + " units, " + " color: " + color);
    }
}
