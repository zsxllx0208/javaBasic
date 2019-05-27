package com.neuedu.test;

public class Car {
    int price,speed;
    String mark;
    public void drive(){
        System.out.println(mark+"正在驾驶");
    }
    public void speedChange(int newspeed){

        speed=newspeed;
        System.out.println("当前速度为"+speed);

    }



}
