package com.youssefsapplication.app.modules.ajoutclub.`data`.model

import com.youssefsapplication.app.R
import com.youssefsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AjoutClubModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAjoutclub: String? = MyApp.getInstance().resources.getString(R.string.lbl_ajout_club)

)
