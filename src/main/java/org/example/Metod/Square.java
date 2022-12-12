package org.example.Metod;

public class Square extends Rectangle{

    private Double side;

    public Square( Double side) {

        super(side, side);
        this.side = side;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }


    public Double getArea() {
        return side*side;
    }

    @Override
    public Double perimetr() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}'+super.toString();
    }
}
