/*
 
Program 3:

Write a Java program to find the sum of even and odd numbers in an array.
Display the sum value.
Input: 11 12 13 14 15
Output
Odd numbers sum = 39
Even numbers sum = 26

 */





import java.io.*;
class Assignment2{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter The Size Of Array");

                int n=Integer.parseInt(br.readLine());

                int arr[]=new int[n];

                System.out.println("Enter The Elements In Array");

            

                for(int i=0;i<arr.length;i++){

                        arr[i]=Integer.parseInt(br.readLine());

                }

                int odd=0;
		int even=0;

                for(int i=0;i<arr.length;i++){

                        if(arr[i]%2==0){

                                odd=odd+arr[i];

                        }else{

				even=even+arr[i];
			
			}


                }

			System.out.println("print the sum of odd elements in array = " + odd);
                System.out.println("print the sum of even elements in array = " + even);
        }
} 

