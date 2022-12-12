package org.example.Metod;

public class Circle extends Figure implements ILengthable{
    private  Double radius;
    private Double pi = 3.14;
    double area;

    public Circle(Double radius) {
        area = 0.0;
        this.radius=radius;
    }

    @Override
    public Double lengtHable() {
        if (radius < 0){
            throw new IllegalArgumentException("Отрицательное число");
        }
        return 2*pi*radius;
    }
    @Override
    public Double getArea(){
        if (radius <0 ){
            throw new IllegalArgumentException("Отрицательное число");
        }
        area = pi*radius*radius;
        setArea(area);
        return area;
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                '}'+super.toString();
    }
}
