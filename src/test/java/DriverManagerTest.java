import org.com.automationPractice.Pages.LoginPage;
import org.testng.annotations.Test;



public class DriverManagerTest {


    @Test
    public void testLoginPage()
    {
        LoginPage loginPage = new LoginPage();
        loginPage.clickLoginIcon();
        loginPage.sendUserNameValue("joaquinjqn2@gmail.com");
        loginPage.sendUserPassword("Pass1234");
        loginPage.clickLoginButton();
    }
}
