package com.example.sampleuiautomatorproject.ozonPages

import com.example.sampleuiautomatorproject.util.byResourceId
import com.example.sampleuiautomatorproject.util.byText
import com.example.sampleuiautomatorproject.util.ext.waitFindObject
import com.example.sampleuiautomatorproject.util.ext.waitUntillGone
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue

class RegistrationPage {
    private val loginByMail = byText("Войти по почте")
    private val loginField = byResourceId("ru.ozon.app.android:id/emailEt")
    private val loginButton = byText("Войти")
    private val emailFormatError = "Некорректный формат почты"
    private val title = "Вход или регистрация"
    private val titleElement = byResourceId("ru.ozon.app.android:id/titleTv")


    fun clickLoginByMail() {
        loginByMail.waitFindObject().click()
    }

    fun enterLogin(login: String) {
        loginField.waitFindObject().text = login
    }

    fun clickLoginButton() {
        loginButton.waitFindObject().click()
    }

    fun checkIsEmailError() {
        assertTrue(
            "There no email format error",
            byText(emailFormatError).waitFindObject().isEnabled
        )
    }

    fun checkNoEmailError() {
        assertTrue("There is email format error", byText(emailFormatError).waitUntillGone())
    }

    fun checkTitle() {
        assertEquals("It is not registration page", titleElement.waitFindObject().text, title)
    }
}