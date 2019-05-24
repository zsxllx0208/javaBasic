package com.neuedu.test;

public class homework0524_5 {
    public static void main(String[] args) {
        int a=1,b=0,c=0;
        for (a=1;a<=100;a++){
            if ((a%2)==0){
                b+=a;
            }
            else {
                c+=a;
            }
        }
        System.out.println("偶数和为"+b);
        System.out.println("奇数和为"+c);











    }
}
