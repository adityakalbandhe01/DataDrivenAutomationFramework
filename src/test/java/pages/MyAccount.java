package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
    
    WebDriver ldriver;
    
        //Create Constructor-method to initialize object
        public MyAccount(Webdriver rdriver){
            ldriver=rdriver;
            PageFactory.initElements(rdriver,this);

            @FindBy(id="email_create")
            WebElement createemail;
          
            @FindBy(id="SubmitCreate")
            WebElement submitemail;


            public void send_Email(String email){
          //   createemail.sendKeys("adityakalbandhe01+123@gmail.com")
            createemail.sendKeys(email);
            public void Click_Email(0){
                submitemail.click();

            }
             
            }
}
