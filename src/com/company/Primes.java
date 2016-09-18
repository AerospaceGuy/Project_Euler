package com.company;

import javax.sound.midi.SysexMessage;

/**
 * Created by jason on 9/17/16.
 */
public class Primes {

    public int[] PrimesBelow(int belowNum){

        int [] primeArray = new int[50];
        int p = 1;
        primeArray[0] = 2;

        for (int i=1; i<belowNum; i++){

            if (i%2!=0) {
                for (int j=2; j<i; j++){
                    if (i%j==0)
                        break;
                    else if (i-j==1) {
                        primeArray[p] = i;
                        System.out.println(i);
                        p++;
                        break;
                    }

                }

            }

        }

        return primeArray;
    }


}
