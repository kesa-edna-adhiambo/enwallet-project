package com.example.enwalletassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.enwalletassessment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recycle.layoutManager = LinearLayoutManager(this)
        displayEwallet()
    }

    fun displayEwallet(){
        val enwallet1 = Enwallet("Salary","KES 40000","1 July 2024","")
        val enwallet2 = Enwallet("Rent","KES 16000","2 July 2024","")
        val  enwallet3 = Enwallet("Dividents","KES 2400","4 July 2024","")
        val enwallet4 = Enwallet("Electricity","KES 800","5 July 2024","")
        val enwallet5 = Enwallet("Internet","KES 2500","5 July 2024","")
        val enwallet6 = Enwallet("Shopping","KES 3500","5 July 2024","")
        val enwallet7 = Enwallet("Bus fare","KES 500","11 July 2024","")
        val enwallet8 = Enwallet("Water bill","KES 800","12 July 2024","")

        val myWallet = listOf(enwallet1,enwallet2,enwallet3,enwallet4,enwallet5,enwallet6,enwallet7,enwallet8)

        val enwalletAdapter = EnwalletAdapter(myWallet)
        binding.recycle.adapter = enwalletAdapter

    }
}