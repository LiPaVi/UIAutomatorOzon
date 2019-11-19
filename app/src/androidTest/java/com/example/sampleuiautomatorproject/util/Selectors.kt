package com.example.sampleuiautomatorproject.util

import androidx.test.uiautomator.By

fun byStringRes(stringRes: String) = By.res(stringRes)

fun byText(text: String) = By.text(text)

fun byClass(clazz: String) = By.clazz(clazz)

fun byContentDesk(content: String) = By.desc(content)

fun byResourceId(id: String) = By.res(id)
