package easy;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Action {

@When("The user can fill the details")
public void the_user_can_fill_the_details() {
	ActionPom acc=new ActionPom();
	acc.getenter().sendKeys("Basic");
	acc.getbutton().click();
	acc.getfirstValue().sendKeys("10");
	acc.getsecondValue().sendKeys("20");
	acc.getfinish().click();
	
}

@Then("The user can see the result")
public void the_user_can_see_the_result() {
	Assert.assertTrue("verify url contains basic-first-form", Hook.driver.getCurrentUrl().contains("basic-first-form"));
	
    
}

@When("The user can fill the form  details")
public void the_user_can_fill_the_form_details() {
	ActionPom acc=new ActionPom();
	acc.gettick().click();
	acc.getoption().click();
	acc.getcheck().click();
    
}

@Then("The user can see the message")
public void the_user_can_see_the_message() {
	Assert.assertTrue("verify url contains basic-checkbox-demo", Hook.driver.getCurrentUrl().contains("basic-checkbox-demo"));

}

@When("The user can select radio button")
public void the_user_can_select_radio_button() {
	ActionPom acc=new ActionPom();   
	acc.getvalue().click();
	acc.getvclick().click();
	acc.getgender().click();
	acc.getage().click();
	acc.getgenagevalue();
	
}

@Then("The user can see the end message")
public void the_user_can_see_the_end_message() {
	Assert.assertTrue("verify url contains basic-radiobutton-demo", Hook.driver.getCurrentUrl().contains("basic-radiobutton-demo"));

    }


@When("The user can select select button")
public void the_user_can_select_select_button() {
	ActionPom acc=new ActionPom();
	acc.getday();
	acc.getcountry();
	acc.getselbtn().click();
    
     }

@Then("The user can see the last message")
public void the_user_can_see_the_last_message() {
	Assert.assertTrue("verify url contains basic-select-dropdown-demo", Hook.driver.getCurrentUrl().contains("basic-select-dropdown-demo"));

    }
@When("The user can fill the submit details")
public void the_user_can_fill_the_submit_details() {
	ActionPom acc=new ActionPom();
	acc.getname().sendKeys("Abinaya");
	acc.getlname().sendKeys("sivakumar");
	acc.getemail().sendKeys("sabinayakumar95@gmail.com");
	acc.getpno().sendKeys("9597712958");
	acc.getAddress().sendKeys("boombugar saalai");
	acc.getloc().sendKeys("kumbakonam");
	acc.getstate().click();
	acc.getstateclk().click();
	acc.getzip().sendKeys("612501");
	acc.getwebsite().sendKeys("selenium");
	acc.gethosting().click();
	acc.getdesc().sendKeys("good");
	acc.getsend().click();
	
    
}

@Then("The customer can see the result")
public void the_customer_can_see_the_result() {
	Assert.assertTrue("verify url contains input-form-demo", Hook.driver.getCurrentUrl().contains("input-form-demo"));
}


@When("The user can fill the Ajax details")
public void the_user_can_fill_the_Ajax_details() {
	ActionPom acc=new ActionPom();
	acc.getAname().sendKeys("Abinaya");
	acc.getcomment().sendKeys("Best practice");
	acc.getAjaxclk().click();
}


@Then("The customer can see the final msg")
public void the_customer_can_see_the_final_msg() {
	Assert.assertTrue("verify url contains ajax-form-submit-demo", Hook.driver.getCurrentUrl().contains("ajax-form-submit-demo"));    
}


@When("The user can fill the DropDSown details")
public void the_user_can_fill_the_DropDSown_details() {
	ActionPom acc=new ActionPom(); 
	acc.getjQuery().click();
}

@Then("The customer can see the final Details")
public void the_customer_can_see_the_final_Details() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}







}
