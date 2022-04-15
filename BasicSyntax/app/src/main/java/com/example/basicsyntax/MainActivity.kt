package com.example.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        Log.d("Halo", "로그를 출력합니다. method = Log.d")

        var myName = "Sungmin"
        var myAge: Int
        myAge = 27
        myAge++
        Log.d("BasicSyntaxx", "myName=$myName,myAge=$myAge")

        val roadName = "국제금융로"
        val address = roadName + "8길"
        */

        var myNum = "1,2,3,4,5,6"
        var result = "1,2,3,4,6,6"
        if (true){
            Log.d("LOTTO","당첨!")
        }
        else{
            Log.d("LOTTO","낙첨ㅠㅠ")
        }

    }
}