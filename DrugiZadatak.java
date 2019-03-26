package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*. Launch new Browser
2. Open http://newtours.demoaut.com/
3. Click on Register link using “driver.findElement(By.id(“<pronaci id u DOM-u>”)).click();“
4. Come back to Home page (Use ‘Back’ command)
5. Again go back to Registration page (This time use ‘Forward’ command)
6. Again come back to Home page (This time use ‘To’ command)
7. Refresh the Browser (Use ‘Refresh’ command)
8. Close the Browser*/

public class DrugiZadatak {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		try {

			driver.get(UrlConfig.url2);

			WebElement element = driver.findElement(
					By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]"));

			element.click();

			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().to(UrlConfig.url2);
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			driver.close();
		}
	}
}
