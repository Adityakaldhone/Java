import java.io.*;
class StringDemo{
	static int myLength(String str) {

		char arr[] = str.toCharArray();
		int count = 0;
		
		for(int i  : arr){
			
			count++;
		}
		return count;
	}
	static boolean myEquals(String str1, String str2) {

		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();

		int len1 = myLength(str1);
		int len2 = myLength(str2);

		if(len1 == len2){

			for(int i = 0; i < arr2.length; i++){

				if(arr1[i] != arr2[i]){

					return false;
				}
			}
		}else {

			return false;
		}

		return true;
	}

	static int Pallindrome(String str1){
		StringBuffer sb = new StringBuffer(str1);		
		String str2 = sb.reverse().toString();
		  boolean b =myEquals(str1,str2);
		 if(b==true){
	
			System.out.println("String are identical");
		}else{
		
			System.out.println("Not identical");
		}
		return 0;

		
	}

	 /*void Anagram(String str1 , String str2){
	
		int count = 0;
		int count1 = 0;
		
		int cnt = myLength(str1);
		int cnt1 = myLength(str2);

	if(cnt == cnt1){

         		
		for (int i = 0; i < cnt; i++) {
		       	 char ch = str1.charAt(i);
           		 count = count + ((int)ch);
			 System.out.println(count+"1");
			 
        	}
		
			 System.out.println(count+"1");
		for (int i = 0; i < cnt1; i++) {
         		
		       	 char ch = str2.charAt(i);
           		 count1 = count1 +((int)ch);
        	}
		
			 System.out.println(count+"2");
		if(count == count1){
		
			System.out.println(str1 + " and  " + str2 + " Are Anagram Strings");
		
		}else{
		
			
			System.out.println(str1 + " and  " + str2 + " Are Not Anagram Strings");
		}
	}else{
	
		
			System.out.println(str1 + " and  " + str2 + " Are Not Anagram Strings");
	}
}*/
	int Anagram(String str1, String str2) {

 		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();

		if(myLength(str1)==myLength(str2)){
		
			for(int i=0;i<arr1.length;i++){
			
				for(int j=0;j<arr1.length-1-i;j++){
				
					if(arr1[j] > arr1[j+1]){
					
						char temp = arr1[j];
						arr1[j] = arr1[j+1];
						arr1[j+1] = temp;
					}
					if(arr2[j]>arr2[j+1]){
					
						char temp = arr2[j];
						arr2[j] = arr2[j+1];
						arr2[j+1] = temp;
					}
				}
			}
			int flag = 0;
			for(int i=0;i<arr1.length;i++){
			
				if(arr1[i] != arr2[i]){
				
					flag=1;
				}
			}
			if(flag == 0){
			
				System.out.println(str1 + " and  " + str2 + " Are Anagram Strings");
			}else{
				System.out.println(str1 + " and  " + str2 + " Are not Anagram Strings");
			}
			return 0;
		}else{
		
			
				System.out.println(str1 + " and  " + str2 + " Are not Anagram Strings");
		}
		return 0;
	}
	


	public static void main(String[]args)throws IOException{
	
		BufferedReader Aditya = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Choose from the following");
		System.out.println(" to check the String is pallindrome or not press 1");
		System.out.println(" to check the String is Anagram or not press 2");
		
		int a = Integer.parseInt(Aditya.readLine());
		
		switch(a){
		
			case 1:
				System.out.println("Enter String to check wheather it is pallindrome or not");
				String str1 = Aditya.readLine();
				Pallindrome(str1);
				break;


			case 2:
				StringDemo obj = new StringDemo();
				System.out.println("Enter 1st String to check it is anagram or not");
				String str2 = Aditya.readLine();
				System.out.println("Enter 2nd String to check it is anagram or not");
				String str3 = Aditya.readLine();
				obj.Anagram(str2,str3);
				break;
		
		}		
	}
}
