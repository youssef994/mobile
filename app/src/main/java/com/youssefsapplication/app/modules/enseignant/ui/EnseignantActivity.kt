package com.youssefsapplication.app.modules.enseignant.ui

import android.view.View
import androidx.activity.viewModels
import com.youssefsapplication.app.R
import com.youssefsapplication.app.appcomponents.base.BaseActivity
import com.youssefsapplication.app.databinding.ActivityEnseignantBinding
import com.youssefsapplication.app.modules.enseignant.`data`.model.EnseignantRowModel
import com.youssefsapplication.app.modules.enseignant.`data`.viewmodel.EnseignantVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EnseignantActivity : BaseActivity<ActivityEnseignantBinding>(R.layout.activity_enseignant) {
  private val viewModel: EnseignantVM by viewModels<EnseignantVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val enseignantAdapter = EnseignantAdapter(viewModel.enseignantList.value?:mutableListOf())
    binding.recyclerEnseignant.adapter = enseignantAdapter
    enseignantAdapter.setOnItemClickListener(
    object : EnseignantAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : EnseignantRowModel) {
        onClickRecyclerEnseignant(view, position, item)
      }
    }
    )
    viewModel.enseignantList.observe(this) {
      enseignantAdapter.updateData(it)
    }
    binding.enseignantVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerEnseignant(
    view: View,
    position: Int,
    item: EnseignantRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ENSEIGNANT_ACTIVITY"

  }
}
