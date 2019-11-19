package com.example.sampleuiautomatorproject.ozonPages

import com.example.sampleuiautomatorproject.util.byContentDesk
import com.example.sampleuiautomatorproject.util.ext.waitFindObject

class ProductPage {
    private val toFavourite = byContentDesk("В избранное")
    private val favourites = byContentDesk("Избранное")

    fun clickToFavourites() {
        toFavourite.waitFindObject().click()
    }

    fun clickFavourites() {
        favourites.waitFindObject().click()
    }
}