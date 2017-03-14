// Given an integer, n, perform the following conditional actions:

// If  is odd, print Weird
// If  is even and in the inclusive range of 2 to 5, print Not Weird
// If  is even and in the inclusive range of 6 to 20, print Weird
// If  is even and greater than 20, print Not Weird
// Complete the stub code provided in your editor to print whether or not n is weird.

    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class Solution {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();            
            String ans="";
            if(n%2==1){
              ans = "Weird";
            }
            else{
            
               if((n>1)&&(n<6)){
                   System.out.println("Not Weird");
               }
               else if((n>5)&&(n<21)){
                   System.out.println("Weird");
               }
                else{
                    System.out.println("Not Weird");
                }
                
            }
            System.out.println(ans);
            
        }
    }