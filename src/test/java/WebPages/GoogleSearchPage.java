package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

	static WebElement element = null;

	public static WebElement textbox_search(WebDriver driver) {

		element = driver.findElement(By.name("q"));
		return element;

	}

	public static WebElement button_search(WebDriver driver) {
		element = driver.findElement(By.name("btnK"));
		return element;
	}

	public static WebElement hyperLink_click(WebDriver driver) {
		element = driver.findElement(By.partialLinkText("Amazon.com. Spend less. Smile more."));
		return element;

	}

}
