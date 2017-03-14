// In this challenge, you must read an integer, a double, and a String from stdin, 
// then print the values according to the instructions in the Output Format section below. 


import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            
            int x=sc.nextInt();
            double y=sc.nextDouble();
            String t=sc.nextLine();
            String s=sc.nextLine();
             
            System.out.println("String: "+s);
            System.out.println("Double: "+y);
            System.out.println("Int: "+x);
    }
}