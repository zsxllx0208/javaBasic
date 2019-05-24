package com.neuedu.test;

public class homework0524_3 {
    public static void main(String[] args){
        int a=1,b=1,c=1,i=0,d;
        System.out.println("符合条件的数有");
        for(a=1;a<=4;a++){
            for (b=1;b<=4;b++){
                for(c=1;c<=4;c++){
                    if (a!=b&a!=c&b!=c){
                        d=100*a+10*b+c;
                        i++;
                        System.out.println(d);
                    }

                }
            }
        }
        System.out.println("这种数的个数为"+i);






    }



}
