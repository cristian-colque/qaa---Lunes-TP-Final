package pages;

public class ShoppingCart extends BasePage{
    public ShoppingCart(){
        super(driver);
    }

    private String productCamera = "/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]";
    //div[@id='cart']//a[text()='Canon EOS 5D']
                            
                             
    public String obtenerTextCameraAdd(){
        return obteneString(productCamera);
    }
    
}
