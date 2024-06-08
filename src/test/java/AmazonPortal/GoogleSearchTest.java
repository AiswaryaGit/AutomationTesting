package AmazonPortal;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import WebPages.AmazonHomePage;
import WebPages.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {
	private static WebDriver driver = null;
	private String baseUrl;

	@BeforeSuite
	public void setUp() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		baseUrl = Util.BASE_URL;
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Util.WAIT_TIME));
		driver.get(baseUrl);
	}

	@Test
	public static void amazonSearch() {
		GoogleSearchPage.textbox_search(driver).clear();
		GoogleSearchPage.textbox_search(driver).sendKeys("Amazon");
		GoogleSearchPage.button_search(driver).click();
		GoogleSearchPage.hyperLink_click(driver).click();

		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, Util.EXPECT_TITLE);
	}

	@Test
	public static void searchAndSelectProduct() {
		AmazonHomePage.textbox_product_search(driver).sendKeys("gimble");
		AmazonHomePage.button_Search(driver).click();
		// select the first item in the search results

	}

	@AfterSuite
	public void tearDown() throws Exception {
		driver.quit();
	}

}
