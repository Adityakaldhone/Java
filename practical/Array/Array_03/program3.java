/*


Program 3:

Program 3
WAP to find a composite number from an array and return its index.
Take size and elements from the user
Input: 1 2 3 5 6 7
Output: composite 6 found at index: 4


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

                System.out.println("Print The Composite Number From Array");



                for(int i=0;i<arr.length;i++){

                        int temp=arr[i];
                        int count=0;

                        for(int j=1;j<=temp;j++){

				if(temp%j==0){

					count++;
				
				}

			}

			if(count>2){

                                         System.out.println("composite "+ temp +" found at index: "+i );
			}
		}
	}
}
