package Lead.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class create {
	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();

		WebElement eleUsername = driver.findElementById("username");
		eleUsername.sendKeys("DemoSalesManager");

		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();

		//CreateLead
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("CSS");

		WebElement firstName= driver.findElementById("createLeadForm_firstName");
		firstName.sendKeys("Divakar");
		//	String txt1 =driver.findElementById("createLeadForm_firstName").getText();

		driver.findElementById("createLeadForm_lastName").sendKeys("Ramesh");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("fsf");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("asf");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("summa");

		//dropdown
		Select selectobj1= new Select(driver.findElementById("createLeadForm_dataSourceId"));
		//selectobj1.selectByValue("LEAD_EMPLOYEE");
		selectobj1.selectByIndex(4);

		driver.findElementById("createLeadForm_annualRevenue").sendKeys("5,00,000");

		Select selectobj2= new Select(driver.findElementById("createLeadForm_currencyUomId"));
		//selectobj2.selectByIndex("INR");
		selectobj2.selectByIndex(25);

		Select selectobj3= new Select(driver.findElementById("createLeadForm_industryEnumId"));
		selectobj3.selectByIndex(3);


		Select selectobj4= new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
		selectobj4.selectByIndex(5);

		driver.findElementById("createLeadForm_sicCode").sendKeys("233");
		driver.findElementById("createLeadForm_description").sendKeys("im creating lead");
		driver.findElementById("createLeadForm_importantNote").sendKeys("study purpose");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("044");	
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("233433");	
		driver.findElementById("createLeadForm_departmentName").sendKeys("NGO");	
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("233");	
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("##");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("William");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.abc.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("DD");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("No. 467,kattabomman street");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Oval");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Oval");

		Select selectobj5= new Select(driver.findElementById("createLeadForm_generalCountryGeoId"));
		selectobj5.selectByIndex(5);


		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("12345");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("5678");

		Select selectobj6= new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		selectobj6.selectByIndex(5);

		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("123456789");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");


		driver.findElementByXPath("//input[@class='smallSubmit']").click();


		String str1= driver.findElementById("viewLead_firstName_sp").getText();

		if(str1.equals("Divakar"))
		{
			System.out.println("Lead Created");
		}
		else
			System.out.println("Test case failed");

	}


}


