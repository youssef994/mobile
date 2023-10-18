package com.youssefsapplication.app.modules.ajoutetudiant.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.youssefsapplication.app.modules.ajoutetudiant.`data`.model.AjoutEtudiantModel
import org.koin.core.KoinComponent

class AjoutEtudiantVM : ViewModel(), KoinComponent {
  val ajoutEtudiantModel: MutableLiveData<AjoutEtudiantModel> =
      MutableLiveData(AjoutEtudiantModel())

  var navArguments: Bundle? = null
}
