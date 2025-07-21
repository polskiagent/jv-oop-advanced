package core.basesyntax;

public class Circle implements Figure{
    private double radius;
    private String color;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("figure: circle, " + " area: " + getArea() + " sq. units, radius: "
                + radius + " units, " + " color: " + color);

    }
}
