package org.example.Metod;

public class Rectangle extends Poligon{
    private Double first;
    private Double second;
    double area;

    public Rectangle( Double first, Double second) {
        super(new Double[]{first, second});
        this.first = first;
        this.second = second;
        area = 0.0;
    }

    public Double getFirst() {
        System.out.printf(first.toString());
        return first;
    }

    public void setFirst(Double first) {
        this.first = first;
    }

    public Double getSecond() {
        return second;
    }

    public void setSecond(Double second) {
        this.second = second;
    }


    public Double getArea() {
        if (first < 0 && second < 0) {
           throw new IllegalArgumentException("Отрицательное число");
       }
       area = first*second;
       return area;
    }

    @Override
    public Double perimetr() {
        if (first < 0 && second <0){
            throw new IllegalArgumentException("Отрицательное число");
        }
        return (first + second)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "first=" + first +
                ", second=" + second +
                '}'+super.toString();
    }
}

