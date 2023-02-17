package automation;

public class While {

	public static void main(String[] args) {
     System.out.println("start");
     String browser = "chrome";
     while(browser.equals("chrome")) {
    	 System.out.println("ChromeBrowserExecution");
    	 browser = "firefox";
     }
	}

}
