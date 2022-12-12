package org.example.Metod;

public class Triangle extends Poligon{
    private Double first;
    private Double second;
    private Double third;

    public Triangle(Double first, Double second, Double third) {
        super(new Double[]{first,second,third});
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public Double getFirst() {
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

    public Double getThird() {
        return third;
    }

    public void setThird(Double third) {
        this.third = third;
    }


    public Double getArea() {
        if (first < 0 && second <0 && third <0){
            throw new IllegalArgumentException("Отрицательное число");
        }
        Double p = (first+second+third)/2;
        return Math.sqrt(p*(p-first)*(p-second)*(p-third));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}'+super.toString();
    }
}
