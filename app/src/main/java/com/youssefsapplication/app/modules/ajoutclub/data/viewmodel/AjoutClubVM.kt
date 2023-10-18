package com.youssefsapplication.app.modules.ajoutclub.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.youssefsapplication.app.modules.ajoutclub.`data`.model.AjoutClubModel
import org.koin.core.KoinComponent

class AjoutClubVM : ViewModel(), KoinComponent {
  val ajoutClubModel: MutableLiveData<AjoutClubModel> = MutableLiveData(AjoutClubModel())

  var navArguments: Bundle? = null
}
