/*
 
Program 10:

WAP to print the elements whose addition of digits is even.
Ex. 26 = 2 + 6 = 8 (8 is even so print 26)
Input :
Enter array : 1 2 3 5 15 16 14 28 17 29 123
Output: 2 15 28 17 123

 */

import java.io.*;

class Main{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter The Size Of Array");

                int n=Integer.parseInt(br.readLine());

                int arr[]=new int[n];

                System.out.println("Enter The Elements In Array");


                for(int i=0;i<n;i++){

                        arr[i]=Integer.parseInt(br.readLine());

                }

		System.out.println("Print The Element That Addition Is Even")

		int rem;
		int sum;

		for(int i=0;i<arr.length;i++){

			int temp=arr[i];
			sum=0;

			while(arr[i]!=0){

				rem=arr[i]%10;

				sum=sum+rem;

				arr[i]=arr[i]/10;

			}

			if(sum%2==0){

				System.out.println(temp);
			
			
			}
		
		}
	}
}
