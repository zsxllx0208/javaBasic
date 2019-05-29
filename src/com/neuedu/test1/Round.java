package com.neuedu.test1;

public class Round extends Graphical {

    public void area() {
        double area;
        area=Math.PI*Math.pow(getRadius(),2);
        System.out.println("该圆形面积为"+area);
    }

    public void zhouchang(){
        double zhouchang;
        zhouchang=getRadius()*2*Math.PI;
        System.out.println("该圆形的周长为："+zhouchang);


    }
    public Round(float radius){
        super(radius);
    }
}
