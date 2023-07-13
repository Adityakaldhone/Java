//2.ArrayIndexOutOfBounds Exception

class ArrayDemo {
	
	
   public static void main(String[]args) {

	int arr[] = new int[]{10,20,30,40,50};

	for(int i=0;i<=arr.length;i++) {
	
		System.out.println(arr[i]);
		
	}
   }
}

/*
output:
root@LAPTOP-382C9LGN:~/Java/Java/classcodes/Exception_Handling/73# java ArrayDemo
10
20
30
40
50
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at ArrayDemo.main(program2.java:12)
 */
