package com.neuedu.test;

public class homework0523 {
    public static void main(String[] args) {
        int a=7089;
        int b=0;
        int c=0;
        for(b=0;a!=0;) {
            b = a%10;
            a = a  / 10;
            c=c*10+b;
        }
        System.out.println(c);



    }
}
