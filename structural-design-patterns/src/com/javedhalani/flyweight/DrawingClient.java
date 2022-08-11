package com.javedhalani.flyweight;


import javax.swing.*;

import com.javedhalani.flyweight.ShapeFactory.ShapeType;

import java.awt.*;

public class DrawingClient extends JFrame {

    private final int WIDTH;
    private final int HEIGHT;

    private static final ShapeType shapes[] = {ShapeType.LINE, ShapeType.OVAL_FILL, ShapeType.OVAL_NOFILL};
    private static final Color colors[] = {Color.RED, Color.GREEN, Color.YELLOW};

    public DrawingClient(int width, int height) {
        this.WIDTH = width;
        this.HEIGHT = height;

        Container contentPane = getContentPane();

        JButton startButton = new JButton("Draw");
        final JPanel panel = new JPanel();

        contentPane.add(panel,BorderLayout.CENTER);
        contentPane.add(startButton, BorderLayout.SOUTH);
        setSize(this.WIDTH, this.HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        startButton.addActionListener( (event) -> {
            Graphics g = panel.getGraphics();
            for (int i = 0; i < 20; ++i) {
                Shape shape = ShapeFactory.getShape(getRandomShape());
                shape.draw(g, getRandomX(), getRandomY(), getRandomX(), getRandomY(), getRandomColor());
            }
        });

    }

    private ShapeType getRandomShape() {
        return ShapeType.values()[(int) (Math.random() * ShapeType.values().length)];
    }

    private Color getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private int getRandomY() {
        return (int) (Math.random() * HEIGHT);
    }

    private int getRandomX() {
        return (int) (Math.random() * WIDTH);
    }
}
