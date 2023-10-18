package com.youssefsapplication.app.modules.ajoutenseignant.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.youssefsapplication.app.modules.ajoutenseignant.`data`.model.AjoutEnseignantModel
import org.koin.core.KoinComponent

class AjoutEnseignantVM : ViewModel(), KoinComponent {
  val ajoutEnseignantModel: MutableLiveData<AjoutEnseignantModel> =
      MutableLiveData(AjoutEnseignantModel())

  var navArguments: Bundle? = null
}
