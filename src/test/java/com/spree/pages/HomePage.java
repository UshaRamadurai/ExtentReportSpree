package com.spree.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(id = "keywords")
    private WebElement searchField;

    @FindBy(css = "[data-disable-with='Search']")
    private WebElement searchButton;

    @FindBy(className = "search-results-title")
    private WebElement searchResultsTitle;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
     public void searchProducts(String searchText){
        searchField.sendKeys(searchText);
    }
    public String getSearchResultsTitle(){
        return searchResultsTitle.getText();
    }

}
