package com.example.sampleuiautomatorproject.test

import com.example.sampleuiautomatorproject.application.Ozon
import com.example.sampleuiautomatorproject.ozonPages.FavouritesPage
import com.example.sampleuiautomatorproject.ozonPages.MainPage
import com.example.sampleuiautomatorproject.ozonPages.ProductPage
import com.example.sampleuiautomatorproject.ozonPages.SearchPage
import org.junit.Before
import org.junit.Test

class OzonTests : AbstractApplicationTest<Ozon>(Ozon()) {

    private lateinit var mainPage: MainPage
    private lateinit var searchPage: SearchPage
    private lateinit var productPage: ProductPage
    private lateinit var favouritesPage: FavouritesPage

    private val testBookName = "Философия Java"
    private val testSearch = "философия java"
    private val testPrice = "1 499 \u20BD"

    @Before
    fun prepare() {
        app.open()
        mainPage = MainPage()
        searchPage = SearchPage()
        productPage = ProductPage()
        favouritesPage = FavouritesPage()
    }

    @Test
    fun checkHintTest() = with(app) {
        mainPage.clickSearch()
        searchPage.typeToSearch(testSearch)
        searchPage.checkHintProductName(testBookName)
        searchPage.checkHintProductPrice(testPrice)
    }

    @Test
    fun chooseFavouriteTest() = with(app) {
        mainPage.clickSearch()
        searchPage.typeToSearch(testSearch)
        searchPage.checkHintProductName(testBookName)
        searchPage.clickHint(testBookName)
        productPage.clickToFavourites()
        productPage.clickFavourites()
        favouritesPage.checkTitle()
        favouritesPage.findProductInFavourites(testBookName)
    }
}