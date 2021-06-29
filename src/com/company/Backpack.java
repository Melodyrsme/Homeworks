package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Backpack {
    private List<AbstractFlat> flatArrayList = new ArrayList<>();
    private List<AbstractCylindrical> cylindricalArrayList = new ArrayList<>();
    private List<AbstractCircle> circleArrayList = new ArrayList<>();


    public Backpack() {
    }

    public Backpack(ArrayList<AbstractFlat> flatArrayList,
                    ArrayList<AbstractCylindrical> cylindricalArrayList,
                    ArrayList<AbstractCircle> circleArrayList) {
        this.flatArrayList = flatArrayList;
        this.cylindricalArrayList = cylindricalArrayList;
        this.circleArrayList = circleArrayList;
    }

    @Override
    public String toString() {
        return "Рюкзак:" +
                "\nЧто-то плоское: " + flatArrayList +
                "\nЧто-то цилиндрическое: " + cylindricalArrayList +
                "\nЧто-то круглое: " + circleArrayList + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Backpack backpack = (Backpack) o;
        return Objects.equals(flatArrayList, backpack.flatArrayList) && Objects.equals(cylindricalArrayList, backpack.cylindricalArrayList) && Objects.equals(circleArrayList, backpack.circleArrayList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flatArrayList, cylindricalArrayList, circleArrayList);
    }

    public boolean checkCircle() {
        int k = 0;
        for (int i = 0; i < circleArrayList.size() - 1; i++){
            if (circleArrayList.get(i).equals(circleArrayList.get(i + 1))){
                k++;
            }
        }
        if (k == circleArrayList.size() - 1)
            return true;
        else
            return false;
    }

    public void addSmtFlat(AbstractFlat flat) {
        flatArrayList.add(flat);
    }

    public void addSmtCylindrical(AbstractCylindrical cylindrical) {
        cylindricalArrayList.add(cylindrical);
    }

    public void addSmtCircle(AbstractCircle circle) {
        circleArrayList.add(circle);
    }

    public List<AbstractFlat> getFlatArrayList() {
        return flatArrayList;
    }

    public void setFlatArrayList(ArrayList<AbstractFlat> flatArrayList) {
        this.flatArrayList = flatArrayList;
    }

    public List<AbstractCylindrical> getCylindricalArrayList() {
        return cylindricalArrayList;
    }

    public void setCylindricalArrayList(ArrayList<AbstractCylindrical> cylindricalArrayList) {
        this.cylindricalArrayList = cylindricalArrayList;
    }

    public List<AbstractCircle> getCircleArrayList() {
        return circleArrayList;
    }

    public void setCircleArrayList(ArrayList<AbstractCircle> circleArrayList) {
        this.circleArrayList = circleArrayList;
    }
}
