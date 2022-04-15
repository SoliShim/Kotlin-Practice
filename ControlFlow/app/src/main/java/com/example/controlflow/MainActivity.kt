package com.example.controlflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        var ball = 4
        if (ball > 3) {
            Log.d("CF", "4볼로 출루합니다")
        } else {
            Log.d("CF", "타석에서 다음 타구를 기다립니다")
        }

        var a = 5
        var b = 3

        //case1
        var bigger = if (a > b) a else b //변수에 직접 바로 값 대입!
        //case2
        bigger = if (a > b) {
            var c = 30
            a
        } else {
            b
        }

        var now =10
        when(now){
            8 -> {
                Log.d("when","현재 시간은 8시입니다")
            }
            9 -> {
                Log.d("when","현재 시간은 9시입니다")
            }
            else -> {
                Log.d("when","8시도 아니고 9시도 아닙니다")
            }
        }


        var students = IntArray(10)

        var dayArray = arrayOf("MON", "TUE", "WED")

        Log.d("log","${dayArray[1]}, ${dayArray.get(0)}")


        var list = mutableListOf("MON", "TUE", "WED")

        list.add("TUE")
        var variable = list.get(1)
        Log.d("log", "$variable")
        list.removeAt(1)
        variable = list.get(1)
        Log.d("log", "after$variable")
        var sizze = list.size
        Log.d("log","$sizze"`)


        var set = mutableSetOf<String>()
        set.add("JAN")
        set.add("FEB")
        set.add("MAR")
        Log.d("log","$set")
        set.remove("FEB")
        Log.d("log","$set")
        */

        /*
        for (i in 10 downTo 6){
            Log.d("log","hello")
        }


        fun square(x: Int): Int { // fun 함수이름(파라미터) : 리턴타입
            return x * x
        }

        fun printSum(x: Int, y: Int) {
            Log.d("fun", "x+y=${x + y}")
        }
        printSum(2,3)
        Log.d("fun","${square(3)}")


        fun new(name1:String="hlkk",name2:String,name3:Double=65.5){
            Log.d("fun","이름$name1\n\n$name2\n$name3")
        }
        new(name2="hello", name1="bte")

        var sum=0;
        fun sumall(num: Int): Int {

            //for(num in 1..num){
            //    sum+=num
            //}

            return (num*(num+1))/2
        }

        Log.d("log","${sumall(10)}")
        */


    }
}