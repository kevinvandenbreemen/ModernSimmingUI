package com.vandenbreemen.modernsimmingui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.lifecycle.Observer
import com.vandenbreemen.modernsimmingapp.subscriber.SimContentProviderInteractor

class MainActivity : AppCompatActivity() {

    private lateinit var interactor: SimContentProviderInteractor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        interactor = SimContentProviderInteractor(applicationContext)

        setContentView(R.layout.activity_main)

        interactor.groupNamesLiveData.observe(this, Observer {
            Toast.makeText(this, it.toString(), LENGTH_SHORT).show()
        })


    }

    override fun onResume() {
        super.onResume()
        interactor.fetchGroupNames()
    }
}