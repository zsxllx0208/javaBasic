package com.neuedu.test;

public class Student {

    private int age,score;
    private String sname;

    public Student(){}



    public Student(int age1,String sname1,int score1){
        age=age1;
        sname=sname1;
        score=score1;
    }

    public int getScore(){
        return score;

    }





     public String toString(){
         return "姓名："+sname+"；年龄："+age+"；成绩："+score;
     }

    public static void paixu(Student[] a) {

        Student turn;

        for (int i = 0; i < a.length -1; i++) {

            for (int j = 0; j < a.length -1-i; j++) {

                if (a[j].getScore() < a[j+1].getScore()) {
                    turn = a[j];
                    a[j] = a[j+1];
                    a[j+1] = turn;
//                    turn1=b[j];
//                    b[j]=b[j+1];
//                    b[j+1]=turn1;
                }
            }


        }

        for (int n=0;n<=a.length-1;n++){
            System.out.println(a[n]);
        }


    }
}
