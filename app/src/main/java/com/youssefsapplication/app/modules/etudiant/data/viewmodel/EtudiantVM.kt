package com.youssefsapplication.app.modules.etudiant.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.youssefsapplication.app.modules.etudiant.`data`.model.EtudiantModel
import org.koin.core.KoinComponent

class EtudiantVM : ViewModel(), KoinComponent {
  val etudiantModel: MutableLiveData<EtudiantModel> = MutableLiveData(EtudiantModel())

  var navArguments: Bundle? = null
}
