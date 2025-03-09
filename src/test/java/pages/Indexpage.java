package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Indexpage {
        
        WebDriver ldriver;
    
        //Create Constructor-method to initialize object
        public Indexpage(Webdriver rdriver){
            ldriver=rdriver;
            PageFactory.initElements(rdriver,this);
    }

    //Identify the webelement of the page
    @FindBy(linkText = "Sign in");
    WebElement signin;
    //Identify the action on element
    public void click_SignIn() {
        signin.click();
    }
    
}
