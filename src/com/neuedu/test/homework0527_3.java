package com.neuedu.test;

import java.util.Scanner;

public class homework0527_3 {
    public static void main(String[] args) {
        homework0527_3a jieguo=new homework0527_3a();

        Scanner input=new Scanner(System.in);
        jieguo.a=input.nextDouble();

        Scanner input2=new Scanner(System.in);
        jieguo.d=input2.next().charAt(0);

        Scanner input1=new Scanner(System.in);
        jieguo.b=input1.nextDouble();

        jieguo.c=jieguo.jieguo();

        System.out.println("运算结果为"+jieguo.c);








    }



}
