// The challenge here is to read n lines of input until you reach EOF, then number and print all  lines of content.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner inputs = new Scanner(System.in);
        int i=0;
        while(inputs.hasNext()){
            String line = inputs.nextLine();
            i+=1;
            System.out.println(i+" "+line);
        }
    }
}