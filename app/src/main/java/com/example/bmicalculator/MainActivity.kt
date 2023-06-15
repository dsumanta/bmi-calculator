package com.example.bmicalculator

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import kotlin.math.log

class MainActivity : ComponentActivity() {
    override fun onStart() {
        super.onStart()
        Log.i("logname ","onstart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("logname","onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("logname","onresume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("logname","Onpause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("logname","onstop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("logname","Ondestroy")
    }
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        Log.i("Logname","oncreate")
        setContentView(R.layout.activity_main)
        var textView: TextView = findViewById(R.id.result)
        var weightEditText: EditText = findViewById(R.id.weight)
        var heightEditText: EditText = findViewById(R.id.height)
        var button: Button = findViewById(R.id.btn)

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                val height: Double ? = heightEditText.text.toString().toDouble()
                val weight: Double ? = weightEditText.text.toString().toDouble()

                if (height != null && weight != null && height != 0.0) {
                    val bmi: Double = weight / height
                    if (bmi > 25) {
                        textView.text = "You are overweighted"
                    } else {
                        textView.text = "You are healthy"
                    }
                }
                else{
                    textView.text="Please Enter something"
                }
            }
        })
    }
}
