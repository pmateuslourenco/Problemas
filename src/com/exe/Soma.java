package com.exe;

import java.util.Scanner;

public class Soma {

    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int A;
        int B;

        A = teclado.nextInt();
        B = teclado.nextInt();
        int X = A + B;
        System.out.println("X = " + X);

    }
}
