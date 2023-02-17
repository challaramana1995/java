package automation;

public class Test {

	public static void m1() {
		System.out.println("This is m1 method");
		}
	public static void main(String[]args)throws Exception{
		Test.m1();
		Test test = new Test();
		test.m1();
	}

}
