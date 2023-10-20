package lectures;


import java.io.IOException;


public class test {

	public static void main(String[] args) {
//		System.out.println("Hello World" );
		
//		int res = add(4, 6);
//		System.out.println(res);
		
//		System.out.println(saySumn("kAlev"));
		
//		ConSta cs = new ConSta();
//		cs.isVoteEligible();
//		System.out.println(cs.getDayName());
		
//		ArraysTest arrTest = new ArraysTest();
//		arrTest.arrayTest(1);
//		arrTest.arrayTest(2);
//		arrTest.arrayTest(3);
//		arrTest.stringArray();
//		arrTest.showCommonArrayElements();
//		arrTest.showCommonStringArrayElements();

		try {
			Files.createFiles();
			Files.readFile();
			Files.deleteFile();
		}
		// note: FileNotFoundException is within IOException hierarchy
		catch (IOException  e) {
			System.out.println("Unable to operate on file..");
			e.printStackTrace();
		}

	}
	
//	public static int add(int a, int b) {
//		return a + b;
//	}
//	
//	public static String saySumn(String name) {
//		if (name.toLowerCase() == "kalev"){
//			return "Hello, " + name;
//		}
//		
//		return "I dont know you";
//	}
//	

}

