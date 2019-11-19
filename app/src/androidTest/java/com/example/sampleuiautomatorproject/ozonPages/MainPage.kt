package com.example.sampleuiautomatorproject.ozonPages

import com.example.sampleuiautomatorproject.util.byText
import com.example.sampleuiautomatorproject.util.ext.waitFindObject

class MainPage {
    private val searchSelector = byText("Искать на Ozon")

    fun clickSearch() {
        searchSelector.waitFindObject().click()
    }
}