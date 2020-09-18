package com.basic;

import java.util.*;

public class ArrayRotation {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];
        List<Integer> aList = new ArrayList<>();

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            aList.add(aItem);
        }

        scanner.close();



        for(int k=0;k<n;k++) {
            Collections.rotate(aList, d);

            System.out.print(aList.get(k));
        }
    }
}

