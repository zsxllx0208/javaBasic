package com.neuedu.test;

public class Notebook {

    char color;

    int cpu;

    public Notebook(){}

    public Notebook(char color,int cpu){
        this.color=color;
        this.cpu=cpu;
    }
    public String toString(){
        return "笔记本颜色："+color+"；cpu型号"+cpu;
    }



}
