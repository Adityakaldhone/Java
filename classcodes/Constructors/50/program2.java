//Private Access Specifier 
class Core2Web{

	int courses = 8;
	private String favcourse = "Cpp";

	void Disp(){
	
		System.out.println(courses);
		System.out.println(favcourse);
	}
}
class Student{

	public static void main(String[]args){
	
		Core2Web obj = new Core2Web();
		obj.Disp();

		System.out.println(obj.courses);
		System.out.println(obj.favcourse);  //error : favcourse has private access in core2Web

	}
}

