package seleniumDemo;

import org.openqa.selenium.NoSuchElementException;
import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.*;
public class Register {
WebDriver driver;
// Locators
By fnameLocator = By.id("u_0_1");
By lnameLocator = By.id("u_0_3");
By emailLocator = By.id("u_0_6");
By reenterEmailLocator = By.id("u_0_9");
By newPasswordLocator = By.id("u_0_b");
By monthLocator = By.id("month");
By dateLocator = By.id("day");
By yearLocator = By.id("year");
By radioMale = By.id("u_0_f");
By radioFemale = By.id("u_0_e");
By signInLocator = By.id("u_0_j");
// Strings
String pagetitle = "Facebook - Log In or Sign Up";
public Register(WebDriver d){
this.driver = d;
}

public void setFirstName(String fName){
try{
WebElement fnameBox = driver.findElement(fnameLocator);
fnameBox.sendKeys(fName);
}
catch(NoSuchElementException e){
System.out.println("First name element not found");
}
}
public boolean assertElementsPresent(){
if(driver.findElement(fnameLocator).isDisplayed() &&
 driver.findElement(lnameLocator).isDisplayed() &&
 driver.findElement(emailLocator).isDisplayed() &&
 driver.findElement(reenterEmailLocator).isDisplayed() &&
 driver.findElement(newPasswordLocator).isDisplayed() &&
 driver.findElement(monthLocator).isDisplayed() &&
 driver.findElement(dateLocator).isDisplayed() &&
 driver.findElement(yearLocator).isDisplayed() &&
 driver.findElement(radioMale).isDisplayed() &&
 driver.findElement(radioFemale).isDisplayed() &&
 driver.findElement(signInLocator).isDisplayed()){
 return true;
}
else{
return false;
}
}
public void setLastName(String lName){
try{
WebElement lnameBox = driver.findElement(lnameLocator);
lnameBox.sendKeys(lName);
}
catch(NoSuchElementException e){
System.out.println("Last name text box not found");
}
}
public void setEmail(String email){
try{
WebElement emailBox = driver.findElement(emailLocator);
emailBox.sendKeys(email);
}
catch(NoSuchElementException e){

System.out.println("Email textbox not found");
}
}
public void setReenterEmail(String email){
try{
WebElement emailBox = driver.findElement(reenterEmailLocator);
emailBox.sendKeys(email);
}
catch(NoSuchElementException e){
System.out.println("Reenter email box not found");
}
}
public void setNewPassword(String pwd){
try{
WebElement newPwdlBox = driver.findElement(newPasswordLocator);
newPwdlBox.sendKeys(pwd);
}
catch(NoSuchElementException e){
System.out.println("Password textbox not found");
}
}
public void setMonth(String s){
try{
new
Select(driver.findElement(monthLocator)).selectByVisibleText(s);
}
catch(NoSuchElementException e){
System.out.println("month select box not found");
}
}
public void setDate(String s){
try{
new
Select(driver.findElement(dateLocator)).selectByVisibleText(s);
}
catch(NoSuchElementException e){
System.out.println("set date select box not found");
}

}
public void setYear(String s){
try {
Thread.sleep(2000);
new
Select(driver.findElement(yearLocator)).selectByVisibleText(s);
} catch (InterruptedException e) {
e.printStackTrace();
} catch (NoSuchElementException e){
System.out.println("Set year element not found");
}
}
public void setMale(){
try{
WebElement male = driver.findElement(radioMale);
male.click();
}
catch(NoSuchElementException e){
System.out.println("Set male radio button not found");
}
}
public void setFemale(){
try{
WebElement female = driver.findElement(radioFemale);
female.click();
}
catch(NoSuchElementException e){
System.out.println("Set female radio button not found");
}
}
public void clickSignIn(){
try{
driver.findElement(By.id("u_0_j")).click();
}
catch(NoSuchElementException e){
System.out.println("Sign in button not found");
}
}

// Asssert statements
public boolean assertErrorFname(){
timelapse();
return driver.findElement(By.xpath("//div[@id='u_0_0']//i[@class='_5dbc
img sp_IIuy94UEXRV sx_cb4753']")).isDisplayed();
}
public boolean assertErrorEmailFormat(){
timelapse();
return driver.findElement(By.xpath("//div[@id='u_0_8']//i[@class='_5dbc
img sp_IIuy94UEXRV sx_cb4753']")).isDisplayed();
}
public void assertErrorEmailUsed(){
try{
timelapse();
Assert.assertEquals(driver.findElement(By.xpath("//div[@id='reg_error_inner']/
form")).getText(), "Sorry, it looks like tejas269@gmail.com belongs to an existing
account. Would you like to ?");
}
catch(NoSuchElementException e){
System.out.println("Email used error not found on screen");
}
}
public void assertTitle(){
assertEquals(pagetitle, driver.getTitle());
}
public void assertConfirmPageDisplayed(){
Assert.assertEquals(driver.findElement(By.xpath("//div[@id='confirm_center']/div/div/div/div//h2[@class= 'uiHeaderTitle']")).getText(), "Confirm Your EmailAddress");
}
public void timelapse(){
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
e.printStackTrace();
}
}
public String getPageTitle(){
return driver.getTitle();
}
}