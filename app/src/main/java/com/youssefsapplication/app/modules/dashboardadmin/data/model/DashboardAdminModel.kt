package com.youssefsapplication.app.modules.dashboardadmin.`data`.model

import com.youssefsapplication.app.R
import com.youssefsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DashboardAdminModel(
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
  var txtAdmin: String? = MyApp.getInstance().resources.getString(R.string.lbl_admin)
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
