package com.company;

public class Main{
    public static void main (String[] args) {
        System.out.println("Сумма чисел которые делятся на 3, 4 и 5 без остатка равна: "+method());
    }
    static int method () {
        int sum=0;
        for (int i=1; i<=300; i++){
            if (i%3==0 && i%4==0 && i%5==0) {
                sum=sum+i;
            }
        }
        return sum;
    }
}
