package com.neuedu.test;

public class homework0527_5a
{
    String name;
    int age,score;

    public void paixu(int[]a,String[]b){
        int turn;
        String turn1;
        for(int i =0;i<a.length-1;i++){

            for (int j=0;j<a.length-1-i;i++){

                if(a[j]<a[j+1]){
                  turn=a[j];
                  a[j]=a[j+1];
                  a[j+1]=turn;
                  turn1=b[j];
                  b[j]=b[j+1];
                  b[j+1]=turn1;
                }
            }

        }
        System.out.println(b);
        System.out.println(a);





    }


}
