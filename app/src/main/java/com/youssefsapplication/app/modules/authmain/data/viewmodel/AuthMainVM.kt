package com.youssefsapplication.app.modules.authmain.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.youssefsapplication.app.modules.authmain.`data`.model.AuthMainModel
import org.koin.core.KoinComponent

class AuthMainVM : ViewModel(), KoinComponent {
  val authMainModel: MutableLiveData<AuthMainModel> = MutableLiveData(AuthMainModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount
}
