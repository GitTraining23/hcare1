package locPages;

import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.FetchDataFromProp;

public class DemoPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("hello");
		WebDriver driver = new ChromeDriver();
		//String tab="(//table[@class='cds--data-table cds--data-table--sm cds--data-table--sort cds--data-table--zebra cds--data-table--visible-overflow-menu'])[1]/tbody/tr";
		/*driver.get("https://o3.openmrs.org/openmrs/spa/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin123");
		driver.findElement(By.xpath("\"//button[@type='submit']\"")).click();
		driver.findElement(By.xpath("(//a[@class='cds--side-nav__link'])[1]")).click();

		List<WebElement> rows= driver.findElements(By.xpath(aap.val_table()));
		System.out.println(rows.size());
		
		for(int i=1;i<=rows.size();i++)
		{				
			//String tab="(//table[@class='cds--data-table cds--data-table--sm cds--data-table--sort cds--data-table--zebra cds--data-table--visible-overflow-menu'])[1]/tbody/tr";

			//WebElement name=driver.findElement(By.xpath("(//table[@class='cds--data-table cds--data-table--sm cds--data-table--sort cds--data-table--zebra cds--data-table--visible-overflow-menu'])[1]/tbody/tr[i]//td[2]"));
			//div[@class='cds--data-table-content']//tbody//tr[@class="cds--parent-row"][2]/td[2]
			Thread.sleep(5000);
			WebElement name=driver.findElement(By.xpath("//div[@class='cds--data-table-content']//tbody//tr[@class=\"cds--parent-row\"][i]/td[2]"));
			System.out.println(name);
			if(name.getText().equalsIgnoreCase("steve ocornor"))
					
			{
				System.out.println("found"+ name);
			}
		
		}
 
		List<WebElement> rows= driver.findElements(By.xpath(aap.val_table()));
		System.out.println(rows.size());
		
		/*for(int i=1;i<=rows.size();i++)
		{				
			//String tab="(//table[@class='cds--data-table cds--data-table--sm cds--data-table--sort cds--data-table--zebra cds--data-table--visible-overflow-menu'])[1]/tbody/tr";

			//WebElement name=driver.findElement(By.xpath("(//table[@class='cds--data-table cds--data-table--sm cds--data-table--sort cds--data-table--zebra cds--data-table--visible-overflow-menu'])[1]/tbody/tr[i]//td[2]"));
			//div[@class='cds--data-table-content']//tbody//tr[@class="cds--parent-row"][2]/td[2]
			Thread.sleep(5000);
			WebElement name=driver.findElement(By.xpath("//div[@class='cds--data-table-content']//tbody//tr[@class='cds--parent-row'][i]/td[2]"));
			System.out.println(name);
			if(name.getText().equalsIgnoreCase("steve ocornor"))
					
			{
				System.out.println("found"+ name);
			}*/
	
		}
		
		
		
		
		//driver.close();
		
		
		
		/* 1. //Get driver from BaseTest and assign to local webdriver variable.
	    Object testClass = iTestResult.getInstance();
	    WebDriver webDriver = ((BaseTest) testClass).getDriver();*/
		
		
		//open menu button to add appointment
		//button[@class="cds--header__action cds--header__menu-trigger cds--header__menu-toggle"]
		
		/* click appointment from home after logged in
		driver.findElement(By.linkText("Appointments"));*/
		
		/*select create appointment*
		 *  //button[@aria-label="Search Patient Button"]
		 */
		 
		/* search name
		 * /
		 * //input[@class="cds--search-input" and @placeholder="Search for a patient by name or identifier number"]
		 */
		
		/*select location
		 * //select[@id="location"] 
		 by text,Outpatient Clinic*/
		 
		 /* select service
		  * //select[@id="service"]
		  by value,value="General Medicine service"
		 */
		
		/* select appointment type
		//select[@id="appointmentType"]
		value="Scheduled"*/
		//select date
		/*(//div[contains(@class,'-esm-appointments__monthly-workload')])[26]
		 * */
		// (//span[@class='flatpickr-day cds--date-picker__day'])[16-1]
	//}

	
	

	// start visit			
		
	/* 
	addExplicitWait(AddVitalDetails.click_appointment());
	driver.findElement(AddVitalDetails.click_appointment()).click();
	
	addExplicitWait(AddVitalDetails.click_CreateAppointment());
	driver.findElement(AddVitalDetails.click_CreateAppointment()).click();
	
	addExplicitWait(AddVitalDetails.searchby_name());
	driver.findElement(AddVitalDetails.searchby_name()).sendKeys("bill2 tim2");

	addExplicitWait(AddVitalDetails.search_button());
	driver.findElement(AddVitalDetails.search_button()).click();

	addExplicitWait(AddVitalDetails.clickOnStartVisit());
	driver.findElement(AddVitalDetails.clickOnStartVisit()).click();
	
	addExplicitWait(AddVitalDetails.selectVisit_type());
	driver.findElement(AddVitalDetails.selectVisit_type())
	
	public static By click_appointment()
	{
		
		return	By.xpath("(//a[@class='cds--side-nav__link'])[1]");
	}

	public static By click_CreateAppointment()
	{
		
		return	By.xpath("//button[@aria-label='Search Patient Button']");
	}
	
	
	public static By searchby_name() {
		
		return By.xpath("(//input[@class='cds--search-input'])[2]");
	
	}


	public static By search_button() {
		return By.xpath("//button[@type='submit']");
		
		
	}
	public static  By clickOnStartVisit()
	{
		
		return By.xpath("//button[@class='cds--btn cds--btn--primary']");
	}

	public static  By selectVisit_type()
	{
		
		return By.xpath("(//input[@class='cds--search-input'])[2]");
	}
	*/

	/*List<WebElement> rows=driver.findElements(By.xpath("(//div[@class='cds--data-table-content'])[1]//tbody//tr[@class='cds--parent-row'][1]//td[4]"));
	//(//div[@class="cds--data-table-content"])[1]//tbody//tr[@class="cds--parent-row"][1]//td[4]
	System.out.println(rows.size());
	

	for(int i=1;i<=rows.size();i++)
	{				
		
		addImplicitWait();
		WebElement name=driver.findElement(By.xpath("(//div[@class='cds--data-table-content'])[1]//tbody//tr[@class='cds--parent-row']["+i+"]//td[4]"));
					System.out.println(name.getText());
					addImplicitWait();

		if(name.getText().equalsIgnoreCase("steve max"))
				
		{
			driver.findElement(By.xpath("(//div[@class='cds--data-table-content'])[1]//tbody//tr[@class='cds--parent-row']["+i+"]//td[4]")).click();

		}
		
	
	}*/
	
	
	///active visit 
}
