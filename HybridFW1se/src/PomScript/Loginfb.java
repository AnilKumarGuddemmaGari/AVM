package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenaricScript.Basepage;

public class Loginfb extends Basepage
{

	@FindBy(xpath="//input[@id='email']")
	private WebElement unt;
	@FindBy(xpath="//button[@name='login']")
	private WebElement btn;
	@FindBy(xpath="//input[@id='pass']")
	private WebElement pwt;
	
	
	public Loginfb(WebDriver driver)
	{
		super(driver);
	}
	
	public void user(String name)
	{
		unt.sendKeys(name);
	}
	public void button()
	{
		btn.click();
	}
	public void pass(String password)
	{
		pwt.sendKeys(password);
	}

}
