package com.example.sampleuiautomatorproject.ozonPages

import com.example.sampleuiautomatorproject.util.byResourceId
import com.example.sampleuiautomatorproject.util.byText
import com.example.sampleuiautomatorproject.util.ext.waitFindObject

class MainPage {
    private val searchSelector = byText("Искать на Ozon")
    private val cabinet = byResourceId("ru.ozon.app.android:id/menu_profile")

    fun clickSearch() {
        searchSelector.waitFindObject().click()
    }

    fun gotoCabinet() {
        // если не дождаться прогрузки элементов экрана, откроется другой экран регистрации оО
        searchSelector.waitFindObject()
        cabinet.waitFindObject().click()
    }
}