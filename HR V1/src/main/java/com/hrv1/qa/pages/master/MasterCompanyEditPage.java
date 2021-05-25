package com.hrv1.qa.pages.master;

import com.hrv1.qa.base.TestBase;
import com.hrv1.qa.pages.login.LoginPage;
import com.hrv1.qa.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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



    public void companyVerified(){
        try {
            while (!TestUtil.isElementPresent(companyListNextButtonDisable)){
                List<WebElement> rws = driver.findElements(By.xpath("//th[contains(text(),'Company')]/../../..//tbody//tr"));
                for (int i = 0; i < rws.size(); i++){
                    List<WebElement> companyNameColumnList  = driver.findElements(By.xpath("//th[contains(text(),'Company')]/../../..//tbody//tr//td//div[2]"));
                    String name = companyNameColumnList.get(i).getText();
                    System.out.println("--------------"+ name);
//                    String companyName = "L & T Infotech";
                    if (name.equals(data.getProperty("addCompanyStep1NameInput1"))){
                        System.out.println("Company verified");
                    }
                }companyListNextButton.click();
                TestUtil.waiting(2000);

            }
//            TestUtil.highlightElement(hrUsernameInput);
//            TestUtil.waiting(1000);
        }catch (Exception e){
            e.printStackTrace();
        }


    }



}
