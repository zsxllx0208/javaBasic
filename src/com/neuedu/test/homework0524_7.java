package com.neuedu.test;

import java.util.Scanner;

public class homework0524_7 {
    public static void main(String[] args) {
        System.out.println("请输入年份");
        Scanner input =new Scanner(System.in);
        int a=input.nextInt();
        int b=a%4;
        switch (b){
            case 0:
                System.out.println("闰年");
                break;
            case 1:
                System.out.println("平年");
                break;
            case 2:
                System.out.println("平年");
                break;
            case 3:
                System.out.println("平年");
                break;
         }







}
}
