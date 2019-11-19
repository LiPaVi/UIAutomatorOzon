package com.example.sampleuiautomatorproject.ozonPages

import com.example.sampleuiautomatorproject.util.byContentDesk
import com.example.sampleuiautomatorproject.util.byStringRes
import com.example.sampleuiautomatorproject.util.byText
import com.example.sampleuiautomatorproject.util.ext.waitFindObject
import org.junit.Assert

class SearchPage {
    private val searchInputSelector = byStringRes("ru.ozon.app.android:id/search_src_text")

    fun clickHint(contentDesk: String) {
        byContentDesk(contentDesk).waitFindObject().click()
    }

    fun typeToSearch(text: String) {
        searchInputSelector.waitFindObject().text = text
    }

    fun checkHintProductName(expectedHint: String) {
        Assert.assertTrue(
            "Name hint is wrong",
            byText(expectedHint).waitFindObject().isEnabled
        )
    }

    fun checkHintProductPrice(expectedHint: String) {
        Assert.assertTrue(
            "Price hint is wrong",
            byText(expectedHint).waitFindObject().isEnabled
        )
    }
}