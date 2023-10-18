package com.youssefsapplication.app.modules.authorprofile.`data`.model

import com.youssefsapplication.app.R
import com.youssefsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AuthorProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSarahW: String? = MyApp.getInstance().resources.getString(R.string.lbl_sarah_w)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt4SAEThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_4sae3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_liste_des_tudi)

)
