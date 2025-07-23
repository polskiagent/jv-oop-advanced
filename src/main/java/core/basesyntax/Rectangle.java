package core.basesyntax;

public class Rectangle implements Figure{
    private String color;
    private double width;
    private double length;

    @Override
    public double getArea() {
        return width * length;
    }

    public Rectangle(String color, double length, double width) {
        this.color = color;
        this.width = width;
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("figure: rectangle, " + "area: " + String.format("%.2f", getArea()) + " sq. units, " + "length: " + length + " units, " + "width: " + width + " units, " + "color: " + color);

    }
}
