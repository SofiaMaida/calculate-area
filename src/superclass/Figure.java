package superclass;

import java.util.Objects;

public abstract class Figure {

    protected Double area;

    public Figure() {}

    public Figure(Double area) {
        this.area = area;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public abstract Double calculateArea();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        return Objects.equals(area, figure.area);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area);
    }

    @Override
    public String toString() {
        return "Figure { area = " + area + " }";
    }
}
