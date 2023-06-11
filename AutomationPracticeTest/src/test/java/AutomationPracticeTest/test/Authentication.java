package AutomationPracticeTest.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import AutomationPracticeTest.Page.AuthenticationPO;

public class Authentication extends BaseTest {
    private static AuthenticationPO AuthPage;

    @Before
    public void preparaTestes() {
        AuthPage = new AuthenticationPO(driver);
    }

    @Test
    public void T001_SignInSuccess() {
        AuthPage.ClickToOpenAuthenticationPage();
        AuthPage.FillEmail("lmdos@minsait.com");
        AuthPage.FillPassword("password");
        AuthPage.ClickToSignIn();
        assertTrue(AuthPage.LBLMyAccount.isDisplayed());
    }

    @Test
    public void T002_SignInFail() {
        AuthPage.ClickToOpenAuthenticationPage();
        AuthPage.FillEmail("lmdos@minsait.com");
        AuthPage.FillPassword("password1");
        AuthPage.ClickToSignIn();
        assertEquals("Authentication failed.",
        AuthPage.RetornaMsgErroSignIn());
        assertTrue(AuthPage.MSGErroSignIn.isDisplayed());
    }   
    
    @Test
    //Só funcionará na primeira execução
    //Há uma regra de negócio que não permite 
    //fazer uma nova solicitação em menos de 360min.
    public void T003_ForgotPasswordSuccess() {
        AuthPage.ClickToOpenAuthenticationPage();
        AuthPage.ClickLinkForgotPassword();
         AuthPage.FillEmail("lmdos@minsait.com");
         AuthPage.ClickRetrievePassword();
         assertEquals("A confirmation email has been sent to your address: lmdos@minsait.com",
         AuthPage.RetornaMsgSuccessRetrievePassword());
         assertTrue(AuthPage.MSGSuccessRetrievePassword.isDisplayed());
    }
}
