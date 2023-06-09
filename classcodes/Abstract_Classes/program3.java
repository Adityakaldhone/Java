abstract class SujataMastani {

	void mainBranchLocation() {
	
		System.out.println("Sadashiv Peth pune");
	}

	abstract void OtherBranchLocation();
}

class PhaltanBranchLocation extends SujataMastani {

	void OtherBranchLocation() {

			System.out.println("kolki near shriram bazar,phaltan");
	}
}

class Client {

	public static void main(String[]args) {
	
		PhaltanBranchLocation obj = new PhaltanBranchLocation();
		obj.mainBranchLocation();
		obj.OtherBranchLocation();
	}
}

/*
output:
Sadashiv Peth pune
kolki near shriram bazar,phaltan
 */ 
