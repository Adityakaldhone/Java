/*


Program 4:

Program 4
WAP to find a prime number from an array and return its index.
Take size and elements from the user
Input: 10 25 36 566 34 53 50 100
Output: prime no 53 found at index: 5

*/


import java.io.*;
class Array03{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter The Size Of Array");

                int size=Integer.parseInt(br.readLine());

                int arr[]=new int[size];

                System.out.println("Take The Elements From User");

                for(int i=0;i<arr.length;i++){

                        arr[i]=Integer.parseInt(br.readLine());
                }

                System.out.println("Print The Prime Number From Array");



                for(int i=0;i<arr.length;i++){

                        int temp=arr[i];
                        int count=0;

                        for(int j=1;j<=temp;j++){

                                if(temp%j==0){

                                        count++;

                                }

                        }

                        if(count==2){

                                         System.out.println("prime no "+ temp +" found at index: "+i );
                        }
                }
        }
}
