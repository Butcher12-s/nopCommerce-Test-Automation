package Tests;

import Pages.Homepage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class UserLoginTest extends Testsbase {

    Homepage homepage;
    LoginPage loginpage;
    @Test
    public void validateLogin()
    {
        homepage=  new Homepage(driver);
        homepage.Openloginpage();

        loginpage= new LoginPage(driver);
        loginpage.loginconfirm("omarbutcher59@gmail.com","123456");

    }
}
