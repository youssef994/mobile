package com.youssefsapplication.app.modules.profile.`data`.model

import com.youssefsapplication.app.R
import com.youssefsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUserfullname: String? = MyApp.getInstance().resources.getString(R.string.lbl_mahmoud_sayed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.msg_mahmoud_gmail_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccountSetting: String? =
      MyApp.getInstance().resources.getString(R.string.msg_account_setting)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccountSecurit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_account_securit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailnotificat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_email_notificat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLearningremind: String? =
      MyApp.getInstance().resources.getString(R.string.msg_learning_remind)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSupport: String? = MyApp.getInstance().resources.getString(R.string.lbl_support)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAboutSinau: String? = MyApp.getInstance().resources.getString(R.string.lbl_about_sinau)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrequentlyaske: String? =
      MyApp.getInstance().resources.getString(R.string.msg_frequently_aske)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShareFirecour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_share_fire_cour)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccount: String? = MyApp.getInstance().resources.getString(R.string.lbl_account)

)
