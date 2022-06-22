package com.ilaydabykakova.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import java.util.HashMap
import java.util.HashSet

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Variables && Constant

        //Integer
        println("----------- Integer -----------")
        var x = 5
        var y = 4

        println(x * y)

        var age = 35
        var result = age / 7 *5
        println(result)

        //Defining
        var myInteger : Int

        //Intialize
        myInteger = 10
        myInteger = 20

        //Intialize && Define
        val a : Int = 23

        println(a/2)

        // Long
        var myLong : Long = 100

        //Double & Float
        println("----------- Double & Float -----------")
        val pi = 3.14
        println(pi * 2.0)

        val myFloat = 3.14f
        println(myFloat * 2.0)

        var myAge : Double
        myAge = 23.0
        println(myAge/2)

        //camelCase
        //snake_case

        //String
        println("----------- String -----------")

        val myString = "ilayda büyükakova"
        val name = "Linda"
        val surname = "James"

        val fullname = name +" "+ surname

        println(fullname)

        val larsName : String = "Lars"
        //First Letter Upper
        println(myString.capitalize())

        //Boolean
        println("----------- Boolean -----------")

        var myBoolean: Boolean = true
        myBoolean = false

        var isAlive = true

        // <
        // >
        // <=
        // >=
        // ==
        // !=
        // && -> AND
        // || -> OR

        println(3 < 5)
        println(6 < 3)
        println(3 == 3)
        println(4 !=5)

        //Conversion
        val myNumber = 5
        var myLongNumber = myNumber.toLong()
        println(myLongNumber)

        var input = "10"
        var inputInteger = input.toInt()
        println(inputInteger * 2 )

        //Collections
        //Arrays
        println("----------- Arrays -----------")
        val myArray = arrayOf("Apple","Orange","Banana")

        //index
        println(myArray[0])
        myArray[0] = "Red Apple"
        println(myArray[0])

        myArray.set(1,"Orange Orange")
        println(myArray[1])

        val numberArray = arrayOf(1,2,3,4,5)
        println(numberArray[3])
        /* println(numberArray[5])// Not seen, App is not executable (Error message : ArrayIndexOutOfBoundsException)*/

        val myNewArray = doubleArrayOf(1.0,2.0,3.0)
        println(myNewArray[1])

        val mixedArray = arrayOf("İlayda",3)
        println(mixedArray[0])
        println(mixedArray[1])

        // List - ArrayList 
        println("----------- List -----------")

        val myMusician = arrayListOf<String>("James","Linda")
        myMusician.add("Lars")
        println(myMusician[2])
        myMusician.add(0,"Rob")
        println(myMusician[0])

        val myArrayList = ArrayList<Int>()
        myArrayList.add(1)
        myArrayList.add(200)

        val myMixedArrayList = ArrayList<Any>()
        myMixedArrayList.add("İlayda")
        myMixedArrayList.add(12.25)
        myMixedArrayList.add(true)

        println(myMixedArrayList[0])
        println(myMixedArrayList[1])
        println(myMixedArrayList[2])

        //Set
        println("----------- Set -----------")

        val myExampleArray = arrayOf(1,1,2,3,4)
        //Same element can visible in the arrays
        println("element 1: ${myExampleArray[0]}")
        println("element 2: ${myExampleArray[1]}")

        val mySet = setOf<Int>(1,1,2,3,4)

        println(mySet.size)

        //For Each
        mySet.forEach { println(it)}

        val mySetString = HashSet<String>()
        mySetString.add("İlayda")
        mySetString.add("İlayda")
        //Output: 1 not contain same element
        println(mySetString.size)

        //Map / HashMap
        println("----------- Map / HashMap -----------")

        //Key - Value

        val fruitArray = arrayOf("Apple")
        val caloriesArray = arrayOf(100,150)
        println("${fruitArray[0]} : ${caloriesArray[0]}")

        val fruitCalorieMap = hashMapOf<String,Int>()
        fruitCalorieMap.put("Apple",100)
        fruitCalorieMap.put("Banana",150)
        println(fruitCalorieMap["Apple"])

        val myHashMap = HashMap<String,String>()
        myHashMap.put("İlayda","Büyükakova")
        println(myHashMap["İlayda"])

        val myNewMap = hashMapOf<String,Int>("A" to 1,"B" to 2,"C" to 3)
        println(myNewMap["C"])

        //Operator
        println("----------- Operators -----------")
        var m = 5
        println(m)
        m = m+1
        println(m)
        m++
        println(m)
        m--
        println(m)

        var n = 7

        println(n > m)

        //&&
        //||

        println(n>m && 2 < 1)
        println(n>m || 2 < 1)

        println(10+2)
        println(10-2)
        println(10/2)
        println(10*2)

        //Remainder
        println(10%4)

        //If Control
        println("----------- If Control -----------")

        val myNumberAge = 52

        if (myNumberAge < 30){
            println("< 30")
        }else if (myNumberAge >= 30 && myNumberAge < 40){
            println("30 - 40")
        }else if (myNumberAge >= 30 && myNumberAge < 50){
            println("30 - 50")
        }else {
            println(">= 50")
        }

        //Switch - When
        println("----------- Switch -----------")

        val day = 3
        var dayString = ""

        /*
        if (day == 1 ){
            println("Monday")
        }else if (day == 2){
            println("Tuesday")
        }else if (day == 3){
            println("Wednesday")
        }
        println(dayString)
         */

        when(day){
            1 -> dayString = "Monday"
            2 -> dayString = "Tuesday"
            3 -> dayString = "Wednesday"
            else -> dayString = ""
        }
        println(dayString)

        //Loops

        //For Loop
        println("----------- For Loop -----------")

        val myArrayOfNumbers = arrayOf(12,15,18,21,24,27,30,33)


        for ( number in myArrayOfNumbers){
            var myNewNumber = number / 3 * 5;
            println("$myNewNumber")
        }
        //Complex structure
        for ( item in myArrayOfNumbers.indices){
            var myNewNumber = myArrayOfNumbers[item] / 3 * 5;
            println("$item : $myNewNumber")
        }

        for ( b in 0..9) {
            println(b)
        }

        val myStringArrayList = ArrayList<String>()
        myStringArrayList.add("İlayda")
        myStringArrayList.add("Linda")
        myStringArrayList.add("James")

        for (str in myStringArrayList){
            println(str)
        }

        myStringArrayList.forEach { println(it) }

        //While Loop
        println("----------- While Loop -----------")

        var j = 0
        while (j < 10){
            println(j)
            j++
        }











    }
}