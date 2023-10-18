package com.youssefsapplication.app.modules.enseignant.`data`.model

import com.youssefsapplication.app.R
import com.youssefsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EnseignantRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDetailProfil: String? = MyApp.getInstance().resources.getString(R.string.lbl_detail_profil)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt72100: String? = MyApp.getInstance().resources.getString(R.string.lbl_72_100)

)
