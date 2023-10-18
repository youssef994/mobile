package com.youssefsapplication.app.modules.ajoutclasse.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.youssefsapplication.app.modules.ajoutclasse.`data`.model.AjoutClasseModel
import org.koin.core.KoinComponent

class AjoutClasseVM : ViewModel(), KoinComponent {
  val ajoutClasseModel: MutableLiveData<AjoutClasseModel> = MutableLiveData(AjoutClasseModel())

  var navArguments: Bundle? = null
}
