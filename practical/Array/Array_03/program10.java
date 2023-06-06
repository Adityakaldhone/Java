/*
 
Program 10
Write a program to print the second min element in the array
Input: Enter array elements: 255 2 1554 15 65 95 89
Output: 15

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

                int max=0;

                for(int i=0;i<arr.length;i++){

                        if(arr[i]>max){

                                max=arr[i];
                        }
                }

                int min=max;

                for(int i=0;i<arr.length;i++){

                        if(arr[i]<min){

                                min=arr[i];
                        }


                }

		int secmin=max;

		for(int i=0;i<arr.length;i++){

			if(arr[i]<secmin && arr[i]>min){

				secmin=arr[i];
			}
		}
                System.out.println("Second Minimumt Element In Array= " + secmin);
	}
}

