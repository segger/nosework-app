package com.abilia.noseworkprotocol

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val noseworkServer = NoseworkServer()

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_protocol -> {
                message.setText("Protokoll")
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_result -> {
                message.setText("Resultat")
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_admin -> {
                message.setText("Admin")
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        event_spinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, arrayOf("En stor bil","Granar"))
        participant_spinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, arrayOf("Alpha & Omega","Musse & Pluto", "Piff & Puff", "Puff & Piff"))

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    fun saveProtocol(view: View) {

    }
}
