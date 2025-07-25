package core.basesyntax;

public class Rectangle implements Figure {
    private String color;
    private double width;
    private double length;

    public Rectangle(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("figure: rectangle, " + "area: "
                + String.format("%.2f", getArea()) + " sq. units, "
                + "length: " + length + " units, " + "width: " + width + " units, "
                + "color: " + color);

    }
}
