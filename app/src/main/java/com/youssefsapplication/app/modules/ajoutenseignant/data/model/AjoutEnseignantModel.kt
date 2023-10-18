package com.youssefsapplication.app.modules.ajoutenseignant.`data`.model

import com.youssefsapplication.app.R
import com.youssefsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AjoutEnseignantModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAjoutenseignan: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ajout_enseignan)

)
