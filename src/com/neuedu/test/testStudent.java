package com.neuedu.test;

public class testStudent {
    public static void main(String[] args) {

        Student a1=new Student(18,"张三",80);
        Student a2=new Student(18,"张四",85);
        Student a3=new Student(18,"张五",72);
        Student a4=new Student(18,"张六",68);
        Student a5=new Student(18,"张二",98);

        Student[] stu=new Student[5];
        stu[0]=a1;
        stu[1]=a2;
        stu[2]=a3;
        stu[3]=a4;
        stu[4]=a5;
        Student.paixu(stu);
//        System.out.println(stu[0].getScore());
//        Student b=new Student();





    }
}
