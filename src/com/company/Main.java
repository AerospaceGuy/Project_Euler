package com.company;

public class Main {

    public static void main(String[] args) {

        int [] primeNums = new int[10000];
        Primes primeClass = new Primes();
        int below = 20000;
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
