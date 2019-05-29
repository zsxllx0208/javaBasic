package com.neuedu.test1;

public class Square extends Graphical {

    public void area(){
        double area;
        area=Math.pow(2*getRadius(),2);
        System.out.println("该正方形的面积为："+area);

    }
    public void zhouchang(){
        double zhouchang;
        zhouchang=getRadius()*8;
        System.out.println("该正方形的周长为："+zhouchang);


    }
    public Square(float radius){
        super(radius);
    }

}
