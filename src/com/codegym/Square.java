package com.codegym;

public class Square extends Shape implements Colorable {
    private double site = 4.0;

    public Square(){
    };

    public Square(double site){
        this.site = site;
    };

    public Square(String color, boolean filled,double site){
        super(color, filled);
        this.site = site;
    };

    public double getSite() {
        return site;
    }

    public void setSite(double site) {
        this.site = site;
    }

    public double getArea(){
        return this.site * this.site;
    }

    public double getPerimeter() {
        return 4 * this.site;
    }

    @Override
    public void howToColor() {
        System.out.println(getColor() + " all four sides");
    }

    @Override
    public String toString() {
        return "A Rectangle with side="
                + getSite()
                + ", which is a subclass of "
                + super.toString();
    }
}
