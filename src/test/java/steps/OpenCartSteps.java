package steps;

import org.testng.Assert;
import io.cucumber.java.en.*;
import pages.CamerasPage;
import pages.LoginPage;
import pages.MyAccount;
import pages.MyWishList;
import pages.NarBar;
import pages.PrincipalPage;
import pages.RegisterPage;
import pages.ShoppingCart;

public class OpenCartSteps {
    PrincipalPage landingPage = new PrincipalPage();
    NarBar bar = new NarBar();
    LoginPage login = new LoginPage();
    MyAccount account = new MyAccount();
    RegisterPage register = new RegisterPage();
    CamerasPage camera = new CamerasPage();
    MyWishList list = new MyWishList();
    ShoppingCart cart = new ShoppingCart();
    
    @Given("el usuario navega a openCart")
    public void navegatePage() {
        landingPage.navigateToOpenCart();
        
    }

    @When("^el usuario navega a las (.*) usando barra de navegacion$")
    public void navegateForNavBar(String secction){
        bar.clickOnSectionCampos(secction);
    }
    
    @Then("se debe validar pagina de inicio")
    public void validateHome() {
        
       Assert.assertTrue(landingPage.seekerIsDisplayed(), "El buscador no se ha renderizado correctamente.");
       Assert.assertTrue(landingPage.carruselIsDisplayed(), "El carrusel no se ha renderizado correctamente.");
       Assert.assertTrue(landingPage.myAccountIsDisplayed(), "my account no se ha renderizado correctamente.");   
    }

    @When("navega a la pagina de login")
    public void navegateLogin(){
        landingPage.clickMyAccount();
        landingPage.clickLogin();
    }

   @And("^ingresa sus datos (.*) y (.*)$")
    public void enterData(String email, String password){
        login.login(email, password);
        login.clickLoginButton();
    }

    @Then("validar que el usuario a ingresado a su cuenta")
        public void validateLoginCorrect(){
            String textActual = account.obtenerTextMyAccount();
            Assert.assertEquals(textActual,"My Account");

    }

    @Then("validar que el usuario a ingreso sus datos de forma incorrecta")
        public void validateLoginIncorrecto(){
            String textActual = login.mensageloginIncorrecto();
            Assert.assertEquals(textActual,"Warning: No match for E-Mail Address and/or Password.");

        }
    @When("navega a la pagina de registro")
        public void navegateRegister(){
            landingPage.clickMyAccount();
            landingPage.clickRegister();
    }

    @And("y se registra de forma correcta")
        public void enterData(){
            register.registerUserValido();
            register.clickButtonAcceptPolicy();
            register.clickButtonContinue();

        }
    @Then("validar registro correcto")
        public void successfulRegistration(){
            String textObtenido = register.obtenerTextAccountCreated();
            Assert.assertEquals(textObtenido,"Congratulations! Your new account has been successfully created!");

        }
    @And("se registra de forma incorrecta")
    public void enterDataInvalid(){
        register.registerUserInvalido();
        register.clickButtonAcceptPolicy();
        register.clickButtonContinue();

    }
    @Then("validar registro incorrecto")
        public void invalidRegistration(){
            String textObtenido = register.obtenerTextName();
            Assert.assertEquals(textObtenido,"First Name must be between 1 and 32 characters!");
        }

    @And("agrega un producto a la lista de deseos")
        public void chooseProduct(){
            bar.clickSectionCamara();
            camera.clickAddToWishListLink();
            camera.clickWishListLink();

        } 
    @Then("validar que el producto se a agregado a la lista de deseos")
        public void validateAddProduct(){
            String textProductoAgregado = camera.obtenerTextCamera();
            String textProductoLista = list.obtenerTextProductName();
            Assert.assertEquals(textProductoAgregado, textProductoLista);
        }
    @And("agregar un producto al carrito")
        public void addToCart(){
            bar.clickSectionCamara();
            camera.clickCanonCamera();
            camera.clickOption();
            camera.clickAddToCart();
            camera.clickCart();
            camera.clickViewCart();
        }
    
    @Then("validar que el producto se a agregado al carrito")
        public void validateAddToProduct(){
         
            //String textProductoCarro = cart.obtenerTextCameraAdd();
            //Assert.assertEquals(textProductoCarro, "Canon EOS 5D");
            Assert.assertTrue(cart.cameraIsDisplayed());
        }
}


