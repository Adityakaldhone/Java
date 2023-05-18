import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        
        int count = A.length();
        int count1 = B.length();
        
        int cnt = count + count1;
        System.out.println(cnt);
        
        int comparisonResult = A.compareTo(B);
        if (comparisonResult <= 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
          String capitalizedWord1 = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedWord2 = B.substring(0, 1).toUpperCase() + B.substring(1);

        String result = capitalizedWord1 + " " + capitalizedWord2;
        System.out.println(result);
        
        
        
        
    }
}




