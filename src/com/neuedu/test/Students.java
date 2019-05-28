package com.neuedu.test;

public class Students {
    int No,sjb1,sjb2,sjb3;

    String sname;

    public Students(int No,String sname,int sjb1,int sjb2, int sjb3){
            this.No=No;
            this.sname=sname;
            this.sjb1=sjb1;
            this.sjb2=sjb2;
            this.sjb3=sjb3;
    }

    public int rev(){
        int c=(sjb1+sjb2+sjb3)/3;
        return c;
    }
    public String toString(){
        return "学号："+No+"姓名：" +
                "" +
                ""+sname;
    }
}
