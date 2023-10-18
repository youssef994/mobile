package com.youssefsapplication.app.modules.dashboardadmin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.youssefsapplication.app.modules.dashboardadmin.`data`.model.DashboardAdminModel
import com.youssefsapplication.app.modules.dashboardadmin.`data`.model.GridcomputerRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DashboardAdminVM : ViewModel(), KoinComponent {
  val dashboardAdminModel: MutableLiveData<DashboardAdminModel> =
      MutableLiveData(DashboardAdminModel())

  var navArguments: Bundle? = null

  val gridcomputerList: MutableLiveData<MutableList<GridcomputerRowModel>> =
      MutableLiveData(mutableListOf())
}
