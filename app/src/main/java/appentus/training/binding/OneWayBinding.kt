package appentus.training.binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class OneWayBinding : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(
            R.layout.activity_main)
        val button = findViewById<Button>(R.id.submit_button)
        button.setOnClickListener {
            displayGreeting()
        }
    }

    private fun displayGreeting() {
        val messageView = findViewById<TextView>(R.id.greeting_text_view)
        val nameText = findViewById<EditText>(R.id.name_edit_text)

        val message = "Hello! "+ nameText.text
        messageView.text = message
    }
}
