package com.example.section;

import com.example.point.Point;

public class Section {

    public double sectionLenght(Point pointA, Point pointB) {
        double x = pointB.getPositionX() - pointA.getPositionX();
        double y = pointB.getPositionY() - pointA.getPositionY();

        return Math.abs(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }

}
