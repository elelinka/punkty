package com.example.main;

import com.example.point.Point;
import com.example.section.Section;
import com.example.triangle.Triangle;

public class Main {

    public static void main(String[] args) {

        Point pointA = new Point(1, 0);
        boolean isFirst = pointA.isFirstQuarter();
        System.out.println("czy jest w pierwszej cwiartce? " + isFirst);
        boolean isSecond = pointA.isSecondQuarter();
        System.out.println("czy jest w drugiej cwiartce? " + isSecond);
        boolean isThird = pointA.isThirdQuarter();
        System.out.println("czy jest w trzeciej cwiartce? " + isThird);
        boolean isFourth = pointA.isFourthQuarter();
        System.out.println("czy jest w czwartej cwiartce? " + isFourth);
        boolean isMiddle = pointA.isInTheMiddle();
        System.out.println("czy lezy na srodku osi? " + isMiddle);
        boolean isOnX = pointA.isOnXaxis();
        System.out.println("czy lezy na osi x? " + isOnX);
        boolean isOnY = pointA.isOnYaxis();
        System.out.println("czy lezy na osi y? " + isOnY);

        System.out.println();

        Point pointB = new Point(5, 1);
        Section sectionAB = new Section();
        double sectionABlenght = sectionAB.sectionLenght(pointA, pointB);
        System.out.println("dlugosc odcinka AB: " + sectionABlenght);

        Point pointC = new Point(-3, 2);
        Section sectionAC = new Section();
        double sectionAClenght = sectionAC.sectionLenght(pointA, pointC);
        System.out.println("dlugosc odcinka AC: " + sectionAClenght);

        Section sectionBC = new Section();
        double sectionBClenght = sectionBC.sectionLenght(pointB, pointC);
        System.out.println("dlugosc odcinka BC: " + sectionBClenght);

        System.out.println();

        Triangle triangle = new Triangle();
        boolean isTriangle = triangle.isTriangle(sectionABlenght, sectionAClenght, sectionBClenght);
        System.out.println("czy z punktow mozna utworzyc trojkat? " + isTriangle);

    }
}
