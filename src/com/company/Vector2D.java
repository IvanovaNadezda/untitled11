package com.company;

public class Vector2D {
    static int count;
    public double vX;
    public double vY;

    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
        count++;
    }

    public Vector2D() {
        vX = 1;
        vY = 1;
        count++;
    }

    public Vector2D(Vector2D v) {
        vX = v.vX;
        vY = v.vY;
        count++;
    }

    public double length() {
        return Math.sqrt((vX) * vX + vY * vY);
    }

    public void add(Vector2D v) {
        vX += v.vX;
        vY += v.vY;
    }

    public void sub(Vector2D v) {
        vX -= v.vX;
        vY -= v.vY;
    }

    public void scale(double scaleFactor) {
        vX *= scaleFactor;
        vY *= scaleFactor;
    }

    public void normalized() {
        vX = 1;
        vY = 0;
    }

    public double dotProduct(Vector2D v) {
        return (vX * v.vX + vY * v.vY);
    }

    public double getvX() {
        return vX;
    }

    public void setvX(double vX) {
        this.vX = vX;
    }

    public double getvY() {
        return vY;
    }

    public void setvY(double vY) {
        this.vY = vY;
    }


    public void print(){
        System.out.print("(");
        System.out.print(String.format("%.2f",vX));
        System.out.print(", ");
        System.out.print(String.format("%.2f",vY));
        System.out.print(")");
        System.out.println();
    }
}