package testClasses;

import java.io.IOException;
import java.util.List;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import locPages.AddAppointmentPage;
import utilities.BaseClass;
import utilities.FetchDataFromProp;

public class AddAppointmentTest extends BaseClass{
	
	AddAppointmentPage aap=new AddAppointmentPage();
	LoginTest lt=new LoginTest();
	public String patName;
	
	@Test(priority=2,groups={"@sanity"})
	public void Add_Appointment() throws InterruptedException, IOException
	{
		lt.excuteLoginTest();
		addImplicitWait();
		patName=FetchDataFromProp.readDataFromProp().getProperty("patFullName");
		//System.out.println(patName);
		
		driver.findElement(By.xpath(aap.click_Appointment())).click();
		addImplicitWait();
		addExplicitWait(AddAppointmentPage.click_CreateAppointment());
		driver.findElement(AddAppointmentPage.click_CreateAppointment()).click();;
		addImplicitWait();
		Thread.sleep(5000);
		driver.findElement(By.xpath(aap.searchby_name())).sendKeys(patName);
		addImplicitWait();
		driver.findElement(By.xpath(aap.search_button())).click();
		Thread.sleep(3000);
		WebElement clickid=driver.findElement(By.xpath(aap.click_Id()));

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",clickid);
		//arguments[0].click()
		
		WebElement sellocation=driver.findElement(By.xpath(aap.sel_Location()));
		Select sel=new Select(sellocation);
		sel.selectByVisibleText("Outpatient Clinic");
		
		WebElement selservice=driver.findElement(By.xpath(aap.sel_Service()));
		Select selser=new Select(selservice);
		selser.selectByValue("General Medicine service");
		
		WebElement selAppoint=driver.findElement(By.xpath(aap.sel_AppType()));
		Select selapp=new Select(selAppoint);
		selapp.selectByVisibleText("Scheduled");
		
		driver.findElement(By.xpath(aap.app_duration())).sendKeys("20");
		driver.findElement(By.xpath(aap.save_closebut())).click();
		addImplicitWait();
		
		//List<WebElement> rows= driver.findElements(By.xpath(aap.val_table()));
		List<WebElement>rows=driver.findElements(By.xpath("//div[@class='cds--data-table-content']//tbody//tr[@class='cds--parent-row']"));
		for(int i=1;i<=rows.size();i++)
		{				

			//WebElement name=driver.findElement(By.xpath("(//table[@class='cds--data-table cds--data-table--sm cds--data-table--sort cds--data-table--zebra cds--data-table--visible-overflow-menu'])[1]/tbody/tr[i]//td[2]"));
			//div[@class='cds--data-table-content']//tbody//tr[@class="cds--parent-row"][2]/td[2]
			addImplicitWait();
			WebElement name=driver.findElement(By.xpath("//div[@class='cds--data-table-content']//tbody//tr[@class='cds--parent-row']["+i+"]//td[2]"));
						
						addImplicitWait();

			if(name.getText().equalsIgnoreCase(patName))
					
			{
				System.out.println("Testcase AddAppointment is passed");
			}
			
		
		}
		
	}
	
}
