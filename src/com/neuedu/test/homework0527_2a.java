package com.neuedu.test;

public class homework0527_2a {
    float radius;
    public void round() {
        if (radius > 0) {
            float a = (float) (radius * radius * 3.14);
            float b = (float) (2 * 3.14 * radius);

            System.out.println("圆的面积为" + a);
            System.out.println("圆的周长为" + b);
        }else {
            System.out.println("输入半径数据有误");
        }
    }

}
