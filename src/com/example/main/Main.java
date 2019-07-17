package com.example.main;

import com.example.point.Point;
import com.example.section.Section;

public class Main {

    public static void main(String[] args) {
        Point pointA = new Point(8, 6);
        Point pointB = new Point(-1, 6);
        Point pointC = new Point(2, 6);
        Section section1 = new Section(pointA, pointB);
        Section section2 = new Section(pointA, pointB, pointC);

        double sectionAB = section2.sectionLenghtAB();
        System.out.println("odcinek AB: " + sectionAB);
        double sectionAC = section2.sectionLenghtAC();
        System.out.println("odcinek AC: " + sectionAC);
        double sectionBC = section2.sectionLenghtBC();
        System.out.println("odcinek BC: " + sectionBC);

        boolean isTriangle1 = section2.isSharpTriangle(sectionAB, sectionAC, sectionBC);
        System.out.println("czy jest to trojkat ostrokatny? " + isTriangle1);

        boolean isTriangle2 = section2.isObtuseAngledTriangle(sectionAB, sectionAC, sectionBC);
        System.out.println("czy jest to trojkat rozwartokatny? " + isTriangle2);

        boolean isTriangle3 = section2.isRectangularTriangle(sectionAB, sectionAC, sectionBC);
        System.out.println("czy jest to trojkat prostokatny? " + isTriangle3);

//        System.out.println(point.isFirstQuarter());
//        System.out.println(point.isSecondQuarter());
//        System.out.println(point.isThirdQuarter());
//        System.out.println(point.isFourthQuarter());
    }
}
