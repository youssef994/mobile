package com.youssefsapplication.app.modules.ajoutclasse.`data`.model

import com.youssefsapplication.app.R
import com.youssefsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AjoutClasseModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAjoutclasse: String? = MyApp.getInstance().resources.getString(R.string.lbl_ajout_classe)

)
