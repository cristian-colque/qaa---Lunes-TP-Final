package pages;

public class NarBar extends BasePage {
    
    public NarBar(){
        super(driver);
    }

    private String sectionLink = "//a[normalize-space()='%s']";
   
    public void clickOnSectionCampos(String campos) {
        String xpathSection = String.format(sectionLink, campos);
        clickElement(xpathSection);      
    }

    public void clickSectionCamara(){
        String xpathSection = String.format(sectionLink,"Cameras");
        clickElement(xpathSection);    
    }
}
