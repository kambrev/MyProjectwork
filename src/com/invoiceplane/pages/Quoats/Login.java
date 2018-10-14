package com.invoiceplane.pages.Quoats;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {



        WebDriver driver;

        @FindBy(name="email")
         WebElement txtEmail;

        @FindBy(name="password")
         WebElement txtpassword;

         @FindBy(xpath=".//*[@id='login']/form/button")
         WebElement btnLogin;


          @FindBy(xpath=".//*[@id='login']/form/a")
          WebElement lnkforgetpass;


         public Login(WebDriver driver)

         {
             this.driver=driver;
             PageFactory.initElements(driver,this);


         }

         public void setTxtEmail(String username)
         {
             txtEmail.sendKeys(username);

         }

         public void setTxtPassword(String password)
         {
             txtpassword.sendKeys(password);

         }

         public void clickLogin()

         {
             btnLogin.click();

         }
    public void clickForgotPass()

    {
        lnkforgetpass.click();

    }










}


