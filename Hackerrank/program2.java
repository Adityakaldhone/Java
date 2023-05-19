/* If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

Sample input 1

1
3
Sample output 1

3
Sample input 2

-1
2
Sample output 2

java.lang.Exception: Breadth and height must be positive  */



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      
    	    Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 1;
        if(a>=1 && b>=1){
             c = a*b;
             System.out.println(c);
        }
        else{
          System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }
}
