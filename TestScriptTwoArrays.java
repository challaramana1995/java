package automation;

public class TestScriptTwoArrays {

	public static void main(String[] args) {
   String[][] data = new String[2][3];
   System.out.println(data.length);
   System.out.println(data[0].length);
   System.out.println(data[1].length);
   data[0][0] = "TestScript";
   data[0][1] = "UserName";
   data[0][2] = "PassWord";
   System.out.println(data[0][0]);
   System.out.println(data[0][1]);
   
   
	}

}
