package Regression;

import com.invoiceplane.pages.Quoats.Login;
import com.invoiceplane.utility.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.ResourceBundle;

import static com.invoiceplane.utility.Driver.getDriver;

public class LoginTest {

    WebDriver driver = getDriver(Driver.DriverTypes.CHROME);

        @Test
         public void LoginTest()

          {

            ResourceBundle dbDetails = ResourceBundle.getBundle("Invoiceplane");
            String url=dbDetails.getString("url");
            driver.get(url);
              Login login=new Login(driver);
              login.setTxtEmail("someusername");
              login.setTxtPassword("somepass");



              login.clickLogin();





        }
    }

