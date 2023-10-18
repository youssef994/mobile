package com.youssefsapplication.app.modules.enseignant.`data`.model

import com.youssefsapplication.app.R
import com.youssefsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EnseignantModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_dashboard)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSarahW: String? = MyApp.getInstance().resources.getString(R.string.lbl_sarah_w)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnseignente: String? = MyApp.getInstance().resources.getString(R.string.lbl_enseignente)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPresence: String? = MyApp.getInstance().resources.getString(R.string.lbl_presence)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExcel: String? = MyApp.getInstance().resources.getString(R.string.lbl_excel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUploadCours: String? = MyApp.getInstance().resources.getString(R.string.lbl_upload_cours)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDetailProfile: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_detail_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)

)
