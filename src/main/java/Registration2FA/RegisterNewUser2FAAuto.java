package main.java.Registration2FA;

import main.java.ConfigFile.ConfigAuto;
import main.java.Login.LoginAuto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Objects;

public class RegisterNewUser2FAAuto extends ConfigAuto {

    @Test(dataProvider = "dataProvider1")
    public void RegisterAuto(String uname1, String Pwd1, String CPwd1) {

        WebDriver driver = configAuto1();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/nav/ul[2]/li[1]/a")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("/html/body/main/div/div/div/div/div/div[2]/div/p[1]/a")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().back();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("email")).sendKeys(uname1);
        driver.findElement(By.id("password")).sendKeys(Pwd1);
        driver.findElement(By.xpath("//i[@id='eye2']")).click();
        driver.findElement(By.id("confirm-password")).sendKeys(CPwd1);
        driver.findElement(By.xpath("//i[@id='eye3']")).click();
        driver.findElement(By.className("btn-register")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement msg = driver.findElement(By.xpath("//div[@class='header']"));
        String text = msg.getText();
        System.out.println(text);
        String expectedText = "Oops! something wasn't correct";
        Assert.assertEquals(text, expectedText);

        if (text.equals(expectedText)) {

            System.out.println("Matched");
            driver.findElement(By.xpath("/html/body/main/div/div/div/div/div/div[2]/div/p[2]/a")).click();
            driver.getTitle();
        } else if(Objects.equals(driver.getTitle(), "Thank you!")){

            System.out.println("Registration success");
            driver.navigate().back();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();


    }

    @DataProvider
    public Object[][] dataProvider1() {


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        Object[][] data1 = new Object[6][3];
        //1st set
        data1[0][0] = "qa11177@yopmail.com";
        data1[0][1] = "Qa123!";
        data1[0][2] = "Qa123!";
        //2nd set
        data1[1][0] = "qa222@yopmail.com";
        data1[1][1] = "Qa123!";
        data1[1][2] = "Qa123!";
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //3rd set
        data1[2][0]="qa333888@yopmail.com";
        data1[2][1]="Qa123!";
        data1[2][2]="Qa123!";

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //4th set
        data1[3][0]="qa444222@yopmail.com";
        data1[3][1]="Qa123!";
        data1[3][2]="Qa123!";

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //5th set
        data1[4][0]="qa555111@yopmail.com";
        data1[4][1]="Qa123!";
        data1[4][2]="Qa123!";

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //6th set
        data1[5][0]="qa222@yopmail.com";
        data1[5][1]="Qa123!";
        data1[5][2]="Qa123!";

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return data1;


    }




}
