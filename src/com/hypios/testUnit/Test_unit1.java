package com.hypios.testUnit;


import java.util.regex.Pattern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestCase;

public class Test_unit1 extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
	    setUp("http://staging.fpgg-network.org/connect.html", "*firefox");

	  }
	@Test
	public void testUntitled() throws Exception {
		selenium.open("/connect.html");
		selenium.type("login_email", "william");
		selenium.type("login_email", "william@hypios.com");
		selenium.type("login_password", "william");
		selenium.click("//input[@value='Login']");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
