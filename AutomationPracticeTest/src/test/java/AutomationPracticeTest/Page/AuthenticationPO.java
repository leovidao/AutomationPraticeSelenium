package AutomationPracticeTest.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPO extends BasePO{
    
    public AuthenticationPO(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='login']")
    public WebElement BTNOpenAuthenticationPage;

    @FindBy(id = "email")
    public WebElement INPEmail;

    @FindBy(id = "passwd")
    public WebElement INPPassword;    

    @FindBy(id = "SubmitLogin")
    public WebElement BTNSubmitLogin;  

    @FindBy(xpath = "//*[@id='center_column']/h1")
    public WebElement LBLMyAccount;

    @FindBy(xpath = "//*[@id='center_column']/div[1]/ol/li")
    public WebElement MSGErroSignIn;

    @FindBy(xpath = "//*[@id='login_form']/div/p[1]/a")
    public WebElement lnkForgotPassword;

    @FindBy(xpath = "//p[@class='submit']/button")
    public WebElement BTNRetrievePassword;    

    @FindBy(xpath = "//p[@class='alert alert-success']")
    public WebElement MSGSuccessRetrievePassword;    
    

    public void ClickToOpenAuthenticationPage() {
        BTNOpenAuthenticationPage.click();
    }

    public void FillEmail(String email) {
        INPEmail.sendKeys(email);
    }

    public void FillPassword(String password) {
        INPPassword.sendKeys(password);
    }

    public void ClickToSignIn() {
        BTNSubmitLogin.click();
    }

    public String RetornaMsgErroSignIn() {
        return MSGErroSignIn.getText();
    }

    public void ClickLinkForgotPassword() {
        lnkForgotPassword.click();
    }

    public void ClickRetrievePassword() {
        BTNRetrievePassword.click();
    }

    public String RetornaMsgSuccessRetrievePassword() {
        return MSGSuccessRetrievePassword.getText();
    }
}
