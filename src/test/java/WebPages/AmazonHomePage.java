package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage {

	static WebElement element = null;

	public static WebElement textbox_product_search(WebDriver driver) {

		element = driver.findElement(By.id("twotabsearchtextbox"));
		return element;
		
	}

	public static WebElement button_Search(WebDriver driver) {

		element = driver.findElement(By.id("nav-search-submit-button"));
		return element;

	}

}
