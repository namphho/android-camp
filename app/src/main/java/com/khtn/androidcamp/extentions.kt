package com.khtn.androidcamp

import android.app.Activity
import android.view.View
import android.view.inputmethod.InputMethodManager


/**
 * Created by Huu Hoang on 5/9/19.
 */


/**
 * Hide keyboard immediately
 */
fun Activity.hideKeyboard() {
    val imm = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    //Find the currently focused view, so we can grab the correct window token from it.
    var view = currentFocus
    //If no view currently has focus, create a new one, just so we can grab a window token from it
    if (view == null) {
        view = View(this)
    }
    imm.hideSoftInputFromWindow(view.windowToken, 0)
}