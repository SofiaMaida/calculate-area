package subclass;

import superclass.Figure;

import java.util.Objects;

public class Circle extends Figure {

    private Double radio;

    public Circle(Double radio) {
        this.radio = radio;
    }

    public Circle(Double area, Double radio) {
        super(area);
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calculateArea() {
        area = ( Math.PI * radio * radio);
        return area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Objects.equals(radio, circle.radio);
    }

    @Override
    public int hashCode() {
        return -2 * Objects.hash(this.radio);
    }

    @Override
    public String toString() {
        return "Circle { radio = " + radio + " }";
    }

}
