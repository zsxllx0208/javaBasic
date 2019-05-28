package com.neuedu.test;

public class Point {

    int x,y;

    public Point(){}

    public Point(int x0 ,int y0){

        x=x0;

        y=y0;
    }
    public void movePoint(int dx,int dy){

        x+=dx;

        y+=dy;

        System.out.println("该点坐标为"+x+","+y);
    }





}
