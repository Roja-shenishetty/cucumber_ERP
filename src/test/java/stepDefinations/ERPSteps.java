package stepDefinations;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ERPSteps {

	WebDriver driver;
@Given("I want to launch browser")
public void i_want_to_launch_browser() throws Throwable {
    driver=FunctionLibrary.startBrowser();
}

@When("I launch url")
public void i_launch_url() {
    FunctionLibrary.openUrl();
}

@When("I wait for username  with {string} and {string} and {string}")
public void i_wait_for_username_with_and_and(String ltype, String lvalue, String myWait) {
    FunctionLibrary.waitForElement(ltype, lvalue, myWait);
}

@When("I enter username with {string} and {string} and {string}")
public void i_enter_username_with_and_and(String ltype, String lvalue, String tdata) {
     FunctionLibrary.typeAction(ltype, lvalue, tdata);
}

@When("I enter password with {string} and {string} and {string}")
public void i_enter_password_with_and_and(String ltype, String lvalue, String tdata) {
     FunctionLibrary.typeAction(ltype, lvalue, tdata);
}

@When("I click login button with {string} and {string}")
public void i_click_login_button_with_and(String ltype, String lvalue) {
     FunctionLibrary.clickAction(ltype, lvalue);
}

@When("I enter in {string} with {string} and {string}")
public void i_enter_in_with_and(String tdata, String ltype, String lvalue) {
    FunctionLibrary.typeAction(ltype, lvalue, tdata);
}

@Then("I wait for supplier link with {string} and {string} and {string}")
public void i_wait_for_supplier_link_with_and_and(String ltype, String lvalue, String tdata) {
     FunctionLibrary.waitForElement(ltype, lvalue, tdata);
}

@When("I click supplier link with {string} and {string}")
public void i_click_supplier_link_with_and(String ltype, String lvalue) {
     FunctionLibrary.clickAction(ltype, lvalue);
}

@When("I wait for AddIcon with {string} and {string} and {string}")
public void i_wait_for_add_icon_with_and(String ltype, String lvalue,String myWait) {
     FunctionLibrary.waitForElement(ltype, lvalue, myWait);
}

@When("I click AddIcon with {string} and {string}")
public void i_click_add_icon_with_and(String ltype, String lvalue) {
     FunctionLibrary.clickAction(ltype, lvalue);
}

@Then("I wait for supplier number with {string} and {string} and {string}")
public void i_wait_for_supplier_number_with_and_and(String ltype, String lvalue, String myWait) {
     FunctionLibrary.waitForElement(ltype, lvalue, myWait);
}

@When("I capture supplier number with {string} and {string}")
public void i_capture_supplier_number_with_and(String ltype, String lvalue) throws Throwable {
     FunctionLibrary.captureSup(ltype, lvalue);
}

@When("I click add button with {string} and {string}")
public void i_click_add_button_with_and(String ltype, String lvalue) {
     FunctionLibrary.clickAction(ltype, lvalue);
}

@When("I wait for AlertOk with {string} and {string} and {string}")
public void i_wait_for_alert_ok_with_and_and(String ltype, String lvalue, String myWait) {
     FunctionLibrary.waitForElement(ltype, lvalue, myWait);
}

@When("I click AlertOk with {string} and {string}")
public void i_click_alert_ok_with_and(String ltype, String lvalue) {
       FunctionLibrary.clickAction(ltype, lvalue);
}

@When("I wait for confirmOk with {string} and {string} and {string}")
public void i_wait_for_confirm_ok_with_and_and(String ltype, String lvalue, String myWait) {
       FunctionLibrary.waitForElement(ltype, lvalue, myWait);
}

@When("I click for confirmOk with {string} and {string}")
public void i_click_for_confirm_ok_with_and(String ltype, String lvalue) {
     FunctionLibrary.clickAction(ltype, lvalue);
}

@Then("I verify supplier number")
public void i_verify_supplier_number() throws Throwable {
     FunctionLibrary.supplierTable();
}

@When("I click Logout link with {string} and {string}")
public void i_click_logout_link_with_and(String ltype, String lvalue) {
     FunctionLibrary.clickAction(ltype, lvalue);
}

@When("I close Browser")
public void i_close_browser() {
      FunctionLibrary.closeBrowser();
}

@Then("I wait for customer link with {string} and {string} and {string}")
public void i_wait_for_customer_link_with_and_and(String ltype, String lvalue,String myWait) {
      FunctionLibrary.waitForElement(ltype, lvalue, myWait);
      
}

@When("I click customer link with {string} and {string}")
public void i_click_customer_link_with_and(String ltype, String lvalue) {
      FunctionLibrary.clickAction(ltype, lvalue);
}

@Then("I wait for customer number with {string} and {string} and {string}")
public void i_wait_for_customer_number_with_and_and(String ltype, String lvalue, String myWait) {
      FunctionLibrary.waitForElement(ltype, lvalue, myWait);
}

@When("I capture customer number with {string} and {string}")
public void i_capture_customer_number_with_and(String ltype, String lvalue) throws Throwable {
      FunctionLibrary.captureCus(ltype, lvalue);
}

@Then("I verify customer number")
public void i_verify_customer_number() throws Throwable {
      FunctionLibrary.customerTable();
}



}
