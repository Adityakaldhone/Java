/*
 
   Program 3:

WAP to take size of array from user and also take integer elements from user Print
product of odd index only
input : Enter size : 6
Enter array elements : 1 2 3 4 5 6
output : 48

 */
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter The Size Of Array");

		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter The Elements In Array");

		for(int i=0;i<arr.length;i++){

			arr[i]=sc.nextInt();
		
		}

		int mult=1;

		for(int i=1;i<arr.length;i=i+2){


				mult=mult*arr[i];
		}

		System.out.println(mult);
	
	}

}
