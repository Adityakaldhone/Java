class Core2Web {

	public static void main(String[] args) {
		
		int[] var1 = new int[2];
		var1[0] = 0;
		var1[1] = 1;

		System.out.println(var1[0] + " " + var1[1] + " " +( var1.length + var1[1]));
	}
}

//output: 0 1 3


class Core2Web {

	public static void main(String[] args) {

		int[] var1 = new int[2];
		var1[0] = 0;
		var1[1] = 1;

		System.out.println(var1[0] + " " + var1[1] + " " + var1.length + var1[2]);
	}
}

// output: error: array index out of elements


class Core2Web {

	public static void main(String[] args) {

		int[] var1 = new int[2];
		var1[0] = 0;
		var1[1] = 1;

		System.out.println(var1[0] + " " + var1[1] + " " + var1.length + var1[1]);
	}
}

output: 0 1 21


