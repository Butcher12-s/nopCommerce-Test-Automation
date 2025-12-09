package Tests;

import Pages.Homepage;
import Pages.Registerpage;
import org.testng.annotations.Test;

public class UserRegistertionTest extends Testsbase {

    Homepage homepage;
    Registerpage registerpage;
    @Test
    public void validateRegisteration()
    {
        homepage=  new Homepage(driver);
        homepage.Openregisteration();
        registerpage= new Registerpage(driver);
        registerpage.Registerationconfirm("omar","Butcher","omarbutcher59@gmail.com","123456","123456");
    }


}
