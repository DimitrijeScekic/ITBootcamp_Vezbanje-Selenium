package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterForma {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		try {

			driver.get(UrlConfig.url2);

			WebElement element = driver.findElement(RegisterPageObject.registerButton);

			element.click();

			/*WebElement firstNAme = driver.findElement(RegisterPageObject.firstNameField);
			firstNAme.click();
			firstNAme.sendKeys("Dimitrije");*/
			
			//ProbnaMetoda.popuniPolje(RegisterPageObject.firstNameField,"Dimitrije");

			WebElement lastName = driver.findElement(RegisterPageObject.lastNameField);
			lastName.click();
			lastName.sendKeys("Scekic");

			WebElement phone = driver.findElement(RegisterPageObject.phoneField);
			phone.click();
			phone.sendKeys("+381654352789");

			WebElement email = driver.findElement(RegisterPageObject.emailField);
			email.click();
			email.sendKeys("mitamita@gmail.com");

			WebElement address = driver.findElement(RegisterPageObject.addressField);
			address.click();
			address.sendKeys("Crnotravska 12");

			WebElement address2 = driver.findElement(RegisterPageObject.address2Field);
			address2.click();
			address2.sendKeys("Palilula");

			WebElement city = driver.findElement(RegisterPageObject.cityField);
			city.click();
			city.sendKeys("Beograd");

			WebElement stateProvince = driver.findElement(RegisterPageObject.stateProvinceField);
			stateProvince.click();
			stateProvince.sendKeys("Centralna Srbija");

			WebElement postalCode = driver.findElement(RegisterPageObject.postalCodeField);
			postalCode.click();
			postalCode.sendKeys("11000");

			Select country = new Select(driver.findElement(((RegisterPageObject.selectCountry))));
			country.selectByVisibleText("SERBIA");

			WebElement userName = driver.findElement(RegisterPageObject.userNameField);
			userName.click();
			userName.sendKeys("Mita");

			WebElement password = driver.findElement(RegisterPageObject.passwordField);
			password.click();
			password.sendKeys("007");

			WebElement confirmPassword = driver.findElement(RegisterPageObject.confirmPasswordField);
			confirmPassword.click();
			confirmPassword.sendKeys("007");

			WebElement submitButton = driver.findElement(RegisterPageObject.submitButton);
			submitButton.click();

			String actuallyUrl = driver.getCurrentUrl();

			if (actuallyUrl.equals(UrlConfig.confirmUrl))
				System.out.println("Uspesno ste se registrovali!");
			else
				System.out.println("Registracija nije uspela!");
			
			WebElement signOff = driver.findElement(RegisterPageObject.signOffButton);
			signOff.click();

			WebElement signOn = driver.findElement(RegisterPageObject.signOnButton);
			signOn.click();
			
			WebElement userNameLog = driver.findElement(RegisterPageObject.userNameLogField);
			userNameLog.click();
			userNameLog.sendKeys("Mita");
			
			WebElement passwordLog = driver.findElement(RegisterPageObject.passwordLogField);
			passwordLog.click();
			passwordLog.sendKeys("007");
			
			WebElement submitLogButton = driver.findElement(RegisterPageObject.submitLogButton);
			submitLogButton.click();
			
			
			

		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			// driver.close();
		}
	}
}
