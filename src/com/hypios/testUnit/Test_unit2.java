
package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class Test_unit2 extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
	    setUp("http://staging.fpgg-network.org/connect.html", "*firefox");

	  }

	@Test
	public void testUntitled() throws Exception {
		selenium.open("/connect.html");
		selenium.type("login_email", "william@hypios.com");
		selenium.type("login_password", "william");
		selenium.click("//input[@value='Login']");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Dashboard");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=hypios");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Profile");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Contacts");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Labs");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Activities");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Tools");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
