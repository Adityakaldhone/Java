// SubString With two parameter :

import java.io.*;

class MethodSubString {

        static String mySubString(String str, int start, int end) {

                char arr1[] = str.toCharArray();

		if(start == end) {

			str = new String();
			return str;	
		}else if(arr1.length < end || start<0 || arr1.length < start || end<0) {

                       System.out.println("please give valid range");
		    return "z"; 
		        
                }else {

                        char arr2[] = new char[end - start];
                        int itr = 0;
                        for(int i = start; i < end; i++){

                                arr2[itr] = arr1[i];
                                itr++;
                        }

                        str = new String(arr2);
                        return str;

                }
        }
        public static void main(String[] args)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the String : ");
                String str = br.readLine();
                System.out.println("Enter start Index : ");
                int start = Integer.parseInt(br.readLine());

		System.out.println("Enter end Index : ");
                int end = Integer.parseInt(br.readLine());

                String str1 = mySubString(str,start,end);
			if(str1=="z"){

			}
			else{
			
				System.out.println(str1);
			}
        }
}
