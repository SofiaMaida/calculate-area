package subclass;

import superclass.Figure;

import java.util.Objects;

public class Rectangle extends Figure {

    private Double heigth;
    private Double width;

    public Rectangle() {}

    public Rectangle(Double heigth, Double width) {
        this.heigth = heigth;
        this.width = width;
    }

    public Double getHeigth() {
        return heigth;
    }

    public void setHeigth(Double heigth) {
        this.heigth = heigth;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public Double calculateArea() {
        this.area = this.heigth * this.width;
        return this.area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle that = (Rectangle) o;
        return width.equals(that.width) &&
                heigth.equals(that.heigth) &&
                super.equals(that);
    }

    @Override
    public int hashCode() {
        return -2 * Objects.hash(this.heigth, this.width, this.area);
    }

    @Override
    public String toString() {
        return "Rectangle { heigth = " + heigth + ", width = " + width + " }";
    }
}
