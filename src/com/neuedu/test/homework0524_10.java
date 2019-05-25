package com.neuedu.test;

import java.util.Scanner;

public class homework0524_10 {
    public static void main(String[] args) {
        System.out.println("输入一个整数");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=0,c=0,d=a;
        for(;a>0;){
            b=a%10;
            c+=b;
            a/=10;
        }
        if (c%9==0){
            System.out.println("这个数的各位数之和能被9整除");
            if (d%9==0){
                System.out.println("这个数也能被9整除");
            }
            else{
                System.out.println("但这个数不能被9整除");
            }
        }
        else{
            System.out.println("这个数的各位数之和不能被9整除");
        }












    }
}
