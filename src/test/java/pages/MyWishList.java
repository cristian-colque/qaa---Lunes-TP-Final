package pages;

public class MyWishList extends BasePage {
    public MyWishList(){
        super(driver);
    }

    private String productName = "//a[normalize-space()='Canon EOS 5D']";

    public String obtenerTextProductName(){
        return obteneString(productName);
    }
    
}
