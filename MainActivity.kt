package com.example.task4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

var list = mutableListOf<Anymals>()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list.add(HerbivoreAnimal("Parrot", 1))
        val add = list.add(HerbivoreAnimal("Humster", 2))
        list.add(CarnivorousAnimal"Tiger", "Big ca(t family"))
        list.add(CarnivorousAnimal("Wild Fox", "Dog Family"))


    }
    data class CarnivorousAnimal(var name: String, var type: String)
    data class HerbivoreAnimal(var name: String, var age: Int)
}