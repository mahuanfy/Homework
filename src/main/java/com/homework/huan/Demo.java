package com.homework.huan;

public class Demo {

    public int addab(int a, int b){
        return a + b;

    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        int c = demo.addab(3,9);
        System.out.println(c);
    }
}
