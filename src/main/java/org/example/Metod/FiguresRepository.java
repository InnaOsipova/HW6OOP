package org.example.Metod;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

public class FiguresRepository implements IRepository{
    protected final List<Object> figureList;

    public FiguresRepository() {

        this.figureList = new ArrayList<>();
    }


    @Override
    public void add(Object value) {
        figureList.add((Object) value);
    }

    public List<Object> getFigureList() {
        return figureList;
    }

    public Double allPerimetrs() {
        Double allper = 0.0;
        for (Object figure : figureList) {
            if (figure instanceof Poligon) {
                allper = allper + ((Poligon) figure).perimetr();
            }
        }
        return allper;
    }

    public Double allArea (){
        double allAr = 0.0;
        for (Object figure : figureList) {
            allAr += ((Figure)figure).getArea();
            }
        return allAr;
    }
}
