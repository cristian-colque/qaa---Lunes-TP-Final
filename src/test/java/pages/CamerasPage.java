package pages;

public class CamerasPage extends BasePage {
    public CamerasPage(){
        super(driver);
    }

    private String addToWishList = "//button[@onclick=\"wishlist.add('30');\"]";
    private String wishList = "//a[normalize-space()='wish list']";
    private String textCamera = "//a[normalize-space()='Canon EOS 5D']";
    private String textCanon = "//div[@class='caption']//a[contains(text(),'Canon EOS 5D')]";
    private String option = "//select[@id='input-option226']";
    private String buttonAdd = "//button[@id='button-cart']";
    private String shoppingCart = "//a[normalize-space()='shopping cart']";
    private String canonLink = "//div[@class='image']//img[@title='Canon EOS 5D']";
    private String cart = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']";
    private String viewCart = "//strong[normalize-space()='View Cart']";
  
  
    
    public void clickAddToWishListLink(){
        clickElement(addToWishList);
    }

    public void clickWishListLink(){
        clickElement(wishList);
    }

    public String obtenerTextCamera(){
        return obteneString(textCamera);
    }

    public void clickChooseOption(){
        selectFromDropdownByValue(option,"Blue");
    }

    public void clickOption(){
        selectFromDropdownByIndex(option, 1);
    }

    public void clickAddToCart(){
        clickElement(buttonAdd);
    }
    
    public void clickShoppingCart(){
        clickElement(shoppingCart);
    }

    public void clickCanonCamera(){
        clickElement(canonLink);
    }

    public String obtenerTextCanon(){
        return obteneString(textCanon);
    }

    public void clickCart(){
        clickElement(cart);
    }

    public void clickViewCart(){
        clickElement(viewCart);
    }
}

