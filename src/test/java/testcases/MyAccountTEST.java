package testcases;

import pages.Indexpage;
import pages.MyAccount;

public class MyAccountTEST extends Baseclass{
    public void verifyRegistrationandlogin(){

driver.get(url);
logger.info("Url is open");

//sign in
Indexpage ip = new Indexpage(driver);
ip.click_SignIn();

//myaccount page

MyAccount MA= new MyAccount(driver);
MA.send_Email("adityakalbandhe01+123@gmail.com");
MA.Click_Email(0);

    }

    
}
