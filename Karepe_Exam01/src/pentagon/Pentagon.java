/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pentagon;

/**
 *
 * @author Nithya Karepe
 */
public class Pentagon {

    private double side;
    private double area;
    private double radius;

    /**
     *
     * @param radius
     */
    public Pentagon(double radius) {
        this.radius = radius;
    }

    /**
     *
     * @return
     */
    public double getSide() {
        return side;
    }

    /**
     *
     * @param side
     */
    public void setSide(double side) {
        this.side = side;
    }

    /**
     *
     * @return
     */
    public double getArea() {
        return area;
    }

    /**
     *
     * @param area
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     *
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     *
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     *
     * @param side
     * @return side
     */
    public double getSideOf(double side) {
        side = (2 * getRadius()) * Math.sin(Math.PI / 5);
        return side;
    }

    /**
     *
     * @param area
     * @return side
     */
    public double getAreaOf(double area) {
        area = (5 * Math.pow(getSideOf(side), 2)) / (4 * Math.tan(Math.PI / 5));
        return area;
    }

    @Override
    public String toString() {
        double d = Math.round(getAreaOf(area) * 100.00) / 100.00;
        String s1 = Double.toString(d);
        return s1;
    }
}
