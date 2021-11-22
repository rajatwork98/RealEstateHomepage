//install tidy gherkin plugin in chrome
//Run feature file- Ru as feature file
//configure convert to cucumber project
//cucumbr option and stepdefanition should have same parent


package stepDefinations;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Resources.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefination extends Base {

	public WebDriver driver;

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		driver = initializeDriver();

	}

	@And("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_something_site(String url) throws Throwable {
		driver.get(url); 
	}

	@Then("^click on invest in overseas$")
	public void click_on_invest_in_overseas() throws Throwable {
		WebElement invest = driver.findElement(By.xpath("//a[text()='Invest in Overseas']"));
		invest.click();
		driver.navigate().back();
	}

	@And("^click on blog$")
	public void click_on_blog() throws Throwable {
		WebElement blog = driver.findElement(By.xpath("//a[text()='Blog']"));
		blog.click();
		driver.navigate().back();
	}

	@When("^click on Realty$")
	public void click_on_realty() throws Throwable {
		WebElement Realty=driver.findElement(By.xpath("//a[text()='Realty']"));

		Actions ac=new Actions(driver);
		ac.moveToElement(Realty).click(Realty).build().perform();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);//wait

		//back to navigate
		driver.close();
		driver.switchTo().window(parentId);
	}

	@Then("^navigate to Realty page$")
	public void navigate_to_realty_page() throws Throwable {

	}

	@When("^click on Home loan$")
	public void click_on_home_loan() throws Throwable {

		WebElement Home=driver.findElement(By.xpath("//a[text()='Home Loan']"));

		Actions ac=new Actions(driver);
		ac.moveToElement(Home).click(Home).build().perform();


		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);


		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

		//driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);//wait
		//back to navigate
		driver.close();
		driver.switchTo().window(parentId);
	}
	@Then("^navigate to Home loan$")
	public void navigate_to_home_loan() throws Throwable {

	}

	@When("^click on Interior$")
	public void click_on_interior() throws Throwable {
		WebElement Interior=driver.findElement(By.xpath("//a[text()='Interiors']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(Interior).click(Interior).build().perform();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

		//driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);//wait
		//back to navigate
		driver.close();
		driver.switchTo().window(parentId);
	}

	@Then("^navigate toInteriors$")
	public void navigate_tointeriors() throws Throwable {

	}

	@When("^click on Legal$")
	public void click_on_legal() throws Throwable {
		WebElement Legal=driver.findElement(By.xpath("//a[text()='Legal']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(Legal).click(Legal).build().perform();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		//driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);//wait
		//back to navigate
		driver.close();
		driver.switchTo().window(parentId);
	}
	@Then("^navigate to Legal$")
	public void navigate_to_legal() throws Throwable {

	}

	@And("^click on browse properties$")
	public void click_on_browse_properties() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");

		WebElement properties = driver.findElement(By.cssSelector("[class='flip-visible']"));
		Actions pro=new Actions(driver);
		pro.moveToElement(properties).build().perform();

		WebElement browseproperties = driver.findElement(By.cssSelector("[class='flip-visible']"));
		Actions browse=new Actions(driver);
		browse.moveToElement(browseproperties).click(browseproperties).build().perform();
		System.out.println("Navigated to browse Properties");
		System.out.println("Now Navigating back to Home page");
		driver.navigate().back();
	}

	@When("^click on share details$")
	public void click_on_share_details() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");

		WebElement Management = driver.findElement(By.xpath("//a[text()='Property Management']"));
		Actions mng=new Actions(driver);
		mng.moveToElement(Management).build().perform();

		WebElement PropertyManagement = driver.findElement(By.xpath("//a[@href='http://realty-real-estatem1.upskills.in/contact/']"));
		Actions browser=new Actions(driver);
		browser.moveToElement(PropertyManagement).click(PropertyManagement).build().perform();
		System.out.println("Navigated to share details page");
		System.out.println("Now Navigating back to Home page");
		driver.navigate().back();
	}

	//////////////////////////
	//Rajat code start here///
	//////////////////////////

	@Then("^I check Helpful links working present in footer$")
	public void i_check_helpful_links_working_present_in_footer() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		//get the height of the webpage and scroll to the end
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES);//wait

		//jumping to about us page
		driver.findElement(By.xpath("//*[@id='menu-item-276']/a")).click();
		//getting title and comparing it with "About Us – Real Estate"
		Assert.assertEquals("About Us – Real Estate",driver.getTitle());
		System.out.println("about us Working");
		//back to the main page
		driver.navigate().back();

		//jumping to contact us page  
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		//comparing current url with expected url
		Assert.assertEquals("http://realty-real-estatem1.upskills.in/contact/", driver.getCurrentUrl());
		System.out.println("contact Working");
		//back to the main page
		driver.navigate().back();

		//jumping to blog us page  
		driver.findElement(By.xpath("//a[text()='Blog']")).click();
		//comparing current url with expected url
		Assert.assertEquals("http://realty-real-estatem1.upskills.in/blog/", driver.getCurrentUrl());
		System.out.println("blog Working");
		//back to the main page
		driver.navigate().back();

		//jumping to Compare Properties  us page  
		driver.findElement(By.xpath("//a[text()='Compare Properties']")).click();
		//comparing title  with expected title
		Assert.assertEquals("Compare Properties – Real Estate", driver.getTitle());
		System.out.println("Compare Properties Working");
		//back to the main page
		driver.navigate().back();


	}


	@When("^I check contact us details presnet in footer or not$")
	public void i_check_contact_us_details_presnet_in_footer_or_not() throws Throwable {

		//creating webelement for  storing address
		WebElement address=driver.findElement(By.xpath("//div[text()='Jayanagar, Bangalore']"));
		//checking address is displayed or not
		Assert.assertTrue(address.isDisplayed());


		//creating webelement for  storing phone number
		WebElement phoneno=driver.findElement(By.xpath("//div[text()='Phone: +91 90000 11111']"));
		//checking phone number  is displayed or not
		Assert.assertTrue(phoneno.isDisplayed());


		//creating webelement for  storing email
		WebElement email=driver.findElement(By.xpath("//div[text()='Email: info@realestate.com']"));
		//checking email  is displayed or not
		Assert.assertTrue(email.isDisplayed());

	}



	@Then("^I print contact details$")
	public void i_print_contact_details() throws Throwable {

		//printing contact details present in the web page

		WebElement address=driver.findElement(By.xpath("//div[text()='Jayanagar, Bangalore']"));
		System.out.println(address.getText());

		WebElement phoneno=driver.findElement(By.xpath("//div[text()='Phone: +91 90000 11111']"));
		System.out.println(phoneno.getText());

		WebElement email=driver.findElement(By.xpath("//div[text()='Email: info@realestate.com']"));
		System.out.println(email.getText());
	}

	@When("^I click on social media links$")
	public void i_click_on_social_media_links() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		//get the height of the webpage and scroll to the end
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		//using multi windows here for checking page is found or not
		//facebook
		driver.findElement(By.xpath("//*[@id='pt-social-icons-4']/ul/li[1]/a")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);

		//after switching checking facebook data  from facebook page

		WebElement text=driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		Assert.assertTrue(text.isDisplayed());//checking the data is present or not 
		//printing that data which is grabbed by  from facebook page
		System.out.println("Facebook helps you connect and share with the people in your life.");

		driver.close();
		driver.switchTo().window(parentId);

		//twitter
		driver.findElement(By.xpath("//*[@id='pt-social-icons-4']/ul/li[2]/a")).click();
		Set<String> windows2 = driver.getWindowHandles();
		Iterator<String> it2 = windows2.iterator();
		String parentId2 = it2.next();
		String childId2 = it2.next();
		driver.switchTo().window(childId2);

		//after switching checking twitter data  from twitter page
		WebElement twitter=driver.findElement(By.xpath("//span[text()='Join Twitter today.']"));
		Assert.assertTrue(twitter.isDisplayed());//checking the data is present or not
		
		//printing that data which is grabbed by  from twitter page
		System.out.println("Join Twitter today.");

		driver.close();
		driver.switchTo().window(parentId2);


		//google plus
		driver.findElement(By.xpath("//*[@id='pt-social-icons-4']/ul/li[3]/a")).click();
		Set<String> windows3 = driver.getWindowHandles();
		Iterator<String> it3 = windows3.iterator();
		String parentId3 = it3.next();
		String childId3 = it3.next();
		driver.switchTo().window(childId3);
        // Google+ was shut down for business and personal use on April 2, 2019.
		System.out.println("google plus acc is not there");

		driver.close();
		driver.switchTo().window(parentId3);

		//news feed
		driver.findElement(By.xpath("//*[@id='pt-social-icons-4']/ul/li[4]/a")).click();
		Set<String> windows4 = driver.getWindowHandles();
		Iterator<String> it4 = windows4.iterator();
		String parentId4 = it4.next();
		String childId4 = it4.next();
		driver.switchTo().window(childId4);
		
		//checking news page is found or not
		if(driver.findElement(By.xpath("//*[text()='This site can’t be reached']")).isDisplayed())
		{
			System.out.println("news feed Page not found");
		}
		else
		{
			System.out.println("News feed working fine");
		}
		
		
       
		driver.close();
		driver.switchTo().window(parentId4);
	}



}



















