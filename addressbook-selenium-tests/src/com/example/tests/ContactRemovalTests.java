package com.example.tests;

import org.testng.annotations.Test;

public class ContactRemovalTests extends TestBase {
	@Test
	  public void deleteSomeContact() {
		app.getNavigationHelper().openMaimPage();
		app.getContactHelper().deleteContact(1);
	    app.getContactHelper().returnContactPage();
}
}
