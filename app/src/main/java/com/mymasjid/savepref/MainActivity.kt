package com.mymasjid.savepref
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var userInputEditText: EditText
    private lateinit var saveButton: Button
    private lateinit var last_Save_Data : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        userInputEditText = findViewById(R.id.userInputEditText)
        saveButton = findViewById(R.id.saveButton)
        last_Save_Data = findViewById(R.id.last_data)

        val savedText = UserPreferences.getUserText(this)
        last_Save_Data.setText(savedText)


        saveButton.setOnClickListener {
            val userText = userInputEditText.text.toString()
            UserPreferences.saveUserText(this, userText)
            Toast.makeText(this, "Notes Updated", Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "Restart App", Toast.LENGTH_SHORT).show()
        }
    }
}
