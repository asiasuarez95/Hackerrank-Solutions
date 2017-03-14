// We use the integers a, b, and n to create the following series:
// 	(a + 2^0 * b), (a + 2^0 * b +2^1 * b), ..., (a + 2^0 * b +2^1 * b + ... + 2^(n-1) *b)
// You are given  queries in the form of a, b, and n. For each query, print the series corresponding to the 
// given a, b, and n values as a single line of n space-separated integers.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner tst = new Scanner (System.in);
        int t= tst.nextInt();
        int num=0;
        while (num<t){
        int a= tst.nextInt();
        int b= tst.nextInt();
        int n= tst.nextInt();
        int result=a;
        for(int i=0; i<n; i++){
            result= result + (int)(Math.pow(2, i)*b);
            System.out.printf("%d ",result );
             
            }
         System.out.printf("\n");
            num++;
        }
    }
 }
