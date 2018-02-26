/*
Problem Buying a House: http://codeforces.com/problemset/problem/796/A

*/

import java.util.Scanner;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int crushPos = m-1;
        int minRange = n-1;

        //System.out.println("number of houses:" + n);
        //System.out.println("house of crush:" + m);
        //System.out.println("Zane's Money:" + k);

        int [] houseList = new int[n];

        for(int i = 0; i < n; i++){
            int price = sc.nextInt();
            houseList[i] = price;
            if(price > 0 && price <= k){
                if(Math.abs(crushPos - i)<minRange)
                    minRange = Math.abs(crushPos - i);
               //System.out.println(i);
            }
        }

        System.out.println(minRange*10);

        /*
        for(int i = 0; i<n; i++){
            System.out.print(houseList[i]+" ");
        }
        */



    }


}
