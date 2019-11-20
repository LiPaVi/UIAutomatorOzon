package com.example.sampleuiautomatorproject.util

import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiSelector

fun byStringRes(stringRes: String) = By.res(stringRes)

fun byText(text: String) = By.text(text)

fun byContentDesk(content: String) = By.desc(content)

fun byResourceId(id: String) = By.res(id)

fun byUIResourseId(id: String) = UiSelector().resourceId(id)

fun byUIText(text: String) = UiSelector().text(text)
