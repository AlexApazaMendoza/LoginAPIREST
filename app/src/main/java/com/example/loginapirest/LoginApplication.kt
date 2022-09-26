package com.example.stores

import android.app.Application
import com.example.stores.common.database.ReqResAPI

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