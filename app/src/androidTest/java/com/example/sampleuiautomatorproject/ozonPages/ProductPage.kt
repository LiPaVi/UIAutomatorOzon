package com.example.sampleuiautomatorproject.ozonPages

import androidx.test.uiautomator.UiScrollable
import androidx.test.uiautomator.UiSelector
import com.example.sampleuiautomatorproject.util.*
import com.example.sampleuiautomatorproject.util.ext.waitFindObject

class ProductPage {
    private val toFavourite = byContentDesk("В избранное")
    private val favourites = byContentDesk("Избранное")
    private val feedbackButton = byUIText("Написать отзыв")
    private val scrollableElement: UiSelector = byUIResourseId("ru.ozon.app.android:id/listRv")

    fun clickHeart() {
        toFavourite.waitFindObject().click()
    }

    fun gotoFavourites() {
        favourites.waitFindObject().click()
    }

    fun scrollToFeedback() {
        val appView = UiScrollable(scrollableElement.scrollable(true))
        appView.scrollIntoView(feedbackButton)
    }

    fun clickFeedbackButton() {
        device.findObject(feedbackButton).clickAndWaitForNewWindow()
    }
}