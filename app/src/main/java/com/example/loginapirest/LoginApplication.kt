package com.example.loginapirest

import android.app.Application

class LoginApplication: Application() {

    //Patron singleton
    companion object{
        lateinit var reqResAPI: ReqResAPI
    }

    override fun onCreate() {
        super.onCreate()

        //Volley
        reqResAPI = ReqResAPI.getInstance(this)
    }
}