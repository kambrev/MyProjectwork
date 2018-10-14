package Regression;

import com.invoiceplane.pages.Quoats.ForgetPass;
import com.invoiceplane.pages.Quoats.Login;
import com.invoiceplane.utility.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.ResourceBundle;

import static com.invoiceplane.utility.Driver.getDriver;

public class ForgetPassTest {

    WebDriver driver = getDriver(Driver.DriverTypes.CHROME);

    @Test
    public void ForgetPassTest()

    {

        ResourceBundle dbDetails = ResourceBundle.getBundle("Invoiceplane");
        String url=dbDetails.getString("url");
        driver.get(url);
        Login login=new Login(driver);

        login.clickForgotPass();

        ForgetPass forgetPass=new ForgetPass(driver);
        forgetPass.setTxtEmail("ABV@Gmail.com");
        forgetPass.clickforget();








    }
}



