package core.basesyntax;

public class Square implements Figure{
    private String color;
    private double side;

    @Override
    public double getArea() {
        return side * side;
    }

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("figure: square, " + "area: " + String.format("%.2f", getArea()) + " sq. units, " + "side: " + side + " units, " + "color: " + color);


    }
}
