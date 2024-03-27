package pages;



public class PrincipalPage extends BasePage {
    private String seeker = "//input[@placeholder='Search']";
    private String carrusel ="//div[@id='content']";
    private String myAccount = "//i[@class='fa fa-user']";
    private String login    = "//a[text()=\"Login\"]";
    private String selectMyAccount = "//span[@class='caret']";
    private String register = "//a[text()='Register']";
    
    public PrincipalPage() {
        super(driver);
    }

    public void navigateToOpenCart() {
        navigateTo("https://opencart.abstracta.us/");
    }
    
    public void clickOnElegirMyAccount() {
        selectFromDropdownByValue(selectMyAccount, "Register");
    }
    
    public void clickMyAccount(){
        clickElement(myAccount);
    }
    public void clickLogin(){
        clickElement(login);
    }

    public void clickRegister(){
        clickElement(register);
    }

    public boolean seekerIsDisplayed(){
        return elementIsDisplayed(seeker);
    }

    public boolean carruselIsDisplayed(){
        return elementIsDisplayed(carrusel);
    }

    public boolean myAccountIsDisplayed(){
        return elementIsDisplayed(myAccount);
    }   
}
