package Utilites;

import Pages.Login;

import org.openqa.selenium.WebDriver;

/**
 * Created by laxmikant on 18/05/2017.
 */
public class LoginFunction {
    static WebDriver driver;

    public static void LogFunction(WebDriver driver)
    {

        Login loginConsole =new Login(driver);
        loginConsole.clearLoginID();
        loginConsole.setLoginID("architect");
        loginConsole.clearPass();
        loginConsole.setPass("Autodcr@123");
        loginConsole.clickSubmit();


    }



    public static void ScrutinyFunction(WebDriver driver)
    {

        Login loginConsole =new Login(driver);
        loginConsole.clearLoginID();
        loginConsole.setLoginID("buildinsp");
        loginConsole.clearPass();
        loginConsole.setPass("Autodcr@123");
        loginConsole.clickSubmit();


    }

   /* public static void DFO_LogFunction(WebDriver driver)
    {

        LoginConsole loginConsole =new LoginConsole(driver);
        loginConsole.setUsername("deputycfo");
        loginConsole.setPassword("Admin@123");
        loginConsole.ClickLoginBtn();


    }

    public static void DFOnag_LogFunction(WebDriver driver)
    {

        LoginConsole loginConsole =new LoginConsole(driver);
        loginConsole.setUsername("dfonagpur");
        loginConsole.setPassword("Admin@123");
        loginConsole.ClickLoginBtn();


    }

    public static void CFO_LogFunction(WebDriver driver)
    {

        LoginConsole loginConsole =new LoginConsole(driver);
        loginConsole.setUsername("Cfofficer");
        loginConsole.setPassword("Admin@123");
        loginConsole.ClickLoginBtn();


    }


    public static void PC_LogFunction(WebDriver driver)
    {

        LoginConsole loginConsole =new LoginConsole(driver);
        loginConsole.setUsername("support@1");
        loginConsole.setPassword("Admin@123");
        loginConsole.ClickLoginBtn();


    }

    public static void SC_LogFunction(WebDriver driver)
    {

        LoginConsole loginConsole =new LoginConsole(driver);
        loginConsole.setUsername("scrutinycell8");
        loginConsole.setPassword("Admin@123");
        loginConsole.ClickLoginBtn();


    }

    public static void SPA_LogFunction(WebDriver driver)
    {

        LoginConsole loginConsole =new LoginConsole(driver);
        loginConsole.setUsername("apamravati");
        loginConsole.setPassword("Admin@123");
        loginConsole.ClickLoginBtn();


    }
    public static void SV_LogFunction(WebDriver driver)
    {

        LoginConsole loginConsole =new LoginConsole(driver);
        loginConsole.setUsername("apamravatisite");
        loginConsole.setPassword("Admin@123");
        loginConsole.ClickLoginBtn();


    }

    public static void MIDCPA_LogFunction(WebDriver driver)
    {

        LoginConsole loginConsole =new LoginConsole(driver);
        loginConsole.setUsername("midcpayment");
        loginConsole.setPassword("Admin@123");
        loginConsole.ClickLoginBtn();


    }

    public static void JCO_LogFunction(WebDriver driver)
    {

        LoginConsole loginConsole =new LoginConsole(driver);
        loginConsole.setUsername("jointcfo");
        loginConsole.setPassword("Admin@123");
        loginConsole.ClickLoginBtn();


    }
    public static void CfO_LogFunction(WebDriver driver)
    {

        LoginConsole loginConsole =new LoginConsole(driver);
        loginConsole.setUsername("Cfofficer");
        loginConsole.setPassword("Admin@123");
        loginConsole.ClickLoginBtn();


    }*/
}
