package com.example.companionobjectsapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    lateinit var LLO: ConstraintLayout
    lateinit var ET: EditText
    lateinit var Btn: Button
    lateinit var TV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Log.d(Cons.MAIN_TAG, "onCreate: ")

        LLO = findViewById(R.id.ConsLLO)
        TV = findViewById(R.id.TV)
        ET = findViewById(R.id.ET)
        Btn  = findViewById(R.id.Btn)

        Btn.setOnClickListener(object : View.OnClickListener {

            override fun onClick(p0: View?) {
                var DAYorNIGHT = ET.text?.toString()
                when(DAYorNIGHT?.toLowerCase()){
                    "day"->{val time = DayNight()
                        time.changeBackground(LLO,DayNight.day)
                        ET.setTextColor(Color.BLACK)
                        TV.setTextColor(Color.BLACK)
                    }
                    "night"->{val time = DayNight()
                        time.changeBackground(LLO,DayNight.night)
                        ET.setTextColor(Color.WHITE)
                        TV.setTextColor(Color.WHITE)
                    }
                }
            }

        })

    }//end oncreate
}//end class