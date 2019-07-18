package com.example.triangle;

public class Triangle {

    public boolean isTriangle(double a, double b, double c) {
        if (a < b + c && c < a + b && b < a + c) {
            return true;
        } else {
            return false;
        }
    }
}
