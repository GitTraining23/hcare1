package locPages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.BaseClass;

public class LoginPage{
	
	
	
		public static String getUserName() {
		String uname="//input[@id='username']";
		return uname;
		
	}
	
	public static String Continue() {
		String btn_continue="//button[.='Continue']";// this is for main openmrs page
		//String btn_continue="//button[@type='submit']";
		return btn_continue;
		
	}
	
	public static String getPassword() {
		String p_word="//input[@id='password']";
		return p_word;
		
	}
	
	public static String clickLogin(){
				String click_Login="//button[@type='submit']";//this is for open mrs
		//String click_Login="(//button[@class='continue-button btn-primary'])[2]";
	return click_Login;
		
	}
	

}
