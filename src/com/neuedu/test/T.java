package com.neuedu.test;

public class T {
    public static void main(String[] args) {
//       float b=3.12456784561894f;
//       double a=4.45646581231684684135456;
//       b=(float)a;
//        System.out.println(b);
//        int a = 97;
//        if (a >= 90) {
//            System.out.println("优秀");
//        } else if (a >= 70) {
//            System.out.println("良");
//        } else {
//            System.out.println("合格");
//        }
       /* int a=1,b=2;
        do {
            b+=a;
            a++;
            System.out.println(b);
        }while (a<=5);
        System.out.println("结果为"+b);*/
        int sum = 0;
        for (int i = 1;i <= 200;i++){
            if(i % 3 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }

}