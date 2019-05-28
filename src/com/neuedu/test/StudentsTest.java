package com.neuedu.test;

public class StudentsTest {
    public static void main(String[] args) {
        Students [] stu=new Students[5];
        Students stu1=new Students(01,"小明",60,80,75);
        Students stu2=new Students(02,"小刚",66,77,80);
        Students stu3=new Students(03,"小红",80,75,66);
        Students stu4=new Students(04,"小青",62,79,83);
        Students stu5=new Students(05,"小志",36,78,92);
        stu[0]=stu1;
        stu[1]=stu2;
        stu[2]=stu3;
        stu[3]=stu4;
        stu[4]=stu5;
        for(int i=0;i<stu.length;i++)  {
            System.out.println("学生信息："+stu[i]);
            System.out.println("平均成绩："+stu[i].rev());




        }








    }
}
