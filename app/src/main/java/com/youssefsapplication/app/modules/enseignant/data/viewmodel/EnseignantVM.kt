package com.youssefsapplication.app.modules.enseignant.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.youssefsapplication.app.modules.enseignant.`data`.model.EnseignantModel
import com.youssefsapplication.app.modules.enseignant.`data`.model.EnseignantRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EnseignantVM : ViewModel(), KoinComponent {
  val enseignantModel: MutableLiveData<EnseignantModel> = MutableLiveData(EnseignantModel())

  var navArguments: Bundle? = null

  val enseignantList: MutableLiveData<MutableList<EnseignantRowModel>> =
      MutableLiveData(mutableListOf())
}
