package org.example.Metod;

import java.util.Arrays;

public class Poligon extends Figure implements Iperimeterable{

    protected Double [] sides ;

    public Poligon( Double[] sides) {
        this.sides = sides;

    }

    @Override
    public Double perimetr() {
        double perim = 0.0;
        for (Double side:sides) {
            if (side > 0) {
                perim += side;
            }else throw new IllegalArgumentException(" Отрицательное число ");
        }
        return perim;
    }
    //public Double getArea(){
        //return super.area;
   // }

    @Override
    public String toString() {
        return "Poligon{" +
                "sides=" + Arrays.toString(sides) +
                '}'+super.toString();
    }
}
