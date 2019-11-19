package com.example.sampleuiautomatorproject.test

import com.example.sampleuiautomatorproject.application.Ozon
import com.example.sampleuiautomatorproject.ozonPages.MainPage
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test

class CheckHintTest : AbstractApplicationTest<Ozon>(Ozon()) {

    lateinit var mainPage: MainPage

    @Before
    fun prepare() {
        app.open()
        mainPage = MainPage()
    }

    @Test
    fun checkHint() = with(app) {
        mainPage.clickSearch()
        mainPage.typeToSearch("философия java")
        mainPage.checkHintProductName("Философия Java")
        mainPage.checkHintProductPrice("1 499 \u20BD")
    }
}