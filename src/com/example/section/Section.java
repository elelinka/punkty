package com.example.section;

import com.example.point.Point;

public class Section {

    Point pointA;
    Point pointB;

    public Section(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public double sectionLenght() {
        double x = pointB.getPositionX() - pointA.getPositionX();
        double y = pointB.getPositionY() - pointA.getPositionY();

        return Math.abs(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }

}
