import java.io.*;
public class StringDemo {
    static int mystr(String str){

        char arr[] = str.toCharArray();
        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);
        }
        return 0;
    }
    
    public static void main(String[]args)throws IOException{
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter two Strings");
        String str1 = br.readLine();
        String str2 = br.readLine();
        int x = mystr(str1);
        int y = mystr(str2);
        System.out.println(x);
        System.out.println(y);

    }
}

