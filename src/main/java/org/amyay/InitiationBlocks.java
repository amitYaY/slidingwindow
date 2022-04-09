package org.amyay;

public class InitiationBlocks {

    static int a = 10;
    static int n;
    int c;
    int b = 5;

    static {
        System.out.println("Static Block");
        a = 60;
    }

    {
        System.out.println("Instance Block");
        n = 20;
        b = 30;
    }

    public InitiationBlocks(int m) {
        System.out.println("Constructor");
//        a = 5;
//        b= 5;
        System.out.println(""+a+" "+b+" "+c+" "+n+" "+m);
    }

    public static void main(String[] args) {
        System.out.println("Main Block");
        //a = 4;
        InitiationBlocks initiationBlocks = new InitiationBlocks(n);
        //System.out.println("A: "+a+" B: "+testClass.b);
    }
}
