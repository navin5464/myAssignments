package testcase;

import org.testng.annotations.Test;

import baseclass.Baseclass;
import pages.Loginpage;

public class Tc001 extends Baseclass {
	
	@Test 
	public void loginData () {
		Loginpage lp = new Loginpage();
		lp.enterUsername("DemoCSR").enterPassword("crmsfa").clickLoginbutton()
		.crmlink();
	}

}
