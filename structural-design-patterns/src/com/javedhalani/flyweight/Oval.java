package com.javedhalani.flyweight;

import java.awt.*;

public class Oval implements Shape {

    // Intrinsic property
    private boolean fill;

    public Oval(boolean fill) {
        this.fill = fill;
        System.out.println("Creating Oval with fill = " + fill);
        // Adding time delay
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void draw(Graphics circle, int x1, int y1, int x2, int y2, Color color) {
        circle.setColor(color);
        circle.drawOval(x1, y1, x2, y2);
        if (fill) {
            circle.fillOval(x1, y1, x2, y2);
        }
    }
}
