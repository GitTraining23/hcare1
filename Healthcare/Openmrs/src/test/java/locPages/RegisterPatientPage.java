package locPages;

public class RegisterPatientPage {
	
	public static String patient_name_known;
	
	// click Addpatient button
		public static String click_AddPatient() {
		String add_patient="//button[@name='AddPatientIcon']";
			return add_patient;
		
	}
		//button=[@type='button' and @aria-selected='false'])[2]
	public static String Patient_Name_Known(String selection) {
		if(selection.equalsIgnoreCase("yes"))
		{
			patient_name_known=("//span[@class='cds--content-switcher__label'])[1]");
			
		}else if(selection.equalsIgnoreCase("no"))
		{
			patient_name_known=("//span[@class='cds--content-switcher__label'])[2]");
		}
		
		return patient_name_known;
		
		
		
	}
	
	
	public static String pat_firstName() {
		String first_name="//input[@id='givenName']";
		return first_name;
		
	}
	public static String pat_lName() {
		String lname="//input[@id='familyName']";
		return lname;
		
	}
	//@FindBy(xpath="(//span[@class='TabsList2027980309__label'])[3]")
	//WebElement withdraw;//first one
	
	public static String sel_Gender() {
		
		//String selGender="(//span[@class='cds--radio-button__label-text'])[2]";
		//String selGender="//input[@id='gender-option-female']";
		String selGender="//input[@id='gender-option-male']";
		
			return selGender;
		
	}
	public static String dobdetail() {
		String dob="(//span[@class='cds--content-switcher__label'])[4]";
		return dob;
		
	}
	
	public static String pat_Age() {
		String age ="//input[@id='yearsEstimated']";
		return age;
		
	}
	//input[@class="cds--search-input"]
	public static String pat_Addr() {
			
			//String addr="//input[@class='cds--search-input']";//search addr text appears and disappears rightway
			//String addr="//input[@fplaceholder='Search address']";
		String addr="//input[@id='address1']";
		return addr;
		
	}
	public static String register_Button() {
		String regButton ="//button[@type='submit']";
		return regButton;
		
	}
	
	public static String validate_PatID() {
		String validateId="//*[text()='OpenMRS ID']";
		return validateId;
		
	}
	
	public static String closePg() {
		String cPg="//button[@aria-label='close']";
		return cPg;
		
	}
	 
	//after registering create an appointment

}
