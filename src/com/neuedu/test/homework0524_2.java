package com.neuedu.test;

import java.util.Scanner;

public class homework0524_2 {
    public static void main(String[] args) {
        System.out.println("请输入学生成绩");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        if (a>=90){
            System.out.println("该学生成绩评级为A");
        }
        else if (a>=60){
            System.out.println("该学生成绩评级为B");
        }
            else{
            System.out.println("该学生成绩评级为C");
        }





    }
}
