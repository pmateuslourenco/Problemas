package com.exe;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final float n = 3.14159f;
        float r = input.nextFloat();
        float area = (float) (n * Math.pow(r, 2));
        System.out.println("A=" + area);
    }
}
