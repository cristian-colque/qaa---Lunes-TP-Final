package pages;


public class RegisterPage extends BasePage {

    private String firstNameLink = "//input[@id='input-firstname']";
    private String textName = "//div[contains(text(),'First Name must be between 1 and 32 characters!')]";
    private String lastNameLink = "//input[@id='input-lastname']";
    private String emailLink = "//input[@id='input-email']";
    private String telephoneLink= "//input[@id='input-telephone']";
    private String passwordLink = "//input[@id='input-password']";
    private String passwordConfirm = "//input[@id='input-confirm']";
    private String policy = "//input[@name='agree']";
    private String buttonContinue = "//input[@value='Continue']";
    private String textAccountCreated = "//p[contains(text(),'Congratulations! Your new account has been success')]";

    public RegisterPage() {
        super(driver);
    }
    
    public void registerUserInvalido(){
        write(firstNameLink, " ");
        write(lastNameLink, faker.name().lastName());
        write(emailLink, faker.internet().emailAddress());
        write(telephoneLink, faker.phoneNumber().phoneNumber() );
        write(passwordLink, "1234");
        write(passwordConfirm, "1234");

    }

    public void registerUserValido(){
        write(firstNameLink, faker.name().firstName());
        write(lastNameLink, faker.name().lastName());
        write(emailLink, faker.internet().emailAddress());
        write(telephoneLink, faker.phoneNumber().phoneNumber());
        write(passwordLink, "1234");
        write(passwordConfirm, "1234");

    }
    public void clickButtonAcceptPolicy(){
        clickElement(policy);
    } 

    public void clickButtonContinue(){
        clickElement(buttonContinue);
    }

    public String obtenerTextAccountCreated(){
        return obteneString(textAccountCreated);
    }

    public String obtenerTextName(){
        return  obteneString(textName);
    }
    
}
