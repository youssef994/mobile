package com.youssefsapplication.app.modules.authmain.`data`.model

import com.youssefsapplication.app.R
import com.youssefsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AuthMainModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLearnfromthe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_learn_from_the)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHavingtrouble: String? =
      MyApp.getInstance().resources.getString(R.string.msg_having_trouble)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignup: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)

)
