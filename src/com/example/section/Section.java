package com.example.section;

import com.example.point.Point;

public class Section {
    Point pointA;
    Point pointB;
    Point pointC;

    public Section(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public Section(Point pointA, Point pointB, Point pointC) {
        this(pointA, pointB);
        this.pointC = pointC;
    }

    public double sectionLenghtAB() {
        double x = pointA.getPositionX() - pointB.getPositionX();
        double y = pointA.getPositionY() - pointB.getPositionY();

        return Math.abs(Math.sqrt(Math.pow(x, x)) + Math.pow(y, y));
    }

    public double sectionLenghtAC() {
        double x = pointA.getPositionX() - pointC.getPositionX();
        double y = pointA.getPositionY() - pointC.getPositionY();

        return Math.abs(Math.sqrt(Math.pow(x, x)) + Math.pow(y, y));
    }

    public double sectionLenghtBC() {
        double x = pointC.getPositionX() - pointB.getPositionX();
        double y = pointC.getPositionY() - pointB.getPositionY();

        return Math.abs(Math.sqrt(Math.pow(x, x)) + Math.pow(y, y));
    }

    public boolean isSharpTriangle(double a, double b, double c) {
        //trojkat ostrokatny
//        if ((a < b + c) && (b < a + c) && (c < a + b)) {
//            return true;
//        } else {
//            return false;
//        }
        return (Math.pow(a, a) < Math.pow(b, b) + Math.pow(c, c))
                || (Math.pow(b, b) < Math.pow(a, a) + Math.pow(c, c))
                || (Math.pow(c, c) < Math.pow(a, a) + Math.pow(b, b));
    }

    public boolean isObtuseAngledTriangle(double a, double b, double c) {
        //trojkat rozwartokatny
//        if ((a > b + c) && (b > a + c) && (c > a + b)) {
//            return true;
//        } else {
//            return false;
//        }
        return (a > b + c) || (b > a + c) || (c > a + b);
    }

    public boolean isRectangularTriangle(double a, double b, double c) {
        //trojkat prostokatny
        if (Math.pow(a, a) == Math.pow(b, b) + Math.pow(c, c)) {
            return true;
        } else if (Math.pow(b, b) == Math.pow(a, a) + Math.pow(c, c)) {
            return true;
        } else if (Math.pow(c, c) == Math.pow(a, a) + Math.pow(b, b)) {
            return true;
        } else {
            return false;
        }

    }
}
