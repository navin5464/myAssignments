package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import pages.Loginpage;

public class Tc002 extends Baseclass {
	@BeforeTest
	public void setData() {
		filename="CreateLead";
	}
	
		 @Test (dataProvider="fetchdata") 
	public void createData (String cname,String fname,String lname) {
		Loginpage lp = new Loginpage();
		lp.enterUsername("DemoCsr")
		.enterPassword("crmsfa")
		.clickLoginbutton()
		.crmlink()
		.clickLeads()
		.clickCreateLeads()
		.companyname(cname)
		.firstname(fname)
		.lastname(lname)
		.submit()
		.verify(cname);
	}

}
