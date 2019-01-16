package easy;

import cucumber.api.java.en.Given;

public class HomePage {


@Given("The user can test the Homepage")
public void the_user_can_test_the_Homepage() {
	Hook.driver.get("https://www.seleniumeasy.com/test/");
    
}

@Given("The user can test the input form")
public void the_user_can_test_the_input_form() {
	PomForm page=new PomForm();
	page.getinputForm().click();
	page.getsimple().click();
	
    
}

@Given("Ensure user is in Homepage")
public void ensure_user_is_in_Homepage() {
	Hook.driver.get("https://www.seleniumeasy.com/test/");
    
}

@Given("The user can test the checkbox form")
public void the_user_can_test_the_checkbox_form() {
	PomForm page=new PomForm();
	page.getcheckForm().click();
	page.getdemo().click();

}

@Given("Ensure user is in seleniumpage")
public void ensure_user_is_in_seleniumpage() {
	Hook.driver.get("https://www.seleniumeasy.com/test/");
    
}
@Given("The user can test the radio button")
public void the_user_can_test_the_radio_button() {
	PomForm page=new PomForm();
	page.getRadio().click();
	page.getrBtn().click();
    }

@Given("Ensure user is in frontpage")
public void ensure_user_is_in_frontpage() {
	Hook.driver.get("https://www.seleniumeasy.com/test/");
    }

@Given("The user can test the select button")
public void the_user_can_test_the_select_button() {
	PomForm page=new PomForm();
	page.getselect().click();
	page.getselbt().click();
}


@Given("The user is in Home")
public void the_user_is_in_Home() {
	
	Hook.driver.get("https://www.seleniumeasy.com/test/");
    }
@Given("The user can test the Submit button")
public void the_user_can_test_the_Submit_button() {
	PomForm page=new PomForm();
	page.getsubmit().click();
	page.getSubform().click();
	
    }

@Given("The user is in first page")
public void the_user_is_in_first_page() {
	Hook.driver.get("https://www.seleniumeasy.com/test/");
	
    }

@Given("The user can test the Ajax Form")
public void the_user_can_test_the_Ajax_Form() {
	PomForm page=new PomForm();
	page.getAjax().click();
	page.getAjaxform().click();
}

@Given("The user is in lauch page")
public void the_user_is_in_lauch_page() {
	Hook.driver.get("https://www.seleniumeasy.com/test/");  
}

@Given("The user can test the DropDown Form")
public void the_user_can_test_the_DropDown_Form() {
	PomForm page=new PomForm();
	page.getDropDown().click();
	page.getseltdrop().click();
}









}
