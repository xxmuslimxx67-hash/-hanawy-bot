package com.hanawy.bot

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.view.Gravity

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(32, 32, 32, 32)

        val title = TextView(this)
        title.text = "حناوي ❤️"
        title.textSize = 30f
        title.gravity = Gravity.CENTER

        val status = TextView(this)
        status.text = "حناوي جاهز للتجربة"
        status.textSize = 18f
        status.gravity = Gravity.CENTER

        val button = Button(this)
        button.text = "بدء التجربة"
        button.setOnClickListener {
            status.text = "حناوي شغال! 🔥"
        }

        layout.addView(title)
        layout.addView(status)
        layout.addView(button)

        setContentView(layout)
    }
}
