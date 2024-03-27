package pages;

public class MyAccount extends BasePage {
    
    public MyAccount(){
        super(driver);
    }

    private String textMyAccount = "//h2[normalize-space()='My Account']";

    public String obtenerTextMyAccount(){
        return obteneString(textMyAccount);
       } 
}
