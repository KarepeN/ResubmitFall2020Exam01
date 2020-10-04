/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fan;

/**
 *
 * @author Nithya Karepe
 */
public class Fan {

    private static final int slow = 1;
    private static final int medium = 2;
    private static final int fast = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    /**
     *
     * @return speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     *
     * @param speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     *
     * @return 
     * @returns a boolean value
     */
    public boolean isOn() {
        return on;
    }

    /**
     *
     * @param on
     */
    public void setOn(boolean on) {
        this.on = on;
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
     * @return color
     */
    public String getColor() {
        return color;
    }
    /**
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * A constructor with no parameters
     */
    public Fan() {
    }
    @Override
    public String toString() {
        if (isOn()) {
           
             return "Fan is On " + "speed " +getSpeed() + ", radius " +getRadius() + ", color " + getColor();
        }
        return "Fan is Off" + ", radius " +getRadius() + ", color " + getColor();
    }

}
