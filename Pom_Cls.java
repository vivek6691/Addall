package com.maven.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pom_Cls {
	
	@FindBy(xpath="//input[@id='email']")
	public static WebElement name;
	
	@FindBy(xpath="//input[@id='passwd']")
	public static WebElement password; 

	@FindBy(id="SubmitLogin")
	public static WebElement login;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	public static WebElement dress;
	
	@FindBy(xpath="(//a[text()='Summer Dresses'])[1]")
	public static WebElement summer;
	
	@FindBy(xpath="(//a[@title='Add to cart'])[1]")
	public static WebElement addcart;
	
	@FindBy(xpath="//a[contains(@class,'btn btn-default button button-medium')]")
	public static WebElement checkout1;
		
	@FindBy(xpath="//a[contains(@class,'button btn btn-default standard-checkout button-medium')]")
	public static WebElement checkout2;
	
//	@FindBy(name="message")
//	public static WebElement text;
	
	@FindBy(name="processAddress")
	public static WebElement checkout3;
	
	@FindBy(xpath="//input[@type='checkbox']")
	public static WebElement agree;
	
	@FindBy(name="processCarrier")
	public static WebElement checkout4;
	
	@FindBy(xpath="//a[@title='Pay by check.']")
	public static WebElement banking;
	
	@FindBy(xpath="//button[contains(@class,'button btn btn-default button-medium')]")
	public static WebElement order;
	
	@FindBy(xpath="//a[.='Back to orders']")
	public static WebElement backorder;
	
	
}



