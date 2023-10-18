package com.youssefsapplication.app.modules.authorprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.youssefsapplication.app.modules.authorprofile.`data`.model.AuthorProfileModel
import org.koin.core.KoinComponent

class AuthorProfileVM : ViewModel(), KoinComponent {
  val authorProfileModel: MutableLiveData<AuthorProfileModel> =
      MutableLiveData(AuthorProfileModel())

  var navArguments: Bundle? = null
}
