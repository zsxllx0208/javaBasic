package com.neuedu.test;

import java.util.Scanner;

public class homework0524_6 {
    public static void main(String[] args) {
        System.out.println("请输入一个五位数");
        Scanner input =new Scanner(System.in);
        int a=input.nextInt();
        int b,c,d,e;
        b=a%10;
        c=(a/10)%10;
        d=(a/1000)%10;
        e=(a/10000)%10;
        if (b==e&&c==d){
            System.out.println("这个数是回文数");
        }
        else{
            System.out.println("这个数不是回文数");
        }















    }
}
