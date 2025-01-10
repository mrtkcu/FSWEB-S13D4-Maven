package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public double distance(){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }

    public double distance(Point a){
        return Math.sqrt(Math.pow((a.x - x),2) + Math.pow((a.y - y),2));
    }

    public double distance(int a, int b){
        return Math.sqrt(Math.pow((x-a),2) + Math.pow((y-b),2));
    }




}
