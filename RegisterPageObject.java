package selenium;

import org.openqa.selenium.By;

public class RegisterPageObject {
	public static final By registerButton = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]");
	public static final By firstNameField = By.xpath("//input[@name='firstName']");
	public static final By lastNameField = By.xpath("//input[@name='lastName']");
	public static final By phoneField = By.xpath("//input[@name='phone']");
	public static final By emailField = By.xpath("//input[@id='userName']");
	public static final By addressField = By.xpath("//input[@name='address1']");
	public static final By address2Field = By.xpath("//input[@name='address2']");
	public static final By cityField = By.xpath("//input[@name='city']");
	public static final By stateProvinceField = By.xpath("//input[@name='state']");
	public static final By postalCodeField = By.xpath("//input[@name='postalCode']");
	public static final By selectCountry = By.xpath("//select[@name='country']");
	public static final By userNameField = By.xpath("//input[@id='email']");
	public static final By passwordField = By.xpath("//input[@name='password']");
	public static final By confirmPasswordField = By.xpath("//input[@name='confirmPassword']");
	public static final By submitButton = By.xpath("//input[@name='register']");
	public static final By signOffButton = By.xpath("//a[contains(text(),'SIGN-OFF')]");
	public static final By signOnButton = By.xpath("//a[contains(text(),'SIGN-ON')]");
	public static final By userNameLogField = By.xpath("//input[@name='userName']");
	public static final By passwordLogField = By.xpath("//input[@name='password']");
	public static final By submitLogButton = By.xpath("//input[@value='Login']");
	
}
