package org.example.Metod;

public abstract class Figure {
    private Double area;

    public Figure(Double area) {
        this.area = area;
    }

    protected Figure() {
    }

    //public Double getArea() {
       // return area;
    //}

    //public void setArea(Double area) {
    //    this.area = area;
   // }


    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "area=" + area +
                '}';
    }
}
