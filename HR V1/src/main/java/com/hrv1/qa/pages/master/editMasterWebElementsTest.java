package com.hrv1.qa.pages.master;

import com.hrv1.qa.base.TestBase;
import com.hrv1.qa.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//public class editMasterWebElementsTest extends TestBase {
//
//    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\java\\com\\hrv1\\qa\\resources\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        driver.navigate().to("http://161.35.162.46:9097/");
//        driver.findElement(By.xpath("//input[@id='Login_Id']")).sendKeys("Rohit-FF");
//        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
//        driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
//
//        Thread.sleep(10000);
//        driver.findElement(By.xpath("//span[contains(text(),'Masters')]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("(//span[contains(text(),'Company')])[1]")).click();
//
//
////        WebElement previous = driver.findElement(By.xpath("//a[contains(text(),'Previous')]"));
//        Thread.sleep(2000);
//        WebElement next = driver.findElement(By.xpath("//a[contains(text(),'Next')]"));
////        next.click();
//
////        WebElement nextDisable = driver.findElement(By.xpath("//li[@class='pagination-next ng-star-inserted disabled']"));
//        Thread.sleep(2000);
//
//        while (TestUtil.isElementPresent(next)){
//            List<WebElement> rws = driver.findElements(By.xpath("//th[contains(text(),'Company')]/../../..//tbody//tr"));
//            for (int i = 0; i < rws.size(); i++){
//                List<WebElement> companyNameColumnList  = driver.findElements(By.xpath("//th[contains(text(),'Company')]/../../..//tbody//tr//td//div[2]"));
//                String name = companyNameColumnList.get(i).getText();
//                System.out.println("--------------"+ name);
//                String companyName = "L & T Infotech";
//                if (name.equals(companyName)){
//                    System.out.println("Company verified");
//                }
//            }
////                    WebElement next = driver.findElement(By.xpath("//a[contains(text(),'Next')]"));
//
//            next.click();
//            Thread.sleep(4000);
//
//        }
//
//
////        List<WebElement> rws = driver.findElements(By.xpath("//th[contains(text(),'Company')]/../../..//tbody//tr"));
////        for (int i = 0; i < rws.size(); i++) {
////            List<WebElement> cols = driver.findElements(By.xpath("//th[contains(text(),'Company')]/../../..//tbody//tr//td//div[2]"));
////            String name = cols.get(i).getText();
////            System.out.println("The cell value is: " + name);
//
//
//
//
//
//
////        List<WebElement> companyNameList = driver.findElements(By.xpath("//th[contains(text(),'Company')]/../../..//tbody//tr//td//div[2]"));
//
//
////        WebElement t = driver.findElement(By.xpath("//*[@id='table1']/tbody"));
////        // count rows with size() method
////        List<WebElement> rws = t.findElements(By.tagName("tr"));
////        int rws_cnt = rws.size();
////        //iterate rows of table
////        for (int i = 0;i < rws_cnt; i++) {
////            // count columns with size() method
////            List<WebElement> cols = rws.get(i).findElements(By.tagName("td"));
////            int cols_cnt = cols.size();
////            //iterate cols of table
////            for (int j = 0;j < cols_cnt; j++) {
////                // get cell text with getText()
////                String c = cols.get(j).getText();
////                System.out.println("The cell value is: " + c);
////            }
//
//
//        }
//    }



