package com.neuedu.test;

public class Staff {
    String name;
    char sex;
    int birth;
    String type;
    int wages;
    public Staff(String name,char sex,int birth,String type){
        this.name=name;
        this.sex=sex;
        this.birth=birth;
        this.type=type;
    }
    public Staff(){}

    public void computeSalay(){
        switch (type) {
            case "Worker":
                wages = 100 * 30;
                break;
            case "Salesman":
                wages = 1000 + 3568;
                break;
            case "Manager":
                wages = 5000;
                break;
            case "Floater":
                wages = 15 * 8 * 30;
                break;
        }

        }
        public String toString(){
            return "姓名："+name+"；性别："+sex+"；出生日期："+birth+"；员工类型："+type+"；工资："+wages;
        }

    }











