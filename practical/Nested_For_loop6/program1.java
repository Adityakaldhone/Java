/*
 
Q1.
Write a program to print the numbers divisible by 5 from 1 to 50 & the number is even also print the
count of even numbers.
Input: Enter a lower limit: 1
Enter upper limit: 50
Output: 10, 20, 30, 40, 50
Count = 5

 */

import java.io.*;

class NestedDemo{

	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a Lower Limit");
		int lower=Integer.parseInt(br.readLine());

		System.out.println("Enter a Upper Limit");
		int upper=Integer.parseInt(br.readLine());

		int count=0;

		System.out.println("Enter The NO Which Is Divisible 5 And Number Is Even");

		for(int i=lower;i<=upper;i++){

			if(i%5==0 ){

				if(i%2==0){

					System.out.println(i);
					count++;
				}
			}
		}

		System.out.println("Enter The Count Of Even Numbers");

		System.out.println(count);
	}
}

