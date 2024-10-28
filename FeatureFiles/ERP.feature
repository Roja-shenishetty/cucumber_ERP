
@tag
Feature: 
I want to use to for ERP project

  @supplier
  Scenario Outline:
      Adding Suppliers
    Given I want to launch browser 
    When I launch url 
    When I wait for username  with "name" and "username" and "10"
    When I enter username with "name" and "username" and "admin"
    When I enter password with "name" and "password" and "master"
    When I click login button with "id" and "btnsubmit"
    Then I wait for supplier link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]" and "10"
    When I click supplier link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
    When I wait for AddIcon with "xpath" and "(//span[@data-caption='Add'])[1]" and "10"
    When I click AddIcon with "xpath" and "(//span[@data-caption='Add'])[1]"
    Then I wait for supplier number with "xpath" and "//input[@id='x_Supplier_Number']" and "10"
    When I capture supplier number with "xpath" and "//input[@id='x_Supplier_Number']"
    When I enter in "<supplierName>" with "id" and "x_Supplier_Name"
    When I enter in "<Address>" with "name" and "x_Address"
    When I enter in "<City>" with "name" and "x_City"
    When I enter in "<Country>" with "name" and "x_Country"
    When I enter in "<ContactPerson>" with "name" and "x_Contact_Person"
    When I enter in "<PhoneNum>" with "name" and "x_Phone_Number"
    When I enter in "<Email>" with "name" and "x__Email"
    When I enter in "<MobileNum>" with "name" and "x_Mobile_Number"
    When I enter in "<Notes>" with "name" and "x_Notes" 
    When I click add button with "id" and "btnAction"
    When I wait for AlertOk with "xpath" and "//button[normalize-space()='OK!']" and "10"
    When I click AlertOk with "xpath" and "//button[normalize-space()='OK!']"
    When I wait for confirmOk with "xpath" and "(//button[contains(normalize-space(),'OK')])[6]" and "10"
    When I click for confirmOk with "xpath" and "(//button[contains(normalize-space(),'OK')])[6]"
    Then I verify supplier number
    When I click Logout link with "xpath" and "(//a[starts-with(text(),' Logout')])[2]"
    When I close Browser 
    
    Examples: 
   |supplierName|Address|City|Country|ContactPerson|PhoneNum|Email|MobileNum|Notes|
   |Roja|Manikonda|hyd|India|667567|6455657676|gftryhvhugyu|665675757899|ggddyyyg|
   |Ruthuja|Kukatpally|hyd|India|6564768|5656444677|hhghfhjfhughu|77886867868|ghhgfhwurgfuw|
   |Roshan|Acsendas|hyd|India|5679837|7467865875682|kddhihiwhifw|88765786594|nbxbjcvkjskjs|
   
   
   
   @customer
   Scenario Outline: I want to test add customer module
    Given I want to launch browser 
    When I launch url 
    When I wait for username  with "name" and "username" and "10"
    When I enter username with "name" and "username" and "admin"
    When I enter password with "name" and "password" and "master"
    When I click login button with "id" and "btnsubmit"
    Then I wait for customer link with "xpath" and "(//a[contains(text(),'Customers')])[2]" and "10"
    When I click customer link with "xpath" and "(//a[contains(text(),'Customers')])[2]"
    When I wait for AddIcon with "xpath" and "(//a[@data-caption='Add'])[1]" and "10"
    When I click AddIcon with "xpath" and "(//a[@data-caption='Add'])[1]"
    Then I wait for customer number with "name" and "x_Customer_Number" and "10"
    When I capture customer number with "name" and "x_Customer_Number"
    When I enter in "<CustomerName>" with "name" and "x_Customer_Name"
    When I enter in "<Address>" with "name" and "x_Address"
    When I enter in "<City>" with "name" and "x_City"
    When I enter in "<Country>" with "name" and "x_Country"
    When I enter in "<ContactPerson>" with "name" and "x_Contact_Person"
    When I enter in "<PhoneNum>" with "name" and "x_Phone_Number"
    When I enter in "<Email>" with "name" and "x__Email"
    When I enter in "<MobileNum>" with "name" and "x_Mobile_Number"
    When I enter in "<Notes>" with "name" and "x_Notes" 
    When I click add button with "id" and "btnAction"
    When I wait for AlertOk with "xpath" and "//button[normalize-space()='OK!']" and "10"
    When I click AlertOk with "xpath" and "//button[normalize-space()='OK!']"
    When I wait for confirmOk with "xpath" and "(//button[contains(normalize-space(),'OK')])[6]" and "10"
    When I click for confirmOk with "xpath" and "(//button[contains(normalize-space(),'OK')])[6]"
    Then I verify customer number
    When I click Logout link with "xpath" and "(//a[starts-with(text(),' Logout')])[2]"
    When I close Browser 
    
    
     Examples: 
   |CustomerName|Address|City|Country|ContactPerson|PhoneNum|Email|MobileNum|Notes|
   |Roja|Manikonda|hyd|India|667567|6455657676|gftryhvhugyu|665675757899|ggddyyyg|
   |Ruthuja|Kukatpally|hyd|India|6564768|5656444677|hhghfhjfhughu|77886867868|ghhgfhwurgfuw|
   |Roshan|Acsendas|hyd|India|5679837|7467865875682|kddhihiwhifw|88765786594|nbxbjcvkjskjs|
    