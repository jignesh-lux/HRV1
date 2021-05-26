package com.hrv1.qa.pages.master;

import com.hrv1.qa.base.TestBase;
import com.hrv1.qa.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class MasterCompanyEditPage extends TestBase {

    // Initializing the PageObject

    public MasterCompanyEditPage() {
        PageFactory.initElements(driver, this);
    }

    // PageFactory  or ObjectRepository

    @FindBy(xpath = "//h1[contains(text(),'Company List')]")
    public static WebElement companyListMainHeader;

    @FindBy(xpath = "//input[@id='filterList']")
    public static WebElement companyListSearch;

    @FindBy(xpath = "//a[contains(text(),'Previous')]")
    public static WebElement companyListPreviousButton;

    @FindBy(xpath = "//a[contains(text(),'Next')]")
    public static WebElement companyListNextButton;

    @FindBy(xpath = "//li[@class='pagination-next ng-star-inserted disabled']")
    public static WebElement companyListNextButtonDisable;

    @FindBy(xpath = "//th[contains(text(),'Company')]/../../..//tbody//tr//td[5]")
    public static List<WebElement> companyNameEditIcon;

    //  ----------------Step 1 Edit ------------------

    @FindBy(xpath = "//*[text()=' Edit Company - ']")
    public static WebElement editCompanyStep1MainHeader;

    @FindBy(xpath = "//span[contains(text(),'Step 1 of 4')]")
    public static WebElement editCompanyStep1Header;

    @FindBy(xpath = "//span[contains(text(),'Basic Info')]")
    public static WebElement editCompanyStep1PageHeader;

    @FindBy(xpath = "//span[contains(text(),'Basic Info')]/../../../../..//label[contains(text(),'Name')]")
    public static WebElement editCompanyStep1NameHeader;

    @FindBy(xpath = "//div[contains(text(),' Name is required ! ')]")
    public static WebElement editCompanyNameRequiredErrorMessage;

    @FindBy(xpath = "//div[contains(text(),'Name does not allow Special Characters \" \\')]")
    public static WebElement editCompanyNameSpecialCharacterErrorMessage;

    @FindBy(xpath = "//input[@id='company_Name']")
    public static WebElement editCompanyStep1NameInput;

    @FindBy(xpath = "//span[contains(text(),'Basic Info')]/../../../../..//label[contains(text(),'Registration No')]")
    public static WebElement editCompanyStep1RegistrationNoHeader;

    @FindBy(xpath = "//div[contains(text(),' Registration No is required ! ')]")
    public static WebElement editCompanyRegistrationNoRequiredErrorMessage;

    @FindBy(xpath = "//div[contains(text(),' Registration No only alphabets and numeric value allow ! ')]")
    public static WebElement editCompanyRegistrationNoSpecialCharacterErrorMessage;

    @FindBy(xpath = "//input[@id='registration_No']")
    public static WebElement editCompanyStep1RegistrationNoInput;

    @FindBy(xpath = "//span[contains(text(),'Basic Info')]/../../../../..//label[contains(text(),'Registration Date')]")
    public static WebElement editCompanyStep1RegistrationDateHeader;

    @FindBy(xpath = "//input[@id='registration_Date']")
    public static WebElement editCompanyStep1RegistrationDateInput;

    @FindBy(xpath = "//select[@class='flatpickr-monthDropdown-months']")
    public static WebElement editCompanyStep1RegistrationDateMonth;

    @FindBy(xpath = "//input[@class='numInput cur-year']")
    public static WebElement editCompanyStep1RegistrationDateYear;

    @FindBy(xpath = "//div[@class='dayContainer']//span[@aria-label='May 3, 1995']")
    public static WebElement editCompany1Step1RegistrationDateDay;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    public static WebElement editCompanyStep1ContinueBtn;

    // ----------------------- Step 2 Edit ---------------------------------------

    @FindBy(xpath = "//span[contains(text(),'Step 2 of 4')]")
    public static WebElement editCompanyStep2Header;

    @FindBy(xpath = "//span[contains(text(),'Settings')]")
    public static WebElement editCompanyStep2PageHeader;

    @FindBy(xpath = "//label[contains(text(),'Logo')]")
    public static WebElement editCompanyStep2LogoHeader;

    @FindBy(xpath = "//input[@id='companyLogo']")
    //    @FindBy(xpath = "//div[@id='companyLogoImage']")
    public static WebElement editCompanyStep2LogoInput;

    @FindBy(xpath = "//span[contains(text(),' Select image ')]/../..//a[@id='remove']")
    public static WebElement editCompanyRemoveImageClick;

    @FindBy(xpath = "//label[contains(text(),'Currency')]")
    public static WebElement editCompanyStep2CurrencyHeader;

    @FindBy(xpath = "//select[@id='currency']")
    public static WebElement editCompanyStep2CurrencyClick;

    @FindBy(xpath = "//option[contains(text(),'Euro - €')]") // Euro getAttribute("value") = 9
    public static WebElement editCompanyStep2CurrencySelect;

    @FindBy(xpath = "//select[@id='currency']//option[contains(text(),'Dollar - $')]")
    public static WebElement editCompanyStep2CurrencySelectValue;

    @FindBy(xpath = "//a[contains(text(),'Back')]")
    public static WebElement editCompanyStep2BackBtn;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    public static WebElement editCompanyStep2ContinueBtn;

    // ----------------------- Step 3 Edit ---------------------------------------


    @FindBy(xpath = "//span[contains(text(),'Step 3 of 4')]")
    public static WebElement editCompanyStep3Header;

    @FindBy(xpath = "//span[contains(text(),'Contact')]")
    public static WebElement editCompanyStep3PageHeader;

    //    @FindBy(xpath = "//th[contains(text(),'Contact Type')]")
    @FindBy(xpath = "//*[text()='Contact Type ']")
    public static WebElement editCompanyStep3ContactTypeHeader;

    //    @FindBy(xpath = "//th[contains(text(),'Contact Info')]")
    @FindBy(xpath = "//*[text()='Contact Info ']")
    public static WebElement editCompanyStep3ContactValueHeader;

    @FindBy(xpath = "//button[@class='btn pull-right']//i[@class='fa fa-plus']")
    public static WebElement companyStep3AddRow;

    // Email Edit

    @FindBy(xpath = "//select[@id='Contact_Type0']")
    public static WebElement editCompanyStep3ContactType0Click;

    @FindBy(xpath = "//input[@id='contact_Value0']")
    public static WebElement editCompanyStep3ContactValue0EmailInput;

    @FindBy(xpath = "//select[@id='Contact_Type0']//option[contains(text(),'Email')]")
    public static WebElement editCompanyStep3ContactValue0EmailSelectedValue;

    @FindBy(xpath = "//label[@for='isDefault0']//span[@class='check']")
    public static WebElement editCompanyStep3EmailDefaultCheckbox0;

    @FindBy(xpath = "//label[@for='isActive0']//span[@class='check']")
    public static WebElement editCompanyStep3EmailActiveCheckbox0;

    // Mobile No Edit

    @FindBy(xpath = "//select[@id='Contact_Type1']")
    public static WebElement editCompanyStep3ContactType1MobileNoClick;

    @FindBy(xpath = "//select[@id='Contact_Type1']//option[contains(text(),'Mobile No')]")
    public static WebElement editCompanyStep3ContactValue1MobileNoSelectedValue;


    @FindBy(xpath = "//ng-select2[@id='country_Id1']/../..//div[@class='input-group-btn']")
    public static WebElement editCompanyStep3ContactMobileCountryCodeType1Click;

    @FindBy(xpath = "//ng-select2[@id='country_Id1']/../..//div[@class='input-group-btn']//option[contains(text(),'India (+91)')]")
    public static WebElement editCompanyStep3ContactMobileCountryCodeType1SelectedValue;

    @FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")
    public static WebElement editCompanyStep3ContactMobileNoCountryCodeType1InputValue;

    @FindBy(xpath = "//li[contains(text(),'India (+91)')]")
    public static WebElement editCompanyStep3ContactMobileCountryCodeType1InputValueSelect;

    @FindBy(xpath = "//input[@id='contact_Value1']")
    public static WebElement editCompanyStep3ContactMobileNoValue1Input;

    @FindBy(xpath = "//label[@for='isDefault1']//span[@class='check']")
    public static WebElement editCompanyStep3MobileNoDefaultCheckbox1;

    @FindBy(xpath = "//label[@for='isActive1']//span[@class='check']")
    public static WebElement editCompanyStep3MobileNoActiveCheckbox1;

    // Phone No Edit

    @FindBy(xpath = "//select[@id='Contact_Type2']")
    public static WebElement editCompanyStep3ContactType2PhoneNoClick;

    @FindBy(xpath = "//select[@id='Contact_Type2']//option[contains(text(),'Phone No')]")
    public static WebElement editCompanyStep3ContactValue2PhoneNoSelectedValue;

    @FindBy(xpath = "//select[@id='Contact_Type2']//option[@value='Phone No']")
    public static WebElement editCompanyStep3ContactType2PhoneNoSelect;

    @FindBy(xpath = "//ng-select2[@id='country_Id2']/../..//div[@class='input-group-btn']")
    public static WebElement editCompanyStep3ContactPhoneCountryCodeType1Click;

    @FindBy(xpath = "//ng-select2[@id='country_Id1']/../..//div[@class='input-group-btn']//option[contains(text(),'India (+91)')]")
    public static WebElement editCompanyStep3ContactPhoneCountryCodeType1SelectedValue;

    @FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")
    public static WebElement editCompanyStep3ContactPhoneNoCountryCodeType1InputValue;

    @FindBy(xpath = "//li[contains(text(),'India (+91)')]")
    public static WebElement editCompanyStep3ContactPhoneCountryCodeType1InputValueSelect;

    @FindBy(xpath = "//input[@id='contact_Value2']")
    public static WebElement editCompanyStep3ContactPhoneNoValue1Input;

    @FindBy(xpath = "//label[@for='isDefault2']//span[@class='check']")
    public static WebElement editCompanyStep3PhoneNoDefaultCheckbox2;

    @FindBy(xpath = "//label[@for='isActive2']//span[@class='check']")
    public static WebElement editCompanyStep3PhoneNoActiveCheckbox2;

    // Fax Edit

    @FindBy(xpath = "//select[@id='Contact_Type3']")
    public static WebElement editCompanyStep3ContactType3FaxClick;

    @FindBy(xpath = "//select[@id='Contact_Type3']//option[contains(text(),'Fax')]")
    public static WebElement editCompanyStep3ContactValue3FaxSelectedValue;


    @FindBy(xpath = "//input[@id='contact_Value3']")
    public static WebElement editCompanyStep3ContactFaxValue1Input;

    @FindBy(xpath = "//label[@for='isDefault3']//span[@class='check']")
    public static WebElement editCompanyStep3FaxDefaultCheckbox3;

    @FindBy(xpath = "//label[@for='isActive3']//span[@class='check']")
    public static WebElement editCompanyStep3FaxActiveCheckbox3;

    // Website Edit

    @FindBy(xpath = "//select[@id='Contact_Type4']")
    public static WebElement editCompanyStep3ContactType4WebsiteClick;

    @FindBy(xpath = "//select[@id='Contact_Type4']//option[contains(text(),'WebSite')]")
    public static WebElement editCompanyStep3ContactValue4WebSiteSelectedValue;

    @FindBy(xpath = "//input[@id='contact_Value4']")
    public static WebElement editCompanyStep3ContactWebsiteValue1Input;

    @FindBy(xpath = "//label[@for='isDefault4']//span[@class='check']")
    public static WebElement editCompanyStep3WebsiteDefaultCheckbox4;

    @FindBy(xpath = "//label[@for='isActive4']//span[@class='check']")
    public static WebElement editCompanyStep3WebsiteActiveCheckbox4;

    //    Delete Website Edit

    @FindBy(xpath = "(//i[@class='fa fa-minus'])[4]")
    public static WebElement editCompanyStepDeleteRow3;

    @FindBy(xpath = "//a[contains(text(),'Back')]")
    public static WebElement editCompanyStep3BackBtn;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    public static WebElement editCompanyStep3ContinueBtn;

    // ----------------------- Step 4 Edit ---------------------------------------

    @FindBy(xpath = "//span[contains(text(),'Step 4 of 4')]")
    public static WebElement editCompanyStep4Header;

    @FindBy(xpath = "//span[contains(text(),'Step 4 of 4')]/../../../..//span[contains(text(),'Configuration')]")
    public static WebElement editCompanyStep4PageHeader;

    @FindBy(xpath = "//label[contains(text(),'Accross Company')]")
//    @FindBy(xpath = "//label[contains(text(),'Across Company')]")
    public static WebElement editCompanyStep4AcrossCompanyHeader;

    @FindBy(xpath = "//label[contains(text(),'Accross Company')]/..//span[@class='check']/..//span[@class='box']")
    public static WebElement editCompanyStep4AcrossCompanyCheckboxSelect;

    @FindBy(xpath = "//label[contains(text(),'Prefix')]")
    public static WebElement editCompanyStep4PrefixHeader;

    @FindBy(xpath = "//input[@id='prefix']")
    public static WebElement editCompanyStep4PrefixInput;

    @FindBy(xpath = "//label[contains(text(),'Total Length')]")
    public static WebElement editCompanyStep4TotalLengthHeader;

    @FindBy(xpath = "//input[@id='total_Digit']")
    public static WebElement editCompanyStep4TotalLengthInput;

    @FindBy(xpath = "//label[contains(text(),'Total Length')]/../..//label[contains(text(),'Employee Code')]")
    public static WebElement editCompanyStep4EmployeeCodeHeader;

    @FindBy(xpath = "//input[@id='displayCode']")
    public static WebElement editCompanyStep4EmployeeCodeInput;

    @FindBy(xpath = "//a[contains(text(),'Back')]")
    public static WebElement editCompanyStep4BackBtn;

    @FindBy(xpath = "//a[contains(text(),'Save')]")
    public static WebElement editCompanyStep4SaveBtn;

    @FindBy(xpath = "//a[contains(text(),'Record updated successfully !')]")
    public static WebElement editCompanySaveUpdateMessage;



    public void verifyAddCompanyForEdit(){
        try {
            while (TestUtil.isElementPresent(companyListNextButton)){

                boolean flag_check =verifyCompanyNameOnTable(data.getProperty("addCompanyStep1NameInput1"),driver.findElements(By.xpath("//th[contains(text(),'Company')]/../../..//tbody//tr//td//div[2]")));

                if (flag_check) break;

                TestUtil.highlightElement(companyListNextButton);
                TestUtil.waiting(1000);
                companyListNextButton.click();
                TestUtil.waiting(3000);

                if (!TestUtil.isElementPresent(companyListNextButton)){
//                if (TestUtil.isElementPresent(companyListNextButtonDisable)){
                    flag_check = verifyCompanyNameOnTable(data.getProperty("addCompanyStep1NameInput1"),driver.findElements(By.xpath("//th[contains(text(),'Company')]/../../..//tbody//tr//td//div[2]")));

                }
                if (flag_check) break;
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    // General Method to verify the text in the Company List
    public static boolean verifyCompanyNameOnTable(String name, List<WebElement> listElement){
        int size = listElement.size();
        boolean flag = false;
        System.out.println(size);
        for (int i = 0; i < size; i++){
            String get_text = listElement.get(i).getText();
            System.out.println("--------------"+ get_text);
            if (name.equals(get_text)){
                System.out.println("Text verified");
                TestUtil.waiting(1000);
                companyNameEditIcon.get(i).click();
                flag = true;
                break;
            }
        }
        return flag;
    }

    public void editCalender1() {
        try {
            TestUtil.highlightElement(editCompanyStep1RegistrationDateInput);
            editCompanyStep1RegistrationDateInput.click();
            TestUtil.highlightElement(editCompanyStep1RegistrationDateMonth);
            TestUtil.selectMethod(editCompanyStep1RegistrationDateMonth, "May");
            Thread.sleep(1000);
            TestUtil.highlightElement(editCompanyStep1RegistrationDateYear);
            editCompanyStep1RegistrationDateYear.clear();
            Thread.sleep(1000);
            editCompanyStep1RegistrationDateYear.sendKeys(data.getProperty("editCompanyStep1RegistrationDateYear1"));
            TestUtil.highlightElement(editCompany1Step1RegistrationDateDay);
            editCompany1Step1RegistrationDateDay.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editCompany1Step1(){
        try {
            TestUtil.waiting(2000);
            TestUtil.highlightElement(editCompanyStep1MainHeader);
            Assert.assertEquals(editCompanyStep1MainHeader.getText(),"EDIT COMPANY - STEP 1 OF 4","Edit company Step 1 Main Header Missing");
            TestUtil.highlightElement(editCompanyStep1Header);
            TestUtil.highlightElement(editCompanyStep1PageHeader);

            // Name Edit
            TestUtil.waiting(1000);
            TestUtil.highlightElement(editCompanyStep1NameHeader);
            Assert.assertEquals(editCompanyStep1NameHeader.getText(),"Name *","Edit company Step 1 Name Header Missing");
            TestUtil.highlightElement(editCompanyStep1NameInput);
            Assert.assertEquals(editCompanyStep1NameInput.getAttribute("value"),data.getProperty("addCompanyStep1NameInput1"),"Edit company Name not same");

            TestUtil.waiting(1000);
            TestUtil.highlightElement(editCompanyStep1NameInput);
            TestUtil.clearElement(editCompanyStep1NameInput);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(editCompanyStep1NameInput);
            editCompanyStep1NameInput.sendKeys(data.getProperty("editCompanyStep1NameInput1"));

            // Registration No Edit
            TestUtil.waiting(1000);
            TestUtil.highlightElement(editCompanyStep1RegistrationNoHeader);
            Assert.assertEquals(editCompanyStep1RegistrationNoHeader.getText(),"Registration No *","Edit company Step 1 Registration No Header Missing");
            TestUtil.highlightElement(editCompanyStep1RegistrationNoInput);
            Assert.assertEquals(editCompanyStep1RegistrationNoInput.getAttribute("value"),data.getProperty("addCompanyStep1RegistrationNoInput1"),"Edit company Registration No not same");

            TestUtil.waiting(1000);
            TestUtil.highlightElement(editCompanyStep1RegistrationNoInput);
            TestUtil.clearElement(editCompanyStep1RegistrationNoInput);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(editCompanyStep1RegistrationNoInput);
            editCompanyStep1RegistrationNoInput.sendKeys(data.getProperty("editCompanyStep1RegistrationNoInput1"));

            // Registration Date Edit
            TestUtil.waiting(1000);
            TestUtil.highlightElement(editCompanyStep1RegistrationDateHeader);
            Assert.assertEquals(editCompanyStep1RegistrationDateHeader.getText(),"Registration Date *","Edit company Step 1 Registration Date Header Missing");
            TestUtil.highlightElement(editCompanyStep1RegistrationDateInput);
            Assert.assertEquals(editCompanyStep1RegistrationDateInput.getAttribute("value"),"03-05-1994","Edit company Registration No not same");

            editCalender1();

            TestUtil.waiting(1000);
            TestUtil.highlightElement(editCompanyStep1ContinueBtn);
            editCompanyStep1ContinueBtn.click();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void editCompany1Step2(){
        try {
            TestUtil.waiting(2000);
            TestUtil.highlightElement(editCompanyStep2Header);
            TestUtil.waiting(1000);
            Assert.assertTrue(editCompanyStep2Header.isDisplayed(), "Edit company Step 2 Main Header Missing");
            TestUtil.highlightElement(editCompanyStep2PageHeader);
            Assert.assertTrue(editCompanyStep2PageHeader.isDisplayed(), "Company Step 2 Setting  Header missing");

            TestUtil.highlightElement(editCompanyStep2LogoHeader);
            Assert.assertEquals(editCompanyStep2LogoHeader.getText(),"Logo","Edit company Step 2 Logo Header  not Match");

            // Remove Logo and Update with new Logo
            TestUtil.highlightElement(editCompanyRemoveImageClick);
            TestUtil.click(editCompanyRemoveImageClick);
            TestUtil.waiting(2000);
            editCompanyStep2LogoInput.sendKeys(System.getProperty("user.dir") + "\\src\\main\\java\\com\\hrv1\\qa\\testdata\\Google1.png");
            TestUtil.waiting(2000);

            // Currency Edit
            TestUtil.highlightElement(editCompanyStep2CurrencyHeader);
            Assert.assertEquals(editCompanyStep2CurrencyHeader.getText(),"Currency","Edit company Step 2 Currency Header not Match");
            TestUtil.highlightElement(editCompanyStep2CurrencyClick);
            Assert.assertEquals(editCompanyStep2CurrencySelectValue.getText(),"Dollar - $","Edit company Step 2 Selected Currency not same");
            TestUtil.waiting(1000);
            TestUtil.highlightElement(editCompanyStep2CurrencyClick);
            TestUtil.click(editCompanyStep2CurrencyClick);
            TestUtil.waiting(1000);
            TestUtil.click(editCompanyStep2CurrencySelect);

            // Back And Continue button
            TestUtil.waiting(1000);
            TestUtil.highlightElement(editCompanyStep2BackBtn);
            editCompanyStep2BackBtn.click();
            TestUtil.waiting(1000);
            TestUtil.highlightElement(editCompanyStep1ContinueBtn);
            editCompanyStep1ContinueBtn.click();
            TestUtil.waiting(1000);
            TestUtil.highlightElement(editCompanyStep2ContinueBtn);
            editCompanyStep2ContinueBtn.click();


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void editCompany1Step3(){
        try {
            TestUtil.waiting(1000);
            TestUtil.highlightElement(editCompanyStep3Header);
            Assert.assertTrue(editCompanyStep3Header.isDisplayed(), "Edit company Step 3 Main Header Missing");
            TestUtil.highlightElement(editCompanyStep3PageHeader);
            Assert.assertTrue(editCompanyStep3PageHeader.isDisplayed(), "Company Step 3 Contact  Header missing");

            TestUtil.waiting(1000);
            TestUtil.highlightElement(editCompanyStep3ContactTypeHeader);
            TestUtil.waiting(1000);
//            TestUtil.highlightElement(editCompanyStep3ContactValueHeader);

            // Email
            TestUtil.highlightElement(editCompanyStep3ContactType0Click);
            Assert.assertEquals(editCompanyStep3ContactValue0EmailSelectedValue.getText(),"Email","Company Step 3 Contact Type 1 Email  Header missing");
            TestUtil.highlightElement(editCompanyStep3ContactValue0EmailInput);
            Assert.assertEquals(editCompanyStep3ContactValue0EmailInput.getAttribute("value"),data.getProperty("companyStep3ContactValue0InputEmail1"),"Edit Company Step 3 email not same");

            // Mobile No
            TestUtil.highlightElement(editCompanyStep3ContactType1MobileNoClick);
            Assert.assertEquals(editCompanyStep3ContactValue1MobileNoSelectedValue.getText(),"Mobile No","Company Step 3 Contact Type 1 Mobile No  Header missing");
            TestUtil.highlightElement(editCompanyStep3ContactMobileCountryCodeType1Click);
            Assert.assertEquals(editCompanyStep3ContactMobileCountryCodeType1SelectedValue.getText(),"India (+91)","Edit Company Step 3 Contact Type 1 Mobile No Input missing");
            TestUtil.highlightElement(editCompanyStep3ContactMobileNoValue1Input);
            Assert.assertEquals(editCompanyStep3ContactMobileNoValue1Input.getAttribute("value"),data.getProperty("companyStep3ContactValue1InputMobileNo1"),"Edit Company Step 3 Contact Type 1 Mobile No not same");

            // Phone No
            TestUtil.highlightElement(editCompanyStep3ContactType2PhoneNoClick);
            Assert.assertEquals(editCompanyStep3ContactValue2PhoneNoSelectedValue.getText(),"Phone No","Company Step 3 Contact Type 1 Phone No  Header missing");
            TestUtil.highlightElement(editCompanyStep3ContactPhoneCountryCodeType1Click);
            Assert.assertEquals(editCompanyStep3ContactPhoneCountryCodeType1SelectedValue.getText(),"India (+91)","Edit Company Step 3 Contact Type 1 Phone No Input missing");
            TestUtil.highlightElement(editCompanyStep3ContactPhoneNoValue1Input);
            Assert.assertEquals(editCompanyStep3ContactPhoneNoValue1Input.getAttribute("value"),data.getProperty("companyStep3ContactValue2InputPhoneNo1"),"Edit Company Step 3 Contact Type 1 Phone No not same");

            // Fax

            TestUtil.highlightElement(editCompanyStep3ContactType3FaxClick);
            Assert.assertEquals(editCompanyStep3ContactValue3FaxSelectedValue.getText(),"Fax","Company Step 3 Contact Type 1 Phone No  Header missing");
            TestUtil.highlightElement(editCompanyStep3ContactFaxValue1Input);
            Assert.assertEquals(editCompanyStep3ContactFaxValue1Input.getAttribute("value"),data.getProperty("companyStep3ContactValue3InputFax1"),"Edit Company Step 3 Contact Type 1 Phone No not same");

            // Website
            TestUtil.highlightElement(editCompanyStep3ContactType4WebsiteClick);
            Assert.assertEquals(editCompanyStep3ContactValue4WebSiteSelectedValue.getText(),"WebSite","Company Step 3 Contact Type 1 Phone No  Header missing");
            TestUtil.highlightElement(editCompanyStep3ContactWebsiteValue1Input);
            Assert.assertEquals(editCompanyStep3ContactWebsiteValue1Input.getAttribute("value"),data.getProperty("companyStep3ContactValue4InputWebsite1"),"Edit Company Step 3 Contact Type 1 Phone No not same");

            TestUtil.waiting(1000);
            TestUtil.highlightElement(editCompanyStep3BackBtn);
            editCompanyStep3BackBtn.click();
            TestUtil.waiting(1000);
            TestUtil.highlightElement(editCompanyStep2ContinueBtn);
            editCompanyStep2ContinueBtn.click();
            TestUtil.waiting(1000);
            TestUtil.highlightElement(editCompanyStep3ContinueBtn);
            editCompanyStep3ContinueBtn.click();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void editCompany1Step4(){
        try {
            TestUtil.waiting(1000);
            TestUtil.highlightElement(editCompanyStep4Header);
            Assert.assertTrue(editCompanyStep4Header.isDisplayed(), "Edit Company Step 4 Header missing");
            TestUtil.waiting(1000);
            TestUtil.highlightElement(editCompanyStep4PageHeader);
            Assert.assertTrue(editCompanyStep4PageHeader.isDisplayed(), "Edit Company Step 4  Configuration  Header missing");

            TestUtil.highlightElement(editCompanyStep4AcrossCompanyHeader);
            Assert.assertTrue(editCompanyStep4AcrossCompanyHeader.isDisplayed(), "Edit  Company Step 4  Across Company  Header missing");
            TestUtil.highlightElement(editCompanyStep4AcrossCompanyCheckboxSelect);
            TestUtil.actionMethod(editCompanyStep4AcrossCompanyCheckboxSelect);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(editCompanyStep4AcrossCompanyCheckboxSelect);
            TestUtil.actionMethod(editCompanyStep4AcrossCompanyCheckboxSelect);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(editCompanyStep4PrefixHeader);
            Assert.assertTrue(editCompanyStep4PrefixHeader.isDisplayed(), "Company Step4  Prefix  Header missing");
            TestUtil.highlightElement(editCompanyStep4PrefixInput);
            Assert.assertEquals(editCompanyStep4PrefixInput.getAttribute("value"), "E", "Prefix not match with the Across company filed");

            TestUtil.waiting(1000);
            TestUtil.highlightElement(editCompanyStep4TotalLengthHeader);
            Assert.assertTrue(editCompanyStep4TotalLengthHeader.isDisplayed(), "Company Step4  Prefix  Header missing");
            TestUtil.highlightElement(editCompanyStep4TotalLengthInput);
            Assert.assertEquals(editCompanyStep4TotalLengthInput.getAttribute("value"), "6", "Total Length not match with the Across company filed");

            TestUtil.waiting(1000);
            TestUtil.highlightElement(editCompanyStep4EmployeeCodeHeader);
            Assert.assertTrue(editCompanyStep4EmployeeCodeHeader.isDisplayed(), "Company Step4  Prefix  Header missing");
            TestUtil.highlightElement(editCompanyStep4EmployeeCodeInput);
            Assert.assertEquals(editCompanyStep4EmployeeCodeInput.getAttribute("value"), "E00000 - E99999", "Total Length not match with the Across company filed");

            TestUtil.waiting(1000);
            TestUtil.highlightElement(editCompanyStep4BackBtn);
            editCompanyStep4BackBtn.click();
            TestUtil.waiting(1000);
            TestUtil.highlightElement(editCompanyStep3ContinueBtn);
            editCompanyStep3ContinueBtn.click();
            TestUtil.waiting(1000);
            TestUtil.highlightElement(editCompanyStep4SaveBtn);
            editCompanyStep4SaveBtn.click();

//            TestUtil.highlightElement(editCompanySaveUpdateMessage);
//            editCompanySaveUpdateMessage.click();


        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
