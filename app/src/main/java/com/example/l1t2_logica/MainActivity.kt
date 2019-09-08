package com.example.l1t2_logica

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    /**
     * Set the initial (UI) state of the app; adds listeners
     */
    private fun initViews() {
        btnSubmit.setOnClickListener {
            checkAnswers()
        }
    }

    /**
     * Checks if the user submitted correct answers and displays a toast message accordingly.
     */
    @SuppressLint("DefaultLocale")
    private fun checkAnswers() {
        val answer1: String = etAnswer1.text.toString().toUpperCase()
        val answer2: String = etAnswer2.text.toString().toUpperCase()
        val answer3: String = etAnswer3.text.toString().toUpperCase()
        val answer4: String = etAnswer4.text.toString().toUpperCase()

        val incorrectString: String = getString(R.string.incorrect)

        if (answer1 != getString(R.string.t)) {
            return Toast.makeText(this, incorrectString, Toast.LENGTH_LONG).show()
        }
        if (answer2 != getString(R.string.f)) {
            return Toast.makeText(this, incorrectString, Toast.LENGTH_LONG).show()
        }
        if (answer3 != getString(R.string.f)) {
            return Toast.makeText(this, incorrectString, Toast.LENGTH_LONG).show()
        }
        if (answer4 != getString(R.string.f)) {
            return Toast.makeText(this, incorrectString, Toast.LENGTH_LONG).show()
        }
        return Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()
    }

}