package pages;

public class LoginPage extends BasePage {

    public LoginPage (){
        super(driver);
    }

    private String emailLink = "//input[@id='input-email']";
    private String passwordLink = "//input[@id='input-password']";
    private String loginButton = "//input[@value='Login']";
    private String warning = "//div[@class='alert alert-danger alert-dismissible']";


   public void login(String email, String password){
    write(emailLink, email);
    write(passwordLink, password);
   }

   public void clickLoginButton(){
    clickElement(loginButton);
   }

   public String mensageloginIncorrecto(){
    return obteneString(warning);
   }
    
}
