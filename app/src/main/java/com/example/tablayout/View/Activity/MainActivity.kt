package com.example.tablayout.View.Activity


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.tablayout.R
import com.example.tablayout.View.Fragment.TabFragment2


class MainActivity : AppCompatActivity() {


    private val Tag = "Home"
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mFragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = mFragmentManager.beginTransaction()
        fragmentTransaction.replace(
            R.id.frame,
            TabFragment2(), Tag).commit()
    }
}
