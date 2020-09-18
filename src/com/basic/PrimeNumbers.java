package com.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {
        public static void main(String args[]) {
//            Scanner sc = new Scanner(System.in);
            int A = 100000;

            List<Integer> primes = new ArrayList<Integer>();

            for(int i=2; i<=A; i++)
            {
                int c=0;
                for(int j=1;j<=i;j++)
                {
                    if(i%j == 0)
                    {
                        c++;
                    }
                }
                if(c==2)
                {
                    primes.add(i);
                }
            }
            int k = primes.size();


            for(int a=0; a<k;a++)
                System.out.print(primes.get(a)+" ");
        }
    }

