

// Default Access Specifier
class Core2Web{

	int NoOfCourses = 8;
	String FavCourse = "C,Cpp and DS";

	void disp(){
	
		System.out.println(NoOfCourses);
		System.out.println(FavCourse);

	}
}
class User{

	public static void main(String[]args){
	
		Core2Web obj = new Core2Web();
		obj.disp();
		
		System.out.println(obj.NoOfCourses);
		System.out.println(obj.FavCourse);
	}
}
