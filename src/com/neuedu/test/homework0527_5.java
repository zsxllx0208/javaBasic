package com.neuedu.test;

import java.util.Scanner;

public class homework0527_5 {
    public static void main(String[] args) {
        homework0527_5a []a=new homework0527_5a[]{};
//        homework0527_5a []a=new homework0527_5a();
//        homework0527_5a []a=new homework0527_5a();
//        homework0527_5a []a=new homework0527_5a();
//        homework0527_5a []a=new homework0527_5a();
        a[0].name="张三";
        a[1].name="李四";
        a[2].name="王五";
        a[3].name="小六";
        a[4].name="小明";
        System.out.println("张三的成绩：");
        Scanner input1=new Scanner(System.in);
        a[0].score=input1.nextInt();
        System.out.println("李四的成绩：");
        Scanner input2=new Scanner(System.in);
        a[1].score=input1.nextInt();
        System.out.println("王五的成绩：");
        Scanner input3=new Scanner(System.in);
        a[2].score=input1.nextInt();
        System.out.println("小六的成绩：");
        Scanner input4=new Scanner(System.in);
        a[3].score=input1.nextInt();
        System.out.println("小明的成绩：");
        Scanner input5=new Scanner(System.in);
        a[4].score=input1.nextInt();
        int[]c={a[0].score,a[1].score,a[2].score,a[3].score,a[4].score};
        String[]b={a[0].name,a[1].name,a[2].name,a[3].name,a[4].name};
       






    }
}
