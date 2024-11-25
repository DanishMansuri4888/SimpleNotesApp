package com.mymasjid.savepref
import android.content.Context
import android.content.SharedPreferences

object UserPreferences {

    private const val PREFS_NAME = "UserPrefs"
    private const val KEY_USER_TEXT = "userText"

    fun saveUserText(context: Context, userText: String) {
        val sharedPreferences: SharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = sharedPreferences.edit()

        editor.putString(KEY_USER_TEXT, userText)


        editor.apply()
    }


    fun getUserText(context: Context): String? {
        val sharedPreferences: SharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        return sharedPreferences.getString(KEY_USER_TEXT, "")
    }
}
