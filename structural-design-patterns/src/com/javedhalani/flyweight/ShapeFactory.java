package com.javedhalani.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ShapeFactory {

    private static final Map<ShapeType, Shape> shapes = new HashMap<>();

    public static Shape getShape(ShapeType type) {
        Shape shape = shapes.get(type);

        if (Objects.isNull(shape)) {
            if (type.equals(ShapeType.OVAL_FILL)) {
                shape = new Oval(true);
            } else if (type.equals(ShapeType.OVAL_NOFILL)) {
                shape = new Oval(false);
            } else if (type.equals(ShapeType.LINE)) {
                shape = new Line();
            }
            shapes.put(type, shape);
        }

        return shape;
    }

    public static enum ShapeType {
        OVAL_FILL, OVAL_NOFILL, LINE;
    }
}
