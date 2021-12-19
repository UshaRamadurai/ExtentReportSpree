package com.spree.tests;

import com.spree.core.BaseTest;
import com.spree.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductTwoTest extends BaseTest {
    @Test
    public void SearchProductApache(){
        HomePage homepage = new HomePage(driver);
        homepage.searchProducts("apache");
        Assert.assertEquals(homepage.getSearchResultsTitle(),"Search results for 'apache'");
    }
    @Test
    public void SearchProductSpree(){
        HomePage homepage = new HomePage(driver);
        homepage.searchProducts("spree");
        Assert.assertEquals(homepage.getSearchResultsTitle(),"Search results for 'spree'");
    }

}
