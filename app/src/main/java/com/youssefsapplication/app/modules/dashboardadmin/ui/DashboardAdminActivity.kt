package com.youssefsapplication.app.modules.dashboardadmin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.youssefsapplication.app.R
import com.youssefsapplication.app.appcomponents.base.BaseActivity
import com.youssefsapplication.app.databinding.ActivityDashboardAdminBinding
import com.youssefsapplication.app.modules.dashboardadmin.`data`.model.GridcomputerRowModel
import com.youssefsapplication.app.modules.dashboardadmin.`data`.viewmodel.DashboardAdminVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DashboardAdminActivity :
    BaseActivity<ActivityDashboardAdminBinding>(R.layout.activity_dashboard_admin) {
  private val viewModel: DashboardAdminVM by viewModels<DashboardAdminVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridcomputerAdapter =
    GridcomputerAdapter(viewModel.gridcomputerList.value?:mutableListOf())
    binding.recyclerGridcomputer.adapter = gridcomputerAdapter
    gridcomputerAdapter.setOnItemClickListener(
    object : GridcomputerAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridcomputerRowModel) {
        onClickRecyclerGridcomputer(view, position, item)
      }
    }
    )
    viewModel.gridcomputerList.observe(this) {
      gridcomputerAdapter.updateData(it)
    }
    binding.dashboardAdminVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerGridcomputer(
    view: View,
    position: Int,
    item: GridcomputerRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DASHBOARD_ADMIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DashboardAdminActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
