package pages;

public class ShoppingCart extends BasePage{
    public ShoppingCart(){
        super(driver);
    }

    //private String productCamera = "//div[@id='cart']//a[text()='Canon EOS 5D']";
    
    private String precioProductCamera = "//tbody//tr//td[6]";                
                             
    public String obtenerTextCameraAdd(){
        return obteneString(precioProductCamera);
    }

    public boolean cameraIsDisplayed(){
        return elementIsDisplayed(precioProductCamera);
    }
    
    
}
