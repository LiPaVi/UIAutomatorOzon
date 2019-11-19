package com.example.sampleuiautomatorproject.ozonPages

import com.example.sampleuiautomatorproject.util.byStringRes
import com.example.sampleuiautomatorproject.util.byText
import com.example.sampleuiautomatorproject.util.ext.waitFindObject
import org.junit.Assert.assertTrue

class MainPage {
    private val searchSelector = byText("Искать на Ozon")
    private val searchInputSelector = byStringRes("ru.ozon.app.android:id/search_src_text")

    fun clickSearch() {
        searchSelector.waitFindObject().click()
    }

    fun typeToSearch(text: String) {
        searchInputSelector.waitFindObject().text = text
    }

    fun checkHintProductName(expectedHint: String) {
        assertTrue(
            "Name hint is wrong",
            byText(expectedHint).waitFindObject().isEnabled
        )
    }

    fun checkHintProductPrice(expectedHint: String) {
        assertTrue(
            "Price hint is wrong",
            byText(expectedHint).waitFindObject().isEnabled
        )
    }
}