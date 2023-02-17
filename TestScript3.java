package automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScript3 {
	@Test(priority = 1)
	public void addEmployee() {
		System.out.println("Addemployee");
		Assert.assertTrue(true);
		}
	@Test(priority = 2,dependsOnMethods ="AddEmployee")
	public void editEmployee() {
		System.out.println("EditEmployee");
		}
	@Test(priority = 3,dependsOnMethods = "AddEmpolyee")
	public void deleteEmployee() {
		System.out.println("DeleteEmployee");
	}

}
