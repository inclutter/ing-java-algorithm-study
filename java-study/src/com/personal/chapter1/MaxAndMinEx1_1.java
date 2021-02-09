package com.personal.chapter1;
import java.util.Scanner;

public class MaxAndMinEx1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        System.out.print("a의 값 : "); a=sc.nextInt();
        System.out.print("b의 값 : "); b=sc.nextInt();
        System.out.print("c의 값 : "); c=sc.nextInt();
        System.out.print("d의 값 : "); d=sc.nextInt();
        System.out.println("최대값 : " + maxVal(a,b,c,d));

    }

    static int maxVal(int a, int b, int c, int d) {
        int val=a;
        if(b > val) val=b;
        if(c > val) val=c;
        if(d > val) val=d;
        return val;
    }

}
