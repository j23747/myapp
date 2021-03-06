package com.myprojects.myapplication
//package arb.test.text.input.layout



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity() {


//    private var contactEditText = TextInputEditText(contactEditText)? = null
//      private var contactEditText = TextInputEditText? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

//        contactEditText = findViewById<TextInputEditText>(R.id.contact_name)
//        contactEditText = findViewById<TextInputEditText>(R.id.contact_name)
//        contactEditText = findViewById<TextInputEditText>(R.id.contact_name)
//        contactEditText = findViewById<TextInputEditText>(R.id.contact_name)



        val previewButton: Button = findViewById(R.id.button_preview)
        previewButton.setOnClickListener {

//            Toast.makeText(this, "My button works!", Toast.LENGTH_SHORT).show()

            onPreviewClicked()


        }

    }

    private fun onPreviewClicked() {
        val contactEditText = findViewById<TextInputEditText >(R.id.contact_name)
        val contactNumberText = findViewById<TextInputEditText>(R.id.contact_number)
        val testString = contactEditText.text.toString() + ", " + contactNumberText.text.toString()
        Toast.makeText(this, testString, Toast.LENGTH_SHORT).show()



    }
}