package com.example.point;

public class Point {

    private double positionX;
    private double positionY;

    public Point(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public double getPositionX() {
        return positionX;
    }

    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    public void setPositionY(double positionY) {
        this.positionY = positionY;
    }

    public boolean isFirstQuarter() {
        return positionX < 0 && positionY > 0;
    }

    public boolean isSecondQuarter() {
        return positionX > 0 && positionY > 0;
    }

    public boolean isThirdQuarter() {
        return positionX > 0 && positionY < 0;
    }

    public boolean isFourthQuarter() {
        return positionX < 0 && positionY < 0;
    }

    public boolean isOnXaxis() {
        return positionY == 0;
    }
    public boolean isOnYaxis() {
        return positionX == 0;
    }

    public boolean isInTheMiddle() {
        return positionX == 0 && positionY == 0;
    }
}
