package com.example.sampleuiautomatorproject.test

import com.example.sampleuiautomatorproject.application.Ozon
import com.example.sampleuiautomatorproject.ozonPages.*
import org.junit.Before
import org.junit.Test

class OzonTests : AbstractApplicationTest<Ozon>(Ozon()) {

    private lateinit var mainPage: MainPage
    private lateinit var searchPage: SearchPage
    private lateinit var productPage: ProductPage
    private lateinit var favouritesPage: FavouritesPage
    private lateinit var registrationPage: RegistrationPage

    private val testBookName = "Философия Java"
    private val testSearch = "философия java"
    private val testPrice = "1 499 \u20BD"
    private val validLogin = "qwe@r.ty"
    private val invalidLogin = "qwe"

    @Before
    fun prepare() {
        app.open()
        mainPage = MainPage()
        searchPage = SearchPage()
        productPage = ProductPage()
        favouritesPage = FavouritesPage()
        registrationPage = RegistrationPage()
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
        searchPage.clickHint(testBookName)
        productPage.clickHeart()
        productPage.gotoFavourites()
        favouritesPage.checkTitle()
        favouritesPage.findProductInFavourites(testBookName)
    }

    @Test
    fun mailValidationTest() = with(app) {
        mainPage.gotoCabinet()
        registrationPage.clickLoginByMail()
        registrationPage.enterLogin(invalidLogin)
        registrationPage.clickLoginButton()
        registrationPage.checkIsEmailError()
        registrationPage.enterLogin(validLogin)
        registrationPage.clickLoginButton()
        registrationPage.checkNoEmailError()
    }

    @Test
    fun feedbackWithoutLogin() = with(app) {
        mainPage.clickSearch()
        searchPage.typeToSearch(testSearch)
        searchPage.clickHint(testBookName)
        productPage.scrollToFeedback()
        productPage.clickFeedbackButton()
        registrationPage.checkTitle()
    }
}