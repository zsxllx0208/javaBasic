package com.neuedu.test;

import java.util.Scanner;

public class homework0524_8 {
    public static void main(String[] args) {
        System.out.println("输入一个字母");
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        char a=s.charAt(0);
        int b=a;
        if (b>=97&&b<=122){
            b-=32;
            a=(char)b;
            System.out.println(a);
        }
        else{
            System.out.println(a);
        }
















    }
}
