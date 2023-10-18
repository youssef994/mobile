package com.youssefsapplication.app.modules.dashboardadmin.`data`.model

import com.youssefsapplication.app.R
import com.youssefsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GridcomputerRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEtudiant: String? = MyApp.getInstance().resources.getString(R.string.lbl_etudiant2)

)
