package main.java.Login;

import main.java.ConfigFile.ConfigAuto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginAuto extends ConfigAuto {



    public LoginAuto loginA(){

        WebDriver driver=configAuto1();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.className("login-btn")).click();
        driver.findElement(By.id("email")).sendKeys("qa222@yopmail.com");
        driver.findElement(By.id("inputPassword")).sendKeys("Qa123!");
        driver.findElement(By.xpath("//i[@id='eye']")).click();
        driver.findElement(By.className("btn-login")).click();


        return null;
    }



}
