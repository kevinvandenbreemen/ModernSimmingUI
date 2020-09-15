package com.vandenbreemen.modernsimmingui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.vandenbreemen.modernsimmingapp.subscriber.SimContentProviderInteractor

class MainActivity : AppCompatActivity() {

    private lateinit var interactor: SimContentProviderInteractor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        interactor = SimContentProviderInteractor(applicationContext)

        setContentView(R.layout.activity_main)

        interactor.groupNamesLiveData.observe(this, Observer {
            Log.i(javaClass.simpleName, it.toString())
        })


    }

    override fun onResume() {
        super.onResume()
        interactor.fetchGroupNames()
    }
}