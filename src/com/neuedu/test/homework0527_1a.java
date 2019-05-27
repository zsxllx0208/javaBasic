package com.neuedu.test;

public class homework0527_1a {
  int width;
  int height;

  public void mianji(){
     int c=width*height;
     int d=2*(width+height);
      System.out.println("长方形面积是"+c);
      System.out.println("长方形周长是"+d);
  }

  public void jisuan(int width,int height){
      int c=width*height;
      int d=2*(width+height);
      System.out.println("长方形面积是"+c);
      System.out.println("长方形周长是"+d);
  }

  public void canshu1(int width){
      int c=width*height;
      int d=(width+height)*2;
      System.out.println("长方形面积是"+c);
      System.out.println("长方形周长是"+d);

  }

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