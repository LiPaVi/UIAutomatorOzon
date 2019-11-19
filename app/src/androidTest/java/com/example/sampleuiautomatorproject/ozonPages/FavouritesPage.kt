package com.example.sampleuiautomatorproject.ozonPages

import com.example.sampleuiautomatorproject.util.byResourceId
import com.example.sampleuiautomatorproject.util.byText
import com.example.sampleuiautomatorproject.util.ext.waitFindObject
import org.junit.Assert.assertTrue

class FavouritesPage {
    private val title = byText("Избранное")
    private val toolbar = byResourceId("ru.ozon.app.android:id/toolbarTb")

    fun findProductInFavourites(productName: String) {
        assertTrue(
            "Can't find in favourites $productName",
            byText(productName).waitFindObject().isEnabled
        )
    }

    fun checkTitle() {
        assertTrue(toolbar.hasChild(title).waitFindObject().isEnabled)
    }
}