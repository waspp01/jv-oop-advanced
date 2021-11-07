package core.basesyntax;

public class RightTriangle extends Figure implements Drawing, AreaCalculator {

    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: right triangle, area: "
                + getArea()
                + " sq. units, firstLeg: "
                + firstLeg
                + " units, secondLeg: "
                + secondLeg
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }
}
