package com.ieum.refbybook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ieum.refbybook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.btnSay.setOnClickListener {
            binding.textSay.text = "Hello Kotlin!!"
        }

        /** MAP **/
        var map = mutableMapOf<String, String>()
        map.put("k1", "v1")
        map.put("k2", "v3")
        map.put("k3", "v3")
        map.put("k3", "v4")
        //map.set("k2","v16") Error


        /** For **/
        var array = arrayOf("jan", "feb", "march", "april")
        for (index in 0 until array.size step 2){
            Log.d("For"," array is ${array.get(index)}")
        }

        for (index in array){ // not use 'step', only can be use with index
            Log.d("For"," array2 is ${index}")
        }


        /** while **/
        var game = 1
        var match = 6
        do {
            Log.d("while", "This game is ${game}. Left ${match-game} games")
            game = game + 1
        } while (game < match)

        /** while break **/
        for (index in 1..10) {
            Log.d("break", "This index is ${index}")
            if (index > 5) break // 1,2,3,4,5,6
        }

        /** while continue **/
        for (except in 1..10) {
            if (except > 3 && except < 8) continue
            Log.d("continue", "This index is ${except}") // 1,2,3,8,9,10
        }

    }
}