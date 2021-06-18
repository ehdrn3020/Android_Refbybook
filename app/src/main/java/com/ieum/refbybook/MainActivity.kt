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

        /** Function **/
        fun newFunction(name:String, age:Int = 29, weight:Double =65.5) {
            Log.d("fun","name value is ${name}")
            Log.d("fun","age value is ${age}")
            Log.d("fun","weight value is ${weight}")
        }
        newFunction("Hellow", weight = 75.5)


        /** Class **/
        class Pig {
            var name : String = "Pinky"  //property
            fun printName() {           //method
                Log.d("class","Pig name is ${name}")       //멤버변수
            }
        }
        var pig = Pig()
        pig.name = "Pooh"
        pig.printName()

        //data class
        data class UserData(val name:String, var age:Int)
        var userData = UserData("jsony",45)
        Log.d("dataclass","userData is ${userData.toString()}")
        var newData = userData.copy()
        Log.d("dataclass","newData is ${newData}")

        //상속
        open class Parent {
            var hello: String = "Hellllow"
            fun sayHello() {
                Log.d("ih","${hello}")
            }
        }
        class Child:Parent() {
            fun myHello(){
                hello = "Hello!"
                sayHello()
            }
        }
        var child = Child()
        child.sayHello()

        // override
        open class BaseClass {
            open fun opened() {}
        }
        class ChildClass: BaseClass() {
            override fun opened() {}
        }

        //extention 거의 메서드 확장시 사용
//        fun testStringExtension() {
//            var original = "hellow"
//            var added = "Guys~"
//            Log.d("ex", "ex ${original.plus(added)}")
//        }
//        fun String.plus(word:String): String {
//            return this+word
//        }
//    }
}