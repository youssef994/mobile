package com.youssefsapplication.app.modules.ajoutetudiant.`data`.model

import com.youssefsapplication.app.R
import com.youssefsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AjoutEtudiantModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAjoutetudiant: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ajout_etudiant)

)
