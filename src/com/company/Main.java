package com.company;

public class Main {

    public static void main(String[] args) {

        int [] primeNums = new int[50];
        Primes primeClass = new Primes();
        int below = 20;
        int sum = 0;

        primeNums = primeClass.PrimesBelow(below);

        for (int i : primeNums) {

            if (i==0)
                break;

                sum=sum+i;
                System.out.println(sum);


        }

    }
}
