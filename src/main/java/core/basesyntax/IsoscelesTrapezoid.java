package core.basesyntax;

public class IsoscelesTrapezoid implements Figure{
    private String color;
    private double topBase;
    private double bottomBase;
    private double height;

    @Override
    public double getArea() {
        return (topBase + bottomBase) * height /2;
    }

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase, double height) {
        this.color = color;
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("figure: isosceles trapezoid, " + "area: " + String.format("%.2f", getArea()) + " sq. units, " + "topBase: " + topBase + " units, " + "bottomBase: " + bottomBase + " units, " + "height: " + height + " units, " + "color: " + color);
    }
}
