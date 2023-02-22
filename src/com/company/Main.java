package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        for(int i=0;i<10;i++) {
            System.out.println("ENTER AN INTEGER");
            Scanner ss = new Scanner(System.in);
            int num = ss.nextInt();

            if (num % 2 == 0) {
                System.out.println("IT IS AN EVEN NUMBER");
                System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
            } else if (num % 2 == 1) {
                System.out.println("IT IS AN ODD NUMBER");
                System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
            }
        }
    }
}
