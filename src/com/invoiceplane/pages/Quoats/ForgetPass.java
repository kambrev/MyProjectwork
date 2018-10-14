package com.invoiceplane.pages.Quoats;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPass {



    WebDriver driver;

    @FindBy(xpath=".//*[@id='password_reset']/form/button")
    WebElement btnforgetpass;

    @FindBy(name="email")
    WebElement txtEmail;




    public ForgetPass(WebDriver driver)

    {
        this.driver=driver;
        PageFactory.initElements(driver,this);


    }

    public void clickforget()

    {
        btnforgetpass.click();

    }


    public void setTxtEmail(String  email)
    {
        txtEmail.sendKeys(email);

    }





}
