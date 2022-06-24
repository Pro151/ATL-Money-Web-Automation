package main.java.Login2FA;


import main.java.ConfigFile.ConfigAuto;
import main.java.Login.LoginAuto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TwoFactorAuthAuto extends LoginAuto {

    public void TwofactAuth() {

        WebDriver driver = configAuto1();

        driver.findElement(By.className("login-btn")).click();
        driver.findElement(By.id("email")).sendKeys("qa222@yopmail.com");
        driver.findElement(By.id("inputPassword")).sendKeys("Qa123!");
        driver.findElement(By.xpath("//i[@id='eye']")).click();
        driver.findElement(By.className("btn-login")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 1; i <= 4; i++) {
            driver.findElement(By.xpath("//button[@data-value='2']")).click();
        }
        driver.findElement(By.className("btn-success")).click();


    }
}
