package com.spree.tests;

import com.spree.core.BaseTest;
import com.spree.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductOneTest extends BaseTest {
    @Test
    public void SearchProductRuby(){
        HomePage homepage = new HomePage(driver);
        homepage.searchProducts("ruby");
        Assert.assertEquals(homepage.getSearchResultsTitle(),"Search results for 'ruby'");
    }
    @Test
    public void SearchProductRails(){
        HomePage homepage = new HomePage(driver);
        homepage.searchProducts("rails");
        Assert.assertEquals(homepage.getSearchResultsTitle(),"Search results for 'rails'");
    }
}
